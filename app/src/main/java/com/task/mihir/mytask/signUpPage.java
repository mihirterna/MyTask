package com.task.mihir.mytask;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class signUpPage extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_page);
        final Button submitBtn = (Button) findViewById(R.id.btn_signup);
        final TextView goToLogin=(TextView) findViewById(R.id.link_login);
        submitBtn.setOnClickListener(this);
        goToLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_signup:
                // TODO: 24-09-2017 "HomeScreen"
                break;
            case R.id.link_login:
                startActivity(new Intent(signUpPage.this,loginPage.class));
        }
    }
}
