package com.mvp.mvpExample;

public interface Presenter {
    void confirm();

    interface View{
        void setText(String text);
    }
}
