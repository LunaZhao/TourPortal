package com.example.tourportal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
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

        Button buttonRegister = findViewById(R.id.button_register);

        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedGenderId = registerRadioGroupGender.getCheckedRadioButtonId();
                registerRadioButtonSelected = findViewById(selectedGenderId);

                //obtain the entered data
                String textFullName = registerEditTextFullName.getText().toString();
                String textEmail = registerEdittextEmail.getText().toString();
                String textDoB = registerEditTextDoB.getText().toString();
                String textMobile = registerEditTextMobile.getText().toString();
                String textConfirmPassword = registerEdittextConfirmPassword.getText().toString();
                String textPassword = registerEdittextPassword.getText().toString();
                String textGender;

                if(TextUtils.isEmpty(textFullName))
                {
                    Toast.makeText(RegisterActivity.this, "please enter your Full name", Toast.LENGTH_LONG).show();
                    registerEditTextFullName.setError("Full name is required");
                    registerEditTextFullName.requestFocus();
                }
                else if(TextUtils.isEmpty(textEmail)) {

                    Toast.makeText(RegisterActivity.this, "please enter your Email", Toast.LENGTH_LONG).show();
                    registerEdittextEmail.setError("Email is required");
                    registerEdittextEmail.requestFocus();

                }
                else if(!Patterns.EMAIL_ADDRESS.matcher(textEmail).matches()) {

                    Toast.makeText(RegisterActivity.this, "please re-enter your Email", Toast.LENGTH_LONG).show();
                    registerEdittextEmail.setError("valid Email is required");
                    registerEdittextEmail.requestFocus();

                }
                else if(TextUtils.isEmpty(textDoB)) {

                    Toast.makeText(RegisterActivity.this, "please enter your birthday", Toast.LENGTH_LONG).show();
                    registerEditTextDoB.setError("Birthday is required");
                    registerEditTextDoB.requestFocus();

                }
                else if(TextUtils.isEmpty(textMobile)) {

                    Toast.makeText(RegisterActivity.this, "please enter your Mobile", Toast.LENGTH_LONG).show();
                    registerEditTextMobile.setError("Mobile is required");
                    registerEditTextMobile.requestFocus();

                }
                else if(textMobile.length() != 10) {

                    Toast.makeText(RegisterActivity.this, "please re-enter your Mobile", Toast.LENGTH_LONG).show();
                    registerEditTextMobile.setError("valid Mobile is required");
                    registerEditTextMobile.requestFocus();

                }
                else if(TextUtils.isEmpty(textPassword)) {

                    Toast.makeText(RegisterActivity.this, "please enter your password", Toast.LENGTH_LONG).show();
                    registerEdittextPassword.setError("password is required");
                    registerEdittextPassword.requestFocus();

                }
                else if(TextUtils.isEmpty(textConfirmPassword)) {

                    Toast.makeText(RegisterActivity.this, "please enter your password again", Toast.LENGTH_LONG).show();
                    registerEdittextConfirmPassword.setError("password is not same");
                    registerEdittextConfirmPassword.requestFocus();

                }
                else if(!textConfirmPassword.equals(textPassword)) {

                    Toast.makeText(RegisterActivity.this, "please enter same password again", Toast.LENGTH_LONG).show();
                    registerEdittextPassword.setError("password confirmation is required");
                    registerEdittextPassword.requestFocus();

                }
                else if(registerRadioGroupGender.getCheckedRadioButtonId() == -1) {

                    Toast.makeText(RegisterActivity.this, "please enter your Gender", Toast.LENGTH_LONG).show();
                    registerRadioButtonSelected.setError("Gender is required");
                    registerRadioButtonSelected.requestFocus();
                }
                else{
                    textGender = registerRadioButtonSelected.getText().toString();
                    registerProcessBar.setVisibility(View.VISIBLE);
                    registerUser(textFullName,textDoB,textEmail,textGender,textPassword,textConfirmPassword,textMobile);
                }
            }
        });



    }

    private void registerUser(String textFullName, String textDoB, String textEmail, String textGender, String textPassword, String textConfirmPassword, String textMobile) {


    }
}