package cl.inacap.earlyproto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OptioWorker extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_optio_worker);
    }

    public void goBack(View view){
        Intent a = new Intent(this,ChooseActivity.class);
        startActivity(a);
    }
}