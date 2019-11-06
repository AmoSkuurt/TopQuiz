package amoni.ayyub.topquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mWelcomeText;
    private EditText mNameInput;
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWelcomeText = findViewById(R.id.activity_main_welcome_txt);
        mNameInput = findViewById(R.id.activity_main_txt_input);
        mButton = findViewById(R.id.activity_main_play_btn);
    }


}
