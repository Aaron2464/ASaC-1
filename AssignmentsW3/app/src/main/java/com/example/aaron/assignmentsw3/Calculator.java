package com.example.aaron.assignmentsw3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {

    private Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnC, btnMu, btnS, btnPC, btnCS, btnADD, btnPo ,btnD, btnE;
    private TextView answerView, txtshow;
    private double sum = 0;
    private double count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        answerView = (TextView)findViewById(R.id.answerView);
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
            String[] numArray = show.split(" ");  //設定陣列長度為字串長度 利用空白切割字串
            Button btn = (Button)findViewById(v.getId());
            switch (v.getId()){
                case R.id.btnC:
                    txtshow.setText("");
                    answerView.setText("");
                    break;
                case R.id.btnADD:
                    String lastStr = show.substring(show.length()-1,show.length());
                    if (lastStr.equals(" ")) {

                    } else {
                        txtshow.setText(show + " + ");
                    }
                    break;
                case R.id.btnS:
                    lastStr = show.substring(show.length()-1,show.length());
                    if (lastStr.equals(" ")) {

                    } else {
                        txtshow.setText(show + " - ");
                    }
                    break;
                case R.id.btnMu:
                    lastStr = show.substring(show.length()-1,show.length());
                    if (lastStr.equals(" ")) {

                    } else {
                        txtshow.setText(show + " × ");
                    }
                    break;
                case R.id.btnD:
                    lastStr = show.substring(show.length()-1,show.length());
                    if (lastStr.equals(" ")) {

                    } else {
                        txtshow.setText(show + " ÷ ");
                    }
                    break;
                case R.id.btnPo:
                    lastStr = show.substring(show.length()-1,show.length());
                    if (lastStr.equals(" ")) {
                        txtshow.setText(show + "0.");
                    }else if(lastStr.equals(".")){

                    }
                    else {
                        txtshow.setText(show + ".");
                    }
                    break;
                case R.id.btn0:
                    if (show.equals("0")||show.equals(" ")) {
                        txtshow.setText("0");
                    } else {
                        txtshow.setText(show + "0");
                    }
                    break;
                case R.id.btnCS:
                    Double lastnum = Double.parseDouble(numArray[numArray.length-1]);
                    lastStr = show.substring(show.length()-1,show.length());
                    if (lastStr.equals(" ")){

                    }else {
                        if (lastnum > 0) {

                        } else if (lastnum < 0) {

                        } else {

                        }
                    }
                    break;
                case R.id.btnE:
                    sum = 0;
                    count = 0;
                    lastStr = show.substring(show.length()-1,show.length());
                    if (lastStr.equals(" ")) {
                        answerView.setText("ERROR");
                    }else{
                        sum = Double.parseDouble(numArray[0]);
                        for (int i = 1 ; i < numArray.length ; i = i + 2){
                            if(numArray[i].equals("×")){
                                sum = sum * Double.parseDouble(numArray[i+1]);
                            }else if(numArray[i].equals("÷")){
                                sum = sum / Double.parseDouble(numArray[i+1]);
                            }else if(numArray[i].equals("+")) {
                                if ((i+2) == numArray.length){
                                    sum = sum + Double.parseDouble(numArray[i + 1]);
                                }else{
                                    if (numArray[i + 2].equals("×") || numArray[i + 2].equals("÷")) {
                                        count = Double.parseDouble(numArray[i + 1]);
                                        for(int j = i + 2; j < numArray.length ; j =  j + 2) {
                                            if (numArray[j].equals("×")) {
                                                count = count * Double.parseDouble(numArray[j + 1]);
                                                i = i + 2;
                                            } else if(numArray[j].equals("÷")){
                                                count = count / Double.parseDouble(numArray[j + 1]);
                                                i = i + 2;
                                            }else {
                                                break;
                                            }
                                        }
                                        sum = sum + count;
                                    }else{
                                        sum = sum + Double.parseDouble(numArray[i + 1]);
                                    }
                                }
                            }else if(numArray[i].equals("-")) {
                                if ((i + 2) == numArray.length) {
                                    sum = sum - Double.parseDouble(numArray[i + 1]);
                                } else {
                                    if (numArray[i + 2].equals("×") || numArray[i + 2].equals("÷")) {
                                        count = Double.parseDouble(numArray[i + 1]);
                                        for (int j = i + 2; j < numArray.length; j = j + 2) {
                                            if (numArray[j].equals("×")) {
                                                count = count * Double.parseDouble(numArray[j + 1]);
                                                i = i + 2;
                                            } else if (numArray[j].equals("÷")) {
                                                count = count / Double.parseDouble(numArray[j + 1]);
                                                i = i + 2;
                                            } else {
                                                break;
                                            }
                                        }
                                        sum = sum - count;
                                    } else {
                                        sum = sum - Double.parseDouble(numArray[i + 1]);
                                    }
                                }
                            }
                        }
                        answerView.setText(Double.toString(sum));
                    }
                    break;
                default:
                    txtshow.setText(show + btn.getText());
                    break;
            }
        }
    };
}


//增加 % & +/- ，排除第二個小數點的問題
