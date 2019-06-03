package com.example.a1893288.classactivity1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final android.widget.Toast Toast = ;
    EditText Firstname, Lastname, Email,Password;
Button Submit,Exit;
ImageView Image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Firstname = findViewById(R.id.editText1);
        Lastname = findViewById(R.id.editText2);
        Email = findViewById(R.id.editText3);
        Password = findViewById(R.id.editText4);
        Submit = findViewById(R.id.button);
        Exit = findViewById(R.id.button2);

        final Toast toast=Toast.makeText(getApplicationContext(),Firstname.getText().toString(),Toast.LENGTH_SHORT);
    }
};


public void onClick(View v) {
        Log.d("First name ",fName.getText().toString());
        Log.d("Last name ",lName.getText().toString());
        Log.d("Email ",email.getText().toString());
        Log.d("Password ",password.getText().toString());
        toast.setText("Hello! "+fName.getText().toString());
        toast.show();
        Snackbar.make(v, "Submitted Successfully", Snackbar.LENGTH_LONG).show();

        Snackbar snackbar = Snackbar
        .make(v, "Submitted Successfully", Snackbar.LENGTH_LONG)
        .setAction("CLEAR", new View.OnClickListener(){
        }
        };
