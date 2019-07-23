package com.telran.qa20.tests;

import com.telran.qa20.model.User;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase{
    @BeforeMethod
    public void preconditions(){
        if (!app.getSession().isUserLoggedIn()){
            app.getSession().logout();
        };
    }

    @Test
    public void positiveLoginTest() throws InterruptedException {
        app.getSession().clickLoginButton();
        app.getSession().pauseThread(5000);
        app.getSession().fillLoginForm(new User().setEmail("shura.borshteyn.92@mail.ru").setPassword("4d70D56E"));
        app.getSession().pauseThread(3000);
        app.getSession().confirmLogin();
        app.getSession().pauseThread(5000);
        Assert.assertFalse(app.getSession().isUserLoggedIn());
        app.getBoard().returnToHomepage();
        app.getBoard().pauseThread(5000);
    }
}
