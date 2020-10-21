package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup gendergroup;
    RadioButton genderbutton;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gendergroup=findViewById(R.id.radiogroup);
        submit=findViewById(R.id.submitbutton);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedid=gendergroup.getCheckedRadioButtonId();
                genderbutton=findViewById(selectedid);
                Toast.makeText(getApplicationContext(),genderbutton.getText().toString(),Toast.LENGTH_LONG).show();
            }
        });
    }
}