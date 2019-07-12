import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    WebDriver wd;

    public void init() throws InterruptedException{
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wd.get("https://trello.com");
    }

    public void stop() {
        wd.quit();
    }

    public void pauseThread(int millis) throws InterruptedException {
        Thread.sleep(millis);
    }

    public void confirmLogin() {
        click(By.id("login"));
    }

    public void click(By locator) {
        wd.findElement(locator).click();
    }

    public void clickLoginButton() {
        click(By.cssSelector("[href='/login']"));
    }

    public void fillLoginForm(String email, String password) {
        type(By.id("user"), email);
        type(By.name("password"), password);
    }

    public void type(By locator, String text) {
        click(locator);
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }

    public void login(String email, String password) throws InterruptedException {
        clickLoginButton();
        fillLoginForm(email, password);
        pauseThread(3000);
        confirmLogin();
        pauseThread(10000);
    }
}
