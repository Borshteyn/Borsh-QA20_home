import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TeamCreationTests extends TestBase{
    @BeforeMethod
    public void ensurePreconditions() throws InterruptedException {
        login("shura.borshteyn.92@mail.ru", "4d70D56E");
    }

    @Test
    public void createTeamTest() throws InterruptedException {
        clickCreateTeamButton();
        enterTeamName();
        confirmCreation();
    }

    private void confirmCreation() {
        app.click(By.xpath("//input[@type='submit']"));
    }

    private void enterTeamName() {
        app.type(By.id("org-display-name"),"paskudnik");
    }

    private void clickCreateTeamButton() {
        app.click(By.xpath("//span[contains(text(),'Создать')]/.."));
    }


}
