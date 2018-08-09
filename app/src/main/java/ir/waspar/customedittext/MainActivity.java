package ir.waspar.customedittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.EditText;

import ir.waspar.persianedittext.PersianEditText;

public class MainActivity extends AppCompatActivity {

    PersianEditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.persian_edit_text);
        editText.gravity(Gravity.CENTER);
    }
}
