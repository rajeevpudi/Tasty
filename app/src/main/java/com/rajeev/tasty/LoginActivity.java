package com.rajeev.tasty;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private Context context = LoginActivity.this;

    private EditText etname, etpwd;

    private Button btsignin, btcancel, btregister;

  //  EditText et_uname = (EditText) findViewById(R.id.et_uname);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etname = findViewById(R.id.et_uname);

        etpwd = findViewById(R.id.et_pwd);

        btsignin = findViewById(R.id.bt_signin);

        btsignin.setOnClickListener(this);

        btcancel = findViewById(R.id.bt_cancel);

        btcancel.setOnClickListener(this);

        btregister = findViewById(R.id.bt_register);

        btregister.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_signin:
                //BL
                if(etname.getText().length() == 0){
                    showToast("Please enter Username..?");
                    return;

                }

                if(etpwd.getText().length() == 0){
                    showToast("Please enter Password..?");
                    return;
                }

                if(!etname.getText().toString().equalsIgnoreCase("Rajeev")){
                    showToast("Please enter a valid username..?");
                    return;
                }

                if(!etpwd.getText().toString().equalsIgnoreCase("Rajeev")){
                    showToast("Please enter a valid password..?");
                    return;
                }

                showToast("Login Success..!");

                Intent login = new Intent(context, MainActivity.class);
                startActivity(login);

                break;
            case R.id.bt_cancel:
                //BL
                etname.setText("");
                etname.requestFocus();
                etpwd.setText("");
                break;
            case R.id.bt_register:
                Intent intent = new Intent(context, Registration.class);
                startActivity(intent);
                break;

        }



    }



    private void showToast(String message){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();

    }


}
