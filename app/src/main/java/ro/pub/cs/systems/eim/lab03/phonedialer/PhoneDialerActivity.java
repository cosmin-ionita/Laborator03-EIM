package ro.pub.cs.systems.eim.lab03.phonedialer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PhoneDialerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_dialer);

    }

    public void key_1_click(View view) {
        EditText textEdit = findViewById(R.id.textView);

        String text = textEdit.getText().toString();

        text += 1;

        textEdit.setText(text);
    }

    public void key_2_click(View view) {
        EditText textEdit = findViewById(R.id.textView);

        String text = textEdit.getText().toString();

        text += 2;

        textEdit.setText(text);
    }

    public void key_3_click(View view) {
        EditText textEdit = findViewById(R.id.textView);

        String text = textEdit.getText().toString();

        text += 3;

        textEdit.setText(text);
    }

    public void key_4_click(View view) {
        EditText textEdit = findViewById(R.id.textView);

        String text = textEdit.getText().toString();

        text += 4;

        textEdit.setText(text);
    }
    public void key_5_click(View view) {
        EditText textEdit = findViewById(R.id.textView);

        String text = textEdit.getText().toString();

        text += 5;

        textEdit.setText(text);
    }

    public void key_6_click(View view) {
        EditText textEdit = findViewById(R.id.textView);

        String text = textEdit.getText().toString();

        text += 6;

        textEdit.setText(text);
    }

    public void key_7_click(View view) {
        EditText textEdit = findViewById(R.id.textView);

        String text = textEdit.getText().toString();

        text += 7;

        textEdit.setText(text);
    }

    public void key_8_click(View view) {
        EditText textEdit = findViewById(R.id.textView);

        String text = textEdit.getText().toString();

        text += 8;

        textEdit.setText(text);
    }

    public void key_9_click(View view) {
        EditText textEdit = findViewById(R.id.textView);

        String text = textEdit.getText().toString();

        text += 9;

        textEdit.setText(text);
    }

    public void delete(View view) {
        EditText textEdit = findViewById(R.id.textView);

        String text = textEdit.getText().toString();

        if(text.length() != 0)
            text = text.substring(0, text.length() - 1);

        textEdit.setText(text);
    }
}
