package cl.inacap.earlyproto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void cambioPag2(View view){
        Intent j = new Intent(this,ChooseActivity.class);
        startActivity(j);
    }
}