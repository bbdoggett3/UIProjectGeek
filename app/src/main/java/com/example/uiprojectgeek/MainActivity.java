package com.example.uiprojectgeek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {
    private static String EXTRA_MESSAGE;
    private Button button;
    private Button buttonPhoto;
    private Button buttonPhone;
    private Button buttonEmail;
    private Button buttonInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textView6);
        textView.setText(message);


        //This is my button for User
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUserName();
            }
        });

        //This is my button for Photo
        buttonPhoto = (Button) findViewById(R.id.buttonPhoto);
        buttonPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUserPhoto();
            }
        });

        //This is my button for Phone number
        buttonPhone = (Button) findViewById(R.id.buttonPhone);
        buttonPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUserNumber();
            }
        });

        //This is my button for Email Address
        buttonEmail = (Button) findViewById(R.id.buttonEmail);
        buttonEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUserEmail();
            }
        });

        //This is my button for the user information
        buttonInfo = (Button) findViewById(R.id.buttonInfo);
        buttonInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUserInfo();
            }
        });
    }

    //This function will start the "edit user" activity
    public void openUserName() {
        Intent intent = new Intent(this, userName.class);
        startActivity(intent);
    }

    //This function will start the "edit photo" activity.
    public void openUserPhoto() {
        Intent intent = new Intent(this, userPhoto.class);
        startActivity(intent);
    }

    //This function will start the "edit phone number" activity.
    public void openUserNumber() {
        Intent intent = new Intent(this, userNumber.class);
        startActivity(intent);
    }

    //This function will start the "edit email address" activity.
    public void openUserEmail() {
        Intent intent = new Intent(this, userEmail.class);
        startActivity(intent);
    }

    //This function will start the "edit user info" activity.
    public void openUserInfo() {
        Intent intent = new Intent(this, userInfo.class);
        startActivity(intent);
    }

    //This is my function to update/ edit the user information
    public void sendMessage(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

}
