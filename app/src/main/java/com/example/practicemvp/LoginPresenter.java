package com.example.practicemvp;

public class LoginPresenter implements ILoginPresenter {
    ILogin view;

    public LoginPresenter(ILogin view) {
        this.view = view;
    }

    @Override
    public void logbtclicked() {
        if (view.username().length() == 0)
            view.showusererror();
        else if(view.password().length()==0)
            view.passworderror();
        else
            view.navigate();


    }
}
