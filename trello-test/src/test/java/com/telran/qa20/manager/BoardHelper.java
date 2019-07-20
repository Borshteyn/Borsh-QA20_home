package com.telran.qa20.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BoardHelper extends HelperBase {
    public BoardHelper(WebDriver wd) {
        super(wd);
    }

    public void confirmBoardCreation() {
        click(By.xpath("//button[contains(text(),'Создать доску')]"));
    }

    public void returnToHomepage() {
        click(By.xpath("//a[@href='/']"));
    }

    public int getPersonalBoardsCount() {
        return wd.findElements(By.xpath("//h3[contains(text(),\"Персональные доски\")]/../..//li")).size()-1;
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
