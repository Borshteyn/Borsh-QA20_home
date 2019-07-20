package com.telran.qa20.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TeamHelper extends HelperBase {
    public TeamHelper(WebDriver wd) {
        super(wd);
    }

    public void confirmCreation() {
        click(By.xpath("//input[@type='submit']"));
    }

    public void enterTeamName() {
        type(By.id("org-display-name"),"paskudnik");
    }

    public void clickCreateTeamButton() {
        click(By.xpath("//span[contains(text(),'Создать')]/.."));
    }


}
