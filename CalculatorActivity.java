package com.example.myapplication202329;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tv_result;
    //第一个操作数
    private String firstNum = "";
    //运算符
     private String operator = "";
    //第二个操作数
    private String secondNum = "";
    //当前的计算结果
     private String result = "";
    //显示的文本内容
     private String showText = "";
//ctrl+alt+f  抽取成员变量
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        //获取名叫tv_result的文本视图
         tv_result = findViewById(R.id.tv_result);
         findViewById(R.id.btn_divide).setOnClickListener(this);
         findViewById(R.id.btn_cancel).setOnClickListener(this);
         findViewById(R.id.btn_multiply).setOnClickListener(this);
         findViewById(R.id.btn_clear).setOnClickListener(this);
         findViewById(R.id.btn_seven).setOnClickListener(this);
         findViewById(R.id.btn_eight).setOnClickListener(this);
         findViewById(R.id.btn_nine).setOnClickListener(this);
         findViewById(R.id.btn_plus).setOnClickListener(this);
         findViewById(R.id.btn_four).setOnClickListener(this);
         findViewById(R.id.btn_five).setOnClickListener(this);
         findViewById(R.id.btn_six).setOnClickListener(this);
         findViewById(R.id.btn_minus).setOnClickListener(this);
         findViewById(R.id.btn_one).setOnClickListener(this);
         findViewById(R.id.btn_two).setOnClickListener(this);
         findViewById(R.id.btn_three).setOnClickListener(this);
         findViewById(R.id.reciprocal).setOnClickListener(this);
         findViewById(R.id.ib_sqrt).setOnClickListener(this);
         findViewById(R.id.zero).setOnClickListener(this);
         findViewById(R.id.btn_dot).setOnClickListener(this);
         findViewById(R.id.btn_equal).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String inputText;
        if(v.getId() == R.id.ib_sqrt){
            inputText="√";
        }else{
            inputText =((TextView) v).getText().toString();
        }
        switch (v.getId()){
            case R.id.btn_clear:
                break;
            case R.id.btn_cancel:
                break;
            case R.id.btn_multiply:
                case R.id.btn_plus:
                    case R.id.btn_minus:
                        case R.id.btn_divide:
                break;
            case R.id.btn_equal:
                break;
            case R.id.ib_sqrt:
                break;
            case R.id.reciprocal:
                break;
            default:
                if(operator.equals("")){
                    firstNum = firstNum + inputText;

                }else {
                    secondNum = secondNum + inputText;
                }
                refreshText(showText + inputText);
                break;





        }
    }
    //刷新文本显示
    private void refreshText(String text){
        showText = text;
        tv_result.setText(showText);
    }
}