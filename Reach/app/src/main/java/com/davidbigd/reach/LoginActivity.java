package com.davidbigd.reach;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(getWindow().FEATURE_NO_TITLE);
        setContentView(R.layout.activity_login);

        Button Login = (Button)findViewById(R.id.BLogin);

        Login.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(LoginActivity.this, UserActivity.class));
            }
        });
    }
}
