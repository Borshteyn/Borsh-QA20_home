package com.telran.qa20.tests;

import org.testng.annotations.Test;

public class TrelloLoginTest  extends  TestBase{

    @Test
    public void loginTest() throws InterruptedException {
        //click login button
        app.getSession().clickLoginButton();
        app.getSession().fillLoginForm("shura.borshteyn.92@mail.ru", "4d70D56E");
        app.getSession().pauseThread(3000);
        app.getSession().confirmLogin();
        app.getSession().pauseThread(10000);
    }

}