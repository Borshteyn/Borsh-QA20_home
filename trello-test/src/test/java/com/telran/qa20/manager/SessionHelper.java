package com.telran.qa20.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase {
    public SessionHelper(WebDriver wd) {
        super(wd);
    }

    public void confirmLogin() {
        click(By.id("login"));
    }

    public void clickLoginButton() {
        click(By.cssSelector("[href='/login']"));
    }

    public void fillLoginForm(String email, String password) {
        type(By.id("user"), email);
        type(By.name("password"), password);
    }

    public void login(String email, String password) throws InterruptedException {
        clickLoginButton();
        fillLoginForm(email, password);
        pauseThread(3000);
        confirmLogin();
        pauseThread(10000);
    }
}
