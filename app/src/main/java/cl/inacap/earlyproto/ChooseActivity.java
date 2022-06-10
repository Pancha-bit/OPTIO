package cl.inacap.earlyproto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ChooseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose);
    }

    public void regresar(View view){
        Intent k = new Intent(this,MainActivity.class);
        startActivity(k);
    }

    public void cambioBoss(View view){
        Intent boss = new Intent(this,OptioBoss.class);
        startActivity(boss);
    }

    public void cambioWorker(View view){
        Intent worker = new Intent(this,OptioWorker.class);
        startActivity(worker);
    }

}