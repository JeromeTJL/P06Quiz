package sg.edu.rp.soi.p06_quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.sql.ResultSet;

public class MainActivity extends AppCompatActivity {

    //check in by Jerome

    TextView etNum1, etNum2, result;
    Button btnReset;
    Spinner operation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNum1.findViewById(R.id.etNum1);
        etNum2.findViewById(R.id.etNum2);
        result.findViewById(R.id.result);
        btnReset.findViewById(R.id.btnReset);
        operation.findViewById(R.id.operation);
    }
    
}
