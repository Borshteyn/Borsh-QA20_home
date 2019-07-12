import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BoardCreationTests  extends TestBase{
    @BeforeMethod
    public void ensurePreconditions() throws InterruptedException {
        login("shura.borshteyn.92@mail.ru", "4d70D56E");
    }
    @Test
    public void testBoardCreationFromHeader() throws InterruptedException {
        int before = getPersonalBoardsCount();
        clickOnPlusButtonOnHeader();
        selectCreateBoardFromDropDown();
        app.pauseThread(10000);
        typeBoardName("zaloopa");
        confirmBoardCreation();
        app.pauseThread(10000);
        returnToHomepage();
        app.pauseThread(7000);
        int after = getPersonalBoardsCount();
        Assert.assertEquals(after,before+1);
    }

    public void confirmBoardCreation() {
        app.click(By.xpath("//button[contains(text(),'Создать доску')]"));
    }

    public void returnToHomepage() {
        app.click(By.xpath("//a[@href='/']"));
    }

    public int getPersonalBoardsCount() {
        return app.wd.findElements(By.xpath("//h3[contains(text(),\"Персональные доски\")]/../..//li")).size()-1;
    }

    public void typeBoardName(String boardName) {
        app.type(By.cssSelector("[data-test-id=header-create-board-title-input]"), boardName);
    }

    public void type() {
        app.click(By.cssSelector("[data-test-id=header-create-board-title-input]"));
        app.wd.findElement(By.cssSelector("[data-test-id=header-create-board-title-input]")).clear();
        app.wd.findElement(By.cssSelector("[data-test-id=header-create-board-title-input]")).sendKeys("qa20");
    }

    public void selectCreateBoardFromDropDown() {
        app.click(By.cssSelector("[data-test-id=header-create-board-button]"));
    }

    public void clickOnPlusButtonOnHeader() {
        app.click(By.cssSelector("[name=add]"));
    }
}