package ttu.cse.hw1_simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView text;
    int number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.textView3);


    }

    public static boolean isInteger(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public void onclick(View view) {
        Boolean isint = isInteger((String) text.getText());
        if (isint == false) {
            switch (view.getId()) {
                case R.id.button25://zero
                    text.setText("0");
                    break;
                case R.id.button20://one
                    text.setText("1");
                    break;
                case R.id.button21://two
                    text.setText("2");
                    break;
                case R.id.button22://three
                    text.setText("3");
                    break;
                case R.id.button13://four
                    text.setText("4");
                    break;
                case R.id.button14://five
                    text.setText("5");
                    break;
                case R.id.button16://six
                    text.setText("6");
                    break;
                case R.id.button6://seven
                    text.setText("7");
                    break;
                case R.id.button7://eight
                    text.setText("8");
                    break;
                case R.id.button8://nine
                    text.setText("9");
                    break;
            }
        } else {
            number = Integer.parseInt((String) text.getText());
            number *= 10;
            int number1=number;
            int count=0;
            while (number1!=0)
            {
                number1=number1/10;
                count++;
            }
            switch (view.getId()) {
                case R.id.button25://zero
                    number += 0;
                    break;
                case R.id.button20://one
                    number += 1;
                    break;
                case R.id.button21://two
                    number += 2;
                    break;
                case R.id.button22://three
                    number += 3;
                    break;
                case R.id.button13://four
                    number += 4;
                    break;
                case R.id.button14://five
                    number+=5;
                    break;
                case R.id.button16://six
                    number+=6;
                    break;
                case R.id.button6://seven
                    number+=7;
                    break;
                case R.id.button7://eight
                    number+=8;
                    break;
                case R.id.button8://nine
                    number+=9;
                    break;
                case R.id.button2:
                    number=0;
                    break;
            }
            if(count<9||number==0) {
                text.setText(String.valueOf(number));
            }
        }
    }
}