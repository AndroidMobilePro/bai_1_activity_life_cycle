package proteam.com.bai_1_activity_lifecycle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class SaveStateActivity extends AppCompatActivity {
    private static final String KEY = "KEY";
    TextView tvTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save_state);

        tvTextView = (TextView) findViewById(R.id.tvState);

        findViewById(R.id.btnChangeText).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvTextView.setText("Data is changed!");
            }
        });
    }

    /*
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        // Checks the orientation of the screen
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            Toast.makeText(this, "landscape", Toast.LENGTH_SHORT).show();
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            Toast.makeText(this, "portrait", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        // push data by bundle to keep state
        outState.putString(KEY, tvTextView.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        // get data for bundle
        String keyText = savedInstanceState.getString(KEY, tvTextView.getText().toString());
        if (keyText != null) {
            tvTextView.setText(keyText);
        }
    }
     */

}
