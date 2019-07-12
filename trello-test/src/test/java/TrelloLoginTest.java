import org.testng.annotations.Test;

public class TrelloLoginTest  extends  TestBase{

    @Test
    public void loginTest() throws InterruptedException {
        //click login button
        app.clickLoginButton();
        app.fillLoginForm("elena.telran@yahoo.com", "12345.com");
        app.pauseThread(3000);
        app.confirmLogin();
        app.pauseThread(10000);

    }

    //_________________________________________________________________________________________________________________


}