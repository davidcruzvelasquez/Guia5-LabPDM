package personal.app.ejercicio_guia_5.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import personal.app.ejercicio_guia_5.R;
import personal.app.ejercicio_guia_5.models.ConversationModel;
import personal.app.ejercicio_guia_5.viewHolders.ConversationsListViewHolder;

public class ConversationsAdapter extends RecyclerView.Adapter<ConversationsListViewHolder> {

    List<ConversationModel> lstConversations;

    public ConversationsAdapter(List<ConversationModel> lstConversations) {
        this.lstConversations = lstConversations;
    }

    @NonNull
    @Override
    public ConversationsListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.conversations_list, parent, false);
        return new ConversationsListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ConversationsListViewHolder holder, int position) {

        holder.getIvAvatar().setImageResource(lstConversations.get(position).getImgConversation());
        holder.getTvNames().setText(lstConversations.get(position).getNames());
        holder.getTvMessage().setText(lstConversations.get(position).getMessage());
        holder.getTvTime().setText(lstConversations.get(position).getTime());
    }

    @Override
    public int getItemCount() {
        return this.lstConversations.size();
    }

}
