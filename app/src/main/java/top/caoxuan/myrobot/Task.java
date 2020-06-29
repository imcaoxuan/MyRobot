package top.caoxuan.myrobot;

import android.os.AsyncTask;
import android.util.Log;

import java.io.IOException;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class Task extends AsyncTask<Object, Integer, Object> {

    public final static String URL = "http://i.itpk.cn/api.php";
    public final static String API_KEY = "30b9d42d3b04a20b6805f9e9104f63ec";
    public final static String API_SECRET = "uv5gmxahqtqy";
    public final static String LIMIT = "";
    public final static String TYPE = "";

    private Listener listener;
    private Message message;

    public Task(Listener listener) {
        this.listener = listener;
    }

    @Override
    protected Object doInBackground(Object[] objects) {

        message = (Message) objects[0];

        OkHttpClient okHttpClient = new OkHttpClient();
        HttpUrl.Builder httpBuilder = HttpUrl.parse(URL).newBuilder();
        httpBuilder.addQueryParameter("api_key", API_KEY);
        httpBuilder.addQueryParameter("api_secret", API_SECRET);
        httpBuilder.addQueryParameter("limit", LIMIT);
        httpBuilder.addQueryParameter("type", TYPE);
        httpBuilder.addQueryParameter("question", message.getContent());

        Log.d("CX_DEBUG", message.getFrom());
        Log.d("CX_DEBUG", message.getContent());

        Request request = new Request.Builder()
                .url(httpBuilder.build())
                .build();
        try {
            Response response = okHttpClient.newCall(request).execute();
            String resultString = response.body().string();
            return resultString;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

    }

    @Override
    protected void onPostExecute(Object o) {
        if (null != o && !"".equals(o)) {
            listener.onSuccess(message.getContent(), (String) o);
        } else {
            listener.onFailed((String) o);
        }
    }
}
