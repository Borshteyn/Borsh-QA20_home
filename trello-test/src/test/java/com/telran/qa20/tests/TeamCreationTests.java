package com.telran.qa20.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TeamCreationTests extends TestBase{
    @Test
    public void createTeamTest() throws InterruptedException {
        app.getTeam().clickCreateTeamButton();
        app.getTeam().pauseThread(5000);
        app.getTeam().enterTeamName();
        app.getTeam().confirmCreation();
        app.getTeam().pauseThread(5000);
    }
}
