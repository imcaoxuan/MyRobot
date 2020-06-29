package top.caoxuan.myrobot;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.ViewHolder> {

    private List<Message> messageList;

    public MessageAdapter(List<Message> messageList) {
        this.messageList = messageList;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        ConstraintLayout leftLayout;
        TextView leftMsg;
        ImageView leftAvatar;
        TextView leftAlias;

        ConstraintLayout rightLayout;
        TextView rightMsg;
        ImageView rightAvatar;
        TextView rightAlias;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            leftLayout = itemView.findViewById(R.id.left_layout);
            leftMsg = itemView.findViewById(R.id.left_msg);
            leftAvatar = itemView.findViewById(R.id.left_avatar);
            leftAlias = itemView.findViewById(R.id.left_alias);

            rightLayout = itemView.findViewById(R.id.right_layout);
            rightMsg = itemView.findViewById(R.id.right_msg);
            rightAvatar = itemView.findViewById(R.id.right_avatar);
            rightAlias = itemView.findViewById(R.id.right_alias);

        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.message_item, parent, false);
        return new MessageAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Message message = messageList.get(position);
        if ("ROBOT".equals(message.getFrom())) {
            holder.rightLayout.setVisibility(View.GONE);
            holder.leftLayout.setVisibility(View.VISIBLE);
            holder.leftMsg.setText(message.getContent());
        } else if ("SELF".equals(message.getFrom())) {
            holder.leftLayout.setVisibility(View.GONE);
            holder.rightLayout.setVisibility(View.VISIBLE);
            holder.rightMsg.setText(message.getContent());
            ///holder.rightNickname.setText(pref.getString("Nickname", ""));

        }
    }

    @Override
    public int getItemCount() {
        return messageList.size();
    }


}
