package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView text1;
    String number;
    String sign;
    Button zero, one, two, three, four, five, six, seven, eight, nine, back, equal, dot, clear, addition, subtract, multiply, divide, percent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = findViewById(R.id.text1);
        zero = findViewById(R.id.zero);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        back = findViewById(R.id.back);
        equal = findViewById(R.id.equal);
        dot = findViewById(R.id.dot);
        clear = findViewById(R.id.clear);
        addition = findViewById(R.id.addition);
        subtract = findViewById(R.id.subtract);
        multiply = findViewById(R.id.multiply);
        divide = findViewById(R.id.divide);
        percent = findViewById(R.id.percent);

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                text1.setText("");
                Toast.makeText(getApplicationContext(), "clear", Toast.LENGTH_SHORT).show();
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String num1 = one.getText().toString();
                String num = text1.getText().toString();
                String result1 = num + num1;
                text1.setText(result1);
                revertButtonColorAndBackground();
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String num2 = two.getText().toString();
                String num = text1.getText().toString();
                String result2 = num + num2;
                text1.setText(result2);
                revertButtonColorAndBackground();
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String num3 = three.getText().toString();
                String num = text1.getText().toString();
                String result3 = num + num3;
                text1.setText(result3);
                revertButtonColorAndBackground();
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String num4 = four.getText().toString();
                String num = text1.getText().toString();
                String result4 = num + num4;
                text1.setText(result4);
                revertButtonColorAndBackground();
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num5 = five.getText().toString();
                String num = text1.getText().toString();
                String result5 = num + num5;
                text1.setText(result5);
                revertButtonColorAndBackground();
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String num6 = six.getText().toString();
                String num = text1.getText().toString();
                String result6 = num + num6;
                text1.setText(result6);
                revertButtonColorAndBackground();
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String num7 = seven.getText().toString();
                String num = text1.getText().toString();
                String result7 = num + num7;
                text1.setText(result7);
                revertButtonColorAndBackground();
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num8 = eight.getText().toString();
                String num = text1.getText().toString();
                String result8 = num + num8;
                text1.setText(result8);
                revertButtonColorAndBackground();
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num9 = nine.getText().toString();
                String num = text1.getText().toString();
                String result9 = num + num9;
                text1.setText(result9);
                revertButtonColorAndBackground();
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String num0 = zero.getText().toString();
                String num = text1.getText().toString();
                String result0 = num + num0;
                text1.setText(result0);
                revertButtonColorAndBackground();
            }
        });

        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sign = "+";

                String numberOne = text1.getText().toString();
                number = numberOne;
                text1.setText("");

                addition.setBackgroundColor(ContextCompat.getColor(getApplicationContext(),R.color.white));
                addition.setTextColor(ContextCompat.getColor(getApplicationContext(),R.color.black));
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sign = "-";
                String numberOne = text1.getText().toString();
                number = numberOne;
                text1.setText("");

                subtract.setBackgroundColor(ContextCompat.getColor(getApplicationContext(),R.color.white));
                subtract.setTextColor(ContextCompat.getColor(getApplicationContext(),R.color.black));
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sign = "*";
                String numberOne = text1.getText().toString();
                number = numberOne;
                text1.setText("");

                multiply.setBackgroundColor(ContextCompat.getColor(getApplicationContext(),R.color.white));
                multiply.setTextColor(ContextCompat.getColor(getApplicationContext(),R.color.black));
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sign = "/";
                String numberOne = text1.getText().toString();
                number = numberOne;
                text1.setText("");

                divide.setBackgroundColor(ContextCompat.getColor(getApplicationContext(),R.color.white));
                divide.setTextColor(ContextCompat.getColor(getApplicationContext(),R.color.black));
            }
        });

        percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign = "%";
                String numberOne = text1.getText().toString();
                number = numberOne;
                text1.setText("");
                percent.setBackgroundColor(ContextCompat.getColor(getApplicationContext(),R.color.white));
                percent.setTextColor(ContextCompat.getColor(getApplicationContext(),R.color.black));
            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numberOne = text1.getText().toString();
                number = numberOne;
                text1.setText(".");
                dot.setBackgroundColor(ContextCompat.getColor(getApplicationContext(),R.color.white));
                dot.setTextColor(ContextCompat.getColor(getApplicationContext(),R.color.black));
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = text1.getText().toString();
                if (str.length() > 1) {
                    str = str.substring(0, str.length() - 1);
                    text1.setText(str);
                } else if (str.length() <= 1) {
                    text1.setText("0");
                }
                back.setBackgroundColor(ContextCompat.getColor(getApplicationContext(),R.color.white));
                back.setTextColor(ContextCompat.getColor(getApplicationContext(),R.color.black));

            }
        });


        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (sign == "+") {

                    String numberOne = text1.getText().toString();
                    String numberTwo = number;
                    float n1 = Float.parseFloat(numberOne);
                    float n2 = Float.parseFloat(numberTwo);
                    float na3 = n1 + n2;

                    text1.setText(String.valueOf(na3));
                }

                if (sign == "-") {
                    String numberOne = text1.getText().toString();
                    String numberTwo = number;
                    float n1 = Float.parseFloat(numberOne);
                    float n2 = Float.parseFloat(numberTwo);
                    float ns3 = n2 - n1;

                    text1.setText(String.valueOf(ns3));
                }
                if (sign == "*") {
                    String numberOne = text1.getText().toString();
                    String numberTwo = number;
                    float n1 = Float.parseFloat(numberOne);
                    float n2 = Float.parseFloat(numberTwo);
                    float nm3 = n1 * n2;

                    text1.setText(String.valueOf(nm3));
                }
                if (sign == "/") {

                    String numberOne = text1.getText().toString();
                    String numberTwo = number;
                    float n1 = Float.parseFloat(numberOne);
                    float n2 = Float.parseFloat(numberTwo);
                    float nd3 = n2 / n1;

                    text1.setText(String.valueOf(nd3));
                }
                if (sign == "%") {

                    String numberOne = text1.getText().toString();
                    String numberTwo = number;
                    float n1 = Float.parseFloat(numberOne);
                    float n2 = Float.parseFloat(numberTwo);
                    float np3 = n2 % n1;

                    text1.setText(String.valueOf(np3));
                }

            }
        });
    }
    void revertButtonColorAndBackground(){

        addition.setBackgroundColor(ContextCompat.getColor(getApplicationContext(),R.color.tint));
        addition.setTextColor(ContextCompat.getColor(getApplicationContext(),R.color.white));

        subtract.setBackgroundColor(ContextCompat.getColor(getApplicationContext(),R.color.tint));
        subtract.setTextColor(ContextCompat.getColor(getApplicationContext(),R.color.white));

        multiply.setBackgroundColor(ContextCompat.getColor(getApplicationContext(),R.color.tint));
        multiply.setTextColor(ContextCompat.getColor(getApplicationContext(),R.color.white));

        divide.setBackgroundColor(ContextCompat.getColor(getApplicationContext(),R.color.tint));
        divide.setTextColor(ContextCompat.getColor(getApplicationContext(),R.color.white));

        percent.setBackgroundColor(ContextCompat.getColor(getApplicationContext(),R.color.tint));
        percent.setTextColor(ContextCompat.getColor(getApplicationContext(),R.color.white));

        back.setBackgroundColor(ContextCompat.getColor(getApplicationContext(),R.color.tint));
        back.setTextColor(ContextCompat.getColor(getApplicationContext(),R.color.white));

        dot.setBackgroundColor(ContextCompat.getColor(getApplicationContext(),R.color.tint));
        dot.setTextColor(ContextCompat.getColor(getApplicationContext(),R.color.white));

    }
}
