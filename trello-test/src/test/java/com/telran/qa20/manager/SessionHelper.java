package com.telran.qa20.manager;

import com.telran.qa20.model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase {
    public SessionHelper(WebDriver wd) {
        super(wd);
    }

    public void confirmLogin() {
        click(By.id("login"));
    }

    public void clickLoginButton() {
        click(By.xpath("//a[@class='btn btn-sm btn-link text-white']"));
    }

    public void fillLoginForm(User user) {
        type(By.id("user"), user.getEmail());
        type(By.name("password"), user.getPassword());
    }

    public void login(String email, String password) throws InterruptedException {
        clickLoginButton();
        fillLoginForm(new User().setEmail(email).setPassword(password));
        pauseThread(3000);
        confirmLogin();
        pauseThread(10000);
    }

    public boolean isUserLoggedIn() throws NoSuchElementException {
        wd.get("https://trello.com");
        if (isElementPresent("//a[@href='/']")) {
            return false;
        }
        return true;
    }

    public boolean isElementPresent(String locator) throws NoSuchElementException {
        return wd.findElements(By.xpath(locator)).size() > 0;
    }

    public void logout() {
        clickAccountIconInHeader();
        clickLogoutButton();
        wd.get("https://www.trello.com");
    }

    public void clickLogoutButton() {
        wd.findElement(By.xpath("//button[@data-test-id='header-member-menu-logout']")).click();
    }

    public void clickAccountIconInHeader() {
        wd.findElement(By.xpath("//button[@data-test-id='header-member-menu-button']")).click();
    }
}
