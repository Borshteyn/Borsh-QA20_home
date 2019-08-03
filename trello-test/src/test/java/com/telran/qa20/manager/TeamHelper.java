package com.telran.qa20.manager;

import com.telran.qa20.model.Team;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TeamHelper extends HelperBase {
    public TeamHelper(WebDriver wd) {
        super(wd);
    }

    public void confirmCreation() {
        click(By.xpath("//input[@type='submit']"));
    }

    public void fillTeamForm(Team team) {
        type(By.id("org-display-name"),team.getTeamName());
        type(By.id("org-desc"),team.getTeamDescription());
    }

    public void clickCreateTeamButton() {
        click(By.xpath("//button[@data-test-id='home-navigation-create-team-button']"));
    }
}
