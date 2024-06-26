package com.example.tourportal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {


    private EditText registerEditTextFullName, registerEditTextDoB, registerEditTextMobile, registerEdittextEmail, registerEdittextPassword, registerEdittextConfirmPassword;
    private ProgressBar registerProcessBar;
    private RadioGroup registerRadioGroupGender;
    private RadioButton registerRadioButtonSelected;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        getActionBar().setTitle("register");

        Toast.makeText(RegisterActivity.this, "you can register now", Toast.LENGTH_SHORT).show();

        registerEditTextFullName = findViewById(R.id.register_enter_full_name);
        registerEdittextEmail = findViewById(R.id.register_enter_email);
        registerEditTextDoB = findViewById(R.id.register_enter_birthday);
        registerEditTextMobile = findViewById(R.id.register_enter_mobile);
        registerEdittextConfirmPassword = findViewById(R.id.register_enter_confirm_password);
        registerEdittextPassword = findViewById(R.id.register_enter_password);


        registerRadioGroupGender = findViewById(R.id.register_enter_gender_group);
        registerRadioGroupGender.clearCheck();


    }
}