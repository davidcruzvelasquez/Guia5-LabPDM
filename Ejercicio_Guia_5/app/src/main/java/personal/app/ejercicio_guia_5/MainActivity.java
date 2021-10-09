package personal.app.ejercicio_guia_5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

    }

    public void onClickBtnConversations(View view ) {
        startActivity(new Intent(MainActivity.this, ConversationsActivity.class));
    }

    public void onClickBtnLogin(View view ) {
        startActivity(new Intent(MainActivity.this, LoginActivity.class));
    }

    public void onClickBtnCalculator(View view ) {
        startActivity(new Intent(MainActivity.this, CalculatorActivity.class));
    }

    public void onlClickBtnDatos(View view ) {
        startActivity(new Intent(MainActivity.this, MisDatosActivity.class));
    }

}