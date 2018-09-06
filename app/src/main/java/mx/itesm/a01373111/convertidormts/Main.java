package mx.itesm.a01373111.convertidormts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


// Controller
public class Main extends AppCompatActivity {

    private EditText etMeters; // meters field
    private EditText etFeet; // feet
    private EditText etYard; // yards

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get references to graphic components
        etMeters = findViewById(R.id.etMeters);
        etFeet = findViewById(R.id.etFeet);
        etYard = findViewById(R.id.etYards);
    }

    public void BtnPressed(View v) {
        MtsConverter converter = new MtsConverter();
        etFeet.setText(String.valueOf(converter.ConvertToFt(Double.parseDouble(etMeters.getText().toString()))));
        etYard.setText(String.valueOf(converter.ConvertToYd(Double.parseDouble(etMeters.getText().toString()))));

    }
}
