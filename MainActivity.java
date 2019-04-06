package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static java.sql.Types.NULL;


public class MainActivity extends AppCompatActivity {


    Button nine;
    Button eight;
    Button seven;
    Button six;
    Button five;
    Button four;
    Button three;
    Button two;
    Button one;
    Button zero;
    Button equal;
    Button clear;
    Button add;
    Button sub;
    Button multi;
    Button div;
    TextView tvsol;
    TextView tvans;
    Double val1=Double.NaN;
    Double val2;
    char act;
    final char  addition ='+';
    final char subtraction ='-';
    final char multiplication ='*';
    final char equ = '=';
    final char division ='/';



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nine=(Button)findViewById(R.id.nine);
        eight=(Button)findViewById(R.id.eight);
        seven=(Button)findViewById(R.id.seven);
        six=(Button)findViewById(R.id.six);
        five=(Button)findViewById(R.id.five);
        four=(Button)findViewById(R.id.four);
        three=(Button)findViewById(R.id.three);
        two=(Button)findViewById(R.id.two);
        one=(Button)findViewById(R.id.one);
        zero=(Button)findViewById(R.id.zero);
        add=(Button)findViewById(R.id.add);
        sub=(Button)findViewById(R.id.sub);
        multi=(Button)findViewById(R.id.multi);
        div=(Button)findViewById(R.id.div);
        tvsol=(TextView)findViewById(R.id.tvsol);
        tvans=(TextView)findViewById(R.id.tvans);
        equal=(Button)findViewById(R.id.equal);
        clear=(Button)findViewById(R.id.clear);

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvsol.setText(tvsol.getText().toString() + "9");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvsol.setText(tvsol.getText().toString() + "8");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvsol.setText(tvsol.getText().toString() + "7");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvsol.setText(tvsol.getText().toString() + "6");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvsol.setText(tvsol.getText().toString() + "5");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvsol.setText(tvsol.getText().toString() + "4");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvsol.setText(tvsol.getText().toString() + "3");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvsol.setText(tvsol.getText().toString() + "2");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvsol.setText(tvsol.getText().toString() + "1");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvsol.setText(tvsol.getText().toString() + "0");
            }
        });
       /* add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvsol.setText(tvsol.getText().toString() + "+");
                act=addition;
                calc();

            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvsol.setText(tvsol.getText().toString() + "9");
            }
        });*/
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc();
                act=addition;
                tvans.setText(String.valueOf(val1) + "+");
                tvsol.setText(null);

            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc();
                act=subtraction;
                tvans.setText(String.valueOf(val1) + "-");
                tvsol.setText(null);

            }
        });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc();
                act=multiplication;
                tvans.setText(String.valueOf(val1) + "*");
                tvsol.setText(null);

            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc();
                act=division;
                tvans.setText(String.valueOf(val1) + "/");
                tvsol.setText(null);

            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc();
                act=equ;
                tvans.setText(tvans.getText().toString() + String.valueOf(val2)+ "=" +String.valueOf(val1));
                tvsol.setText(null);

            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tvsol.getText().length()>0)
                {
                    CharSequence oops = tvsol.getText().toString();
                    tvsol.setText(oops.subSequence(0, tvsol.length()-1));
                }
                else
                {
                    val1=Double.NaN;
                    val2=Double.NaN;
                    tvsol.setText(null);
                    tvans.setText(null);
                }
            }
        });

    }

    public void calc()
    {
        if(!Double.isNaN(val1))
        {
            val2 = Double.parseDouble(tvsol.getText().toString());

            switch (act)
            {
                case addition:
                    val1 = val1 + val2;
                    break;
                case subtraction:
                    val1 = val1 - val2;
                    break;
                case multiplication:
                    val1 = val1 * val2;
                    break;
                case division:
                    val1 = val1 / val2;
                    break;
                case equ:
                    break;

            }
        }
         else
        {
            val1 = Double.parseDouble(tvsol.getText().toString());
        }

    }


}
