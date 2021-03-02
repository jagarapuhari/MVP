package com.example.practicemvp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements ILogin {
    EditText etusername, etpassword;
    Button logbt;
    LoginPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new LoginPresenter(this);
        etusername = findViewById(R.id.etusername);
        etpassword = findViewById(R.id.etpassword);
        logbt = findViewById(R.id.logbt);
        logbt.setOnClickListener(v -> {
          presenter.logbtclicked();

        });
    }


    @Override
    public String username() {
        return etusername.getText().toString();
    }

    @Override
    public String password() {
        return etpassword.getText().toString();
    }

    @Override
    public void showusererror() {
        etusername.setError("Enter Name");
    }

    @Override
    public void passworderror() {
        etpassword.setError("Enter Password");

    }

    @Override
    public void navigate() {
        Toast.makeText(this, "Login Succesfully", Toast.LENGTH_SHORT).show();
    }
}