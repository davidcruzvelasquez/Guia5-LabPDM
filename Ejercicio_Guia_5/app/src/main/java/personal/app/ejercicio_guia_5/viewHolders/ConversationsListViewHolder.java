package personal.app.ejercicio_guia_5.viewHolders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import personal.app.ejercicio_guia_5.R;

public class ConversationsListViewHolder extends RecyclerView.ViewHolder {

    ImageView ivAvatar;
    TextView tvNames, tvMessage, tvTime;

    public ConversationsListViewHolder(@NonNull View itemView) {
        super(itemView);

        ivAvatar   = itemView.findViewById(R.id.ivAvatar);
        tvNames      = itemView.findViewById(R.id.tvNames);
        tvMessage  = itemView.findViewById(R.id.tvMessage);
        tvTime  = itemView.findViewById(R.id.tvTime);
    }

    public ImageView getIvAvatar() {
        return ivAvatar;
    }
    public TextView getTvNames() { return tvNames;}
    public TextView getTvMessage() { return tvMessage;}
    public TextView getTvTime() { return tvTime;}

}
