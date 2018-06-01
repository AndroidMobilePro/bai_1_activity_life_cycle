package proteam.com.bai_1_activity_lifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // listener click btnLifeCycle
        findViewById(R.id.btnLifeCycle).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, LifeCycleActivity.class));
            }
        });

        // listener click btnSaveState
        findViewById(R.id.btnSaveState).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SaveStateActivity.class));
            }
        });
    }
}
