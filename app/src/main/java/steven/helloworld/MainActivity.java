package steven.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        setTitle("CalcuNow");


        final TextView nameView = (TextView) findViewById(R.id.Name);

        nameView.getText();

        final Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, PointSlope.class));
            }
        });

        final Button parabola = (Button) findViewById(R.id.parabolabutton);
        parabola.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Parabolic.class));
            }
        });

        final Button circle = (Button) findViewById(R.id.circlebutton);
        circle.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Circle.class));
            }
        });

       /* final Button ellipses = (Button) findViewById(R.id.ellipsesbutton);
        ellipses.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Ellipses.class));
            }
        });
        */


    }
}
