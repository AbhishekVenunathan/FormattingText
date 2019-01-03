package com.abhishekvenunathan.formattingtext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view){

        Toast.makeText(getApplicationContext(),"Hi",Toast.LENGTH_LONG).show();

        EditText myTextField = findViewById(R.id.textField);

        ImageView catImage = findViewById(R.id.imageView);

        catImage.setImageResource(R.drawable.cat2);

        Log.i("info",myTextField.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


}
