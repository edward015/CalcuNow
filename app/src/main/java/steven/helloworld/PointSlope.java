package steven.helloworld;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import static steven.helloworld.R.id.et_input1;
import static steven.helloworld.R.id.tv_result;
import java.text.DecimalFormat;


public class PointSlope extends AppCompatActivity {

    private EditText input1;
    private EditText input2;
    private EditText input3;
    private EditText input4;

    private TextView tv_result;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_point_slope);

        setTitle("Point Slope Form");
        input1 = (EditText) findViewById(R.id.et_input1);
        input2 = (EditText) findViewById(R.id.et_input2);
        input3 = (EditText) findViewById(R.id.et_input3);
        input4 = (EditText) findViewById(R.id.et_input4);
        Button calculate = (Button) findViewById(R.id.bt_calculate);

        tv_result = (TextView) findViewById(R.id.tv_result);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeCalculations();
            }
        });
    }

    private void makeCalculations() {
        double slope;
        double n1 = Double.valueOf(input1.getText().toString());
        double n2 = Double.valueOf(input2.getText().toString());
        double n3 = Double.valueOf(input3.getText().toString());
        double n4 = Double.valueOf(input4.getText().toString());

        slope = (n4 - n2)/ (n3-n1);
        slope = Math.floor(slope*100)/100;

        tv_result.setText("The equation is y = " + slope + "(x - " + n3 + ") + "+ n4);
    }
}


