package ibotbuilders.mybutton;

import java.util.Date;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Button btnCTime;
    EditText txtCTime;
    Button SchoolButton, HomeworkButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCTime=(Button)findViewById(R.id.CurrentTimeButton);
        txtCTime=(EditText)findViewById(R.id.txtShowCurTime);
        txtCTime.setInputType(InputType.TYPE_NULL);
        btnCTime.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View vw) {
                txtCTime.setText(new Date().toString());
            }
        });

        SchoolButton = (Button) findViewById(R.id.GoSchool);//get id of button 1
        HomeworkButton = (Button) findViewById(R.id.DoHomework);//get id of button 2

        SchoolButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "TimeToSchool", Toast.LENGTH_LONG).show();//display the text of button1
            }
        });
        HomeworkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "HomeworkTime", Toast.LENGTH_LONG).show();//display the text of button2
            }
        });
    }

}
