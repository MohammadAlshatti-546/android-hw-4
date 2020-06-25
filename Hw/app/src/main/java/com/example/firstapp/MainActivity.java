package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView result ;
    EditText Quiz,HW,Mid,Final;
    Button Calc,reset;
    double My_result ;
    double Q,H,M,F;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = (TextView)findViewById(R.id.result);
        Quiz = ( EditText) findViewById(R.id.Quiz);
        HW = ( EditText) findViewById(R.id.HW);
        Mid = ( EditText) findViewById(R.id.Mid);
        Final = ( EditText) findViewById(R.id.Final);
        Calc = ( Button) findViewById(R.id.Calc);
        reset = (Button) findViewById(R.id.reset) ;

        Calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Q =Double.parseDouble(Quiz.getText() .toString());
                H=Double.parseDouble(HW.getText() .toString());
                M=Double.parseDouble(Mid.getText() .toString());
                F =Double.parseDouble(Final.getText() .toString());
                My_result =Q+H+M+F;
                result.setText(String.valueOf(My_result) +" " +"("+calc(My_result)+")" );
            }

        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String QU =Quiz.getText() .toString();
                Quiz.setText("");
                String Hw =HW.getText() .toString();
                HW.setText("");
                String Mi =Mid.getText() .toString();
                Mid.setText("");
                String Fi =Final.getText() .toString();
                Final.setText("");
                String re =result.getText() .toString();
                result.setText("");

            }
        });



    }
    public static String calc(double a){

         if (a>=90){
            return ("A");
        }
        else if(a>=80){
            return("B");
        }
        else if(a>=70){
            return("C");
        }
        else if(a>=60){
            return("D");
        }
        else if(a<60){
            return("F");
        }

        return null;
    }




    }


