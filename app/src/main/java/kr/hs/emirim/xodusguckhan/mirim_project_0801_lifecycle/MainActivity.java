package kr.hs.emirim.xodusguckhan.mirim_project_0801_lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("***생성", "onCreate()호출됨");
        setContentView(R.layout.activity_main);
        Button btnDial = findViewById(R.id.btn_dial);
        Button btnFinish = findViewById(R.id.btn_finish);
        btnDial.setOnClickListener(btnListener);
        btnFinish.setOnClickListener(btnListener);
    }
    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.btn_dial:
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:/01033337777"));
                    startActivity(intent);
                    break;
                case R.id.btn_finish:
                    finish();
                    break;
            }
        }
    };


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("***시작", "onStart()호출됨");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("***재개", "onResume()호출됨");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("***일시정지", "onPause()호출됨");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("***정지", "onStop()호출됨");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("***재시작", "onRestart()호출됨");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("***소멸", "onDestroy()호출됨");
    }
}