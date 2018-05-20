package com.example.gokulan.weabopscalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv_answer;
    private EditText et_num1, et_num2;
    private Button b_add, b_sub, b_mul, b_div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_answer = findViewById(R.id.tv_answer);
        et_num1 = findViewById(R.id.et_num1);
        et_num2 = findViewById(R.id.et_num2);
        b_add = findViewById(R.id.b_add);
        b_sub = findViewById(R.id.b_sub);
        b_mul = findViewById(R.id.b_mul);
        b_div = findViewById(R.id.b_div);


        b_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double num1 = Double.parseDouble(et_num1.getText().toString());
                    double num2 = Double.parseDouble(et_num2.getText().toString());

                    double ans = num1 + num2;

                    tv_answer.setText(String.valueOf(ans));
                }
                 catch (Exception e) {
                    tv_answer.setText("Invalid Input");
                 }
            }
        });
    }
}
