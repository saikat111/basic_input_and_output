package com.example.sorde.atry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView name;
    private Button click;
    private  EditText output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.textView2);
        click = findViewById(R.id.button1);
        output=findViewById(R.id.editText1);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a;
                a =output.getText().toString();
                name.setText(a);

            
            }
        });


    }
}
