import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BoardCreationTests  extends TestBase{
    @BeforeMethod
    public void ensurePreconditions() throws InterruptedException {
        login("shura.borshteyn.92@mail.ru", "4d70D56E");
    }
    @Test
    public void testBoardCreationFromHeader() throws InterruptedException {
        clickOnPlusButtonOnHeader();
        selectCreateBoardFromDropDown();
        pauseThread(10000);
        typeBoardName("qa-20");
    }

    public void typeBoardName(String boardName) {
        type(By.cssSelector("[data-test-id=header-create-board-title-input]"), boardName);
    }

    public void type() {
        click(By.cssSelector("[data-test-id=header-create-board-title-input]"));
        wd.findElement(By.cssSelector("[data-test-id=header-create-board-title-input]")).clear();
        wd.findElement(By.cssSelector("[data-test-id=header-create-board-title-input]")).sendKeys("qa20");
    }

    public void selectCreateBoardFromDropDown() {
        click(By.cssSelector("[data-test-id=header-create-board-button]"));
    }

    public void clickOnPlusButtonOnHeader() {
        click(By.cssSelector("[name=add]"));
    }
}