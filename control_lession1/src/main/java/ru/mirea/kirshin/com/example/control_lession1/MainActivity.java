package ru.mirea.kirshin.com.example.control_lession1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textViewValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewValue = findViewById(R.id.textView);

        setMyTextView(textViewValue);
    }

    public void setMyTextView(TextView myTextView) {
        this.textViewValue = myTextView;
        textViewValue.setText("New text in MIREA");
    }

    public String getTextViewValue(TextView textViewValue){
        return textViewValue.getText().toString();
    }
}