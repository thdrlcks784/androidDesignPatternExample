package com.mvp.mvpExample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements Presenter.View {

    private Presenter presenter;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new PresenterImpl(MainActivity.this);

        textView = findViewById(R.id.text_view);
        textView.setOnClickListener(view -> { presenter.confirm();});
    }

    @Override
    public void setText(String text){
        textView.setText(text);
    }
}