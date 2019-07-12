import org.testng.annotations.Test;

public class TrelloLoginTest  extends  TestBase{

    @Test
    public void loginTest() throws InterruptedException {
        //click login button
        app.clickLoginButton();
        app.fillLoginForm("shura.borshteyn.92@mail.ru", "4d70D56E");
        app.pauseThread(3000);
        app.confirmLogin();
        app.pauseThread(10000);

    }

}