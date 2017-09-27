package com.task.mihir.mytask;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class loginPage extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        final Button loginBtn = (Button) findViewById(R.id.btn_login);
        final TextView goToSign = (TextView) findViewById(R.id.link_signup);
        loginBtn.setOnClickListener(this);
        goToSign.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_login:
                // TODO: 24-09-2017 "HOME Screen"
                startActivity(new Intent(this,firstHomeScreen.class));
                break;
            case R.id.link_signup:
                startActivity(new Intent(loginPage.this,signUpPage.class));
                break;

        }

        }
}
