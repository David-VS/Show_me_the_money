package be.ehb.showmethemoney;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.button.MaterialButton;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private EditText etEUR, etUSD;

    private View.OnClickListener convertListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(! etEUR.getText().toString().isEmpty()) {
                double eur = Double.parseDouble(etEUR.getText().toString());
                double usd = eur * 1.5;
                etUSD.setText(String.format(Locale.getDefault(), "%.2f", usd));
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnConvert = findViewById(R.id.btn_convert);
        etEUR = findViewById(R.id.et_euro);
        etUSD = findViewById(R.id.et_usd);

        btnConvert.setOnClickListener(convertListener);
    }
}
