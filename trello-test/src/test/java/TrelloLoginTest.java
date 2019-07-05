import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TrelloLoginTest  extends  TestBase{

    @Test
    public void loginTest() throws InterruptedException {
        //click login button
        clickLoginButton();
        fillLoginForm("elena.telran@yahoo.com", "12345.com");
        pauseThread(3000);
        confirmLogin();
        pauseThread(10000);

    }

    //_________________________________________________________________________________________________________________


}