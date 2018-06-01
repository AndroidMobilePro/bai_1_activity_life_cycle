package proteam.com.bai_1_activity_lifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class LifeCycleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);
        findViewById(R.id.btnNextScreen).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LifeCycleActivity.this, SaveStateActivity.class));
            }
        });

        Log.d("TAGGGG", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("TAGGGG", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TAGGGG", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("TAGGGG", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TAGGGG", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("TAGGGG", "onDestroy");
    }
}
