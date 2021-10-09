package personal.app.ejercicio_guia_5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.pm.ActivityInfo;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import personal.app.ejercicio_guia_5.adapters.ConversationsAdapter;
import personal.app.ejercicio_guia_5.models.ConversationModel;

public class ConversationsActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ConversationsAdapter conversationsAdapter;
    ArrayList<ConversationModel> listConversations = new ArrayList<>();
    LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversations);
        setRecyclerView(listConversations);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        listConversations.add(new ConversationModel(R.drawable.user, "David Garcia, Rich...", "See you guys soon!", "6:20 AM"));
        listConversations.add(new ConversationModel(R.drawable.user, "Jennifer Gonzalez", "I am really excited for that new\nvideo game!", "6:09 AM"));
        listConversations.add(new ConversationModel(R.drawable.user, "maria-smith@mail...", "When will you be there?", "5:16 AM"));
        listConversations.add(new ConversationModel(R.drawable.user, "The Family", "When's our next vacation?", "1:51 AM"));
        listConversations.add(new ConversationModel(R.drawable.user, "+1 123-456-7890", "Can't wait to see you when you\nget back from college!", "Yesterday"));
        listConversations.add(new ConversationModel(R.drawable.user, "Robert Jones", "I am coming in one minute", "Yesterday"));
        listConversations.add(new ConversationModel(R.drawable.user, "David Garcia", "See you guys soon!", "Yesterday"));
    }

    private void setRecyclerView(List<ConversationModel> listConversations) {
        recyclerView = findViewById(R.id.rvConversations);
        linearLayoutManager = new LinearLayoutManager(ConversationsActivity.this, RecyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        conversationsAdapter = new ConversationsAdapter(listConversations);
        recyclerView.setAdapter(conversationsAdapter);
    }

}