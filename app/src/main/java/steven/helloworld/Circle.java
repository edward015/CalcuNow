package steven.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Circle extends AppCompatActivity {

    private EditText input1;
    private EditText input2;
    private EditText input3;
    private EditText input4;

    private TextView tv_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle);

        setTitle("Circle");
        input1 = (EditText) findViewById(R.id.et_input1);
        input2 = (EditText) findViewById(R.id.et_input2);
        input3 = (EditText) findViewById(R.id.et_input3);
        input4 = (EditText) findViewById(R.id.et_input4);

        Button calculate = (Button) findViewById(R.id.bt_calculate);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeCalculations();
            }
        });

        tv_result = (TextView) findViewById(R.id.tv_result);
    }

    private void makeCalculations() {
        double r;
        double r2;
        double n1 = Double.valueOf(input1.getText().toString());
        double n2 = Double.valueOf(input2.getText().toString());
        double n3 = Double.valueOf(input3.getText().toString());
        double n4 = Double.valueOf(input4.getText().toString());

        r2 = (n1-n3)*(n1-n3) + (n2-n4)*(n2-n4);
        r = Math.sqrt(r2);
        r = Math.floor(r*10000)/10000;
        r2 = Math.floor(r2*10000)/10000;
        char s = '\u00B2';
        char root = '\u221A';
        char t = '\u03B8';
        char pl = '\u2213';
        tv_result.setText("The standard form of the equation is y = " + pl + root + "(" + r2 + " - (x - "+n3+")"+s+") + " + n4 +'\n'+'\n' + "The parametric form is \n" + "x = " + n3 +" + " + r + "cos("+ t+")\n" + "y = " + n4 +" + " + r + "sin(" +  t + ")");
    }
}
