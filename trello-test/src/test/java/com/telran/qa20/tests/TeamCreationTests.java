package com.telran.qa20.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TeamCreationTests extends TestBase{

    @BeforeMethod
    public void returnToBoards() {
        app.getBoard().returnToHomepage();
    }
    @Test
    public void createTeamTest() throws InterruptedException {
        app.getTeam().clickCreateTeamButton();
        app.getTeam().enterTeamName();
        app.getTeam().confirmCreation();
    }
}
