package amoni.ayyub.topquiz.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import amoni.ayyub.topquiz.R;
import amoni.ayyub.topquiz.model.User;

public class MainActivity extends AppCompatActivity {

    //Déclaration des champs (attributs) requis
    private TextView mWelcomeText;
    private EditText mNameInput;
    private Button mButton;
    private User mUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Branchement des variables
        mWelcomeText = findViewById(R.id.activity_main_welcome_txt);
        mNameInput = findViewById(R.id.activity_main_txt_input);
        mButton = findViewById(R.id.activity_main_play_btn);
        mUser = new User();

        //Désactiver le bouton de l'interface
        mButton.setEnabled(false);

        //Notifie lorsque l'utilisateur commence à saisir du texte dans le champ EditText
        mNameInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mButton.setEnabled(s.toString().length() >= 4);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //Détecter que l'utilisateur a cliqué sur le bouton, et le renvoyer à l'activity suivante
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gameActivity = new Intent(MainActivity.this, GameActivity.class);
                startActivity(gameActivity);
                //Mémorisez le prénom du joueur lorsqu'il clique sur le bouton
                mUser.setFirstname(mNameInput.getText().toString());
            }
        });
    }


}
