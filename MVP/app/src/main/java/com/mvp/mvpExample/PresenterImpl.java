package com.mvp.mvpExample;

public class PresenterImpl implements Presenter{
    private Presenter.View view;
    private Model model;

    PresenterImpl(View view){
        this.view = view;
        this.model = new Model();
    }

    @Override
    public void confirm(){
        if(view != null){
            view.setText(model.clikedButton());
        }
    }

}
