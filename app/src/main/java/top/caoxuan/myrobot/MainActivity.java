package top.caoxuan.myrobot;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONValidator;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editText;
    private Button button;
    private RecyclerView recyclerView;
    private MessageAdapter messageAdapter;
    private List<Message> messageList;

    private Listener listener = new Listener() {
        @Override
        public void onSuccess(String question, String resultString) {

            Log.d("CX", "resultString=" + resultString);

            Message message = new Message();
            message.setFrom("ROBOT");

            Result result = null;
            boolean is = false;
            try {
                is = JSONValidator.from(resultString).validate();
            } catch (Exception e) {
                e.printStackTrace();
                Log.e("CX", "JSON验证未通过");
            }
            if (is) {
                switch (question) {
                    case "笑话":
                        result = JSON.parseObject(resultString, JsonResult.Joke.class);
                        break;
                    case "观音灵签":
                        result = JSON.parseObject(resultString, JsonResult.GuanYin.class);
                        break;
                    case "月老灵签":
                        result = JSON.parseObject(resultString, JsonResult.YueLao.class);
                        break;
                    case "财神爷灵签":
                        result = JSON.parseObject(resultString, JsonResult.CaiShenYe.class);
                        break;
                    default:
                        break;
                }
                if (null != result) {
                    message.setContent(result.toString());
                } else {
                    Log.e("CX", "没有匹配到相应的结果");
                    message.setContent("听不懂");
                }
            } else {
                message.setContent(resultString);
            }
            draw(message);
        }

        @Override
        public void onFailed(String result) {
            Log.e("CX", "返回值为null或空字符串");
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.input_text);
        button = findViewById(R.id.send);
        recyclerView = findViewById(R.id.msg_recycler_view);

        initMessageList();

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        messageAdapter = new MessageAdapter(messageList);
        recyclerView.setAdapter(messageAdapter);

        button.setOnClickListener(this);

    }

    private void initMessageList() {
        messageList = new ArrayList<>();
        messageList.add(new Message("ROBOT", "您好，茉莉为您服务！"));
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.send:
                Message message = new Message("SELF", editText.getText().toString());
                editText.setText("");
                draw(message);
                send(message);
                break;
            default:
                break;
        }
    }

    private void send(Message message) {

        Task task = new Task(listener);
        task.execute(message);
    }

    void draw(Message message) {
        messageList.add(message);
        messageAdapter.notifyItemInserted(messageList.size() - 1);
        if ("ROBOT".equals(message.getFrom())) {
            //获取可见的最后一个view
            View lastChildView = recyclerView.getChildAt(
                    recyclerView.getChildCount() - 1);
            //获取可见的最后一个view的位置
            int lastChildViewPosition = recyclerView.getChildAdapterPosition(lastChildView);
            if (!(messageList.size() - 1 - 1 - lastChildViewPosition >= 1))
                recyclerView.scrollToPosition(messageList.size() - 1);
        } else if ("SELF".equals(message.getFrom())) {
            recyclerView.scrollToPosition(messageList.size() - 1);
        }

    }
}