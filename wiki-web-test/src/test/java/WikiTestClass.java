import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WikiTestClass {
    WebDriver wd;

    @BeforeMethod
    public void setUp(){
        wd = new ChromeDriver();
    }
    @Test
    public void wikiTestSearch(){
        wd.get("https://www.wikipedia.org/");
        wd.findElement(By.id("searchInput")).click();
        wd.findElement(By.cssSelector(".svg-search-icon")).click();
    }
    @AfterMethod
    public void tearDown(){
        wd.quit();
    }
}
