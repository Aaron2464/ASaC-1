package com.example.aaron.assignmentsw3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {

    private Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnC, btnMu, btnS, btnPC, btnCS, btnADD, btnPo ,btnD, btnE;
    private TextView answer, txtshow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        txtshow = (TextView)findViewById(R.id.txtShow);
        btn0 = (Button)findViewById(R.id.btn0); btn0.setOnClickListener(MybtnListener);
        btn1 = (Button)findViewById(R.id.btn1); btn1.setOnClickListener(MybtnListener);
        btn2 = (Button)findViewById(R.id.btn2); btn2.setOnClickListener(MybtnListener);
        btn3 = (Button)findViewById(R.id.btn3); btn3.setOnClickListener(MybtnListener);
        btn4 = (Button)findViewById(R.id.btn4); btn4.setOnClickListener(MybtnListener);
        btn5 = (Button)findViewById(R.id.btn5); btn5.setOnClickListener(MybtnListener);
        btn6 = (Button)findViewById(R.id.btn6); btn6.setOnClickListener(MybtnListener);
        btn7 = (Button)findViewById(R.id.btn7); btn7.setOnClickListener(MybtnListener);
        btn8 = (Button)findViewById(R.id.btn8); btn8.setOnClickListener(MybtnListener);
        btn9 = (Button)findViewById(R.id.btn9); btn9.setOnClickListener(MybtnListener);
        btnC = (Button)findViewById(R.id.btnC); btnC.setOnClickListener(MybtnListener);
        btnMu = (Button)findViewById(R.id.btnMu); btnMu.setOnClickListener(MybtnListener);
        btnS = (Button)findViewById(R.id.btnS); btnS.setOnClickListener(MybtnListener);
        btnPC = (Button)findViewById(R.id.btnPC); btnPC.setOnClickListener(MybtnListener);
        btnCS = (Button)findViewById(R.id.btnCS); btnCS.setOnClickListener(MybtnListener);
        btnADD = (Button)findViewById(R.id.btnADD); btnADD.setOnClickListener(MybtnListener);
        btnPo = (Button)findViewById(R.id.btnPo); btnPo.setOnClickListener(MybtnListener);
        btnD = (Button)findViewById(R.id.btnD); btnD.setOnClickListener(MybtnListener);
        btnE = (Button)findViewById(R.id.btnE); btnE.setOnClickListener(MybtnListener);

    }

    private Button.OnClickListener MybtnListener = new Button.OnClickListener(){
        @Override
        public void onClick(View v) {
            String show = txtshow.getText().toString();
            Button btn = (Button)findViewById(v.getId());
            txtshow.setText(show + btn.getText());

        }
    };

}
