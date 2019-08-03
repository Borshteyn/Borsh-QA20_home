package com.telran.qa20.tests;

import com.telran.qa20.model.Team;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TeamCreationTests extends TestBase{
    @DataProvider
    public Iterator <Object[]> teamsPositive() throws IOException {
        List<Object[]> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(
                new FileReader(
                        new File("src/test/resources/Teams_positive.csv")));

        String line = reader.readLine();

        while(line != null) {
            String[] split = line.split(";");
            list.add(new Object[]{new Team()
                    .setTeamName(split[0])
                    .setTeamDescription(split[1])});
            line = reader.readLine();
        }
        return list.iterator();
    }
    @Test(enabled = false)
    public void createTeamTest() throws InterruptedException {
        app.getTeam().clickCreateTeamButton();
        app.getTeam().pauseThread(5000);
        app.getTeam().fillTeamForm(new Team().setTeamName("Tratata").setTeamDescription("Azaza"));
        app.getTeam().confirmCreation();
        app.getTeam().pauseThread( 5000);
    }

    @Test(dataProvider = "teamsPositive")
    public void createTeamTestDataProvider(Team team) throws InterruptedException {
        app.getTeam().clickCreateTeamButton();
        app.getTeam().pauseThread(5000);
        app.getTeam().fillTeamForm(team);
        app.getTeam().confirmCreation();
        app.getTeam().pauseThread(5000);
    }
}
