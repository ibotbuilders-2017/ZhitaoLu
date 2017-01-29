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

public class MainActivity extends AppCompatActivity {
    Button btnCTime;
    EditText txtCTime;

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
    }

}
