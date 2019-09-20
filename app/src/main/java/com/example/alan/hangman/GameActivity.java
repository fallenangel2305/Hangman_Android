package com.example.alan.hangman;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class GameActivity extends AppCompatActivity {
    DatabaseHelper myDb;
    String username;
    Button btnadd;
    EditText edtusername;
    TextView  txtscore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        myDb = new DatabaseHelper(this);

        btnadd = (Button)findViewById(R.id.btn_addPlayer);
        edtusername = (EditText)findViewById(R.id.edt_playerName);


        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username = edtusername.getText().toString();

               // Toast.makeText(GameActivity.this, username, Toast.LENGTH_SHORT).show();

                boolean isInserted = myDb.insertData(edtusername.getText().toString());
                if(isInserted == true)
                    Toast.makeText(GameActivity.this,"username created",Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(GameActivity.this,"username not created",Toast.LENGTH_LONG).show();


            }
        });

    }
}
