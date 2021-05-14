package com.mvvm.mvvmexample;

import android.app.Activity;
import android.widget.TextView;

public class ViewModel {
    private Activity activity;
    private Model model;
    private TextView textView;

    ViewModel(Activity activity){
        this.activity = activity;
        this.model = new Model();
        initView();
    }

    private void initView(){
        textView = activity.findViewById(R.id.text_view);
        textView.setOnClickListener(view -> {
            textView.setText(model.clikedButton());
        });
    }
}
