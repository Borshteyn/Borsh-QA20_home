package com.telran.qa20.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BoardCreationTests  extends TestBase{

    @Test
    public void testBoardCreationFromHeader() throws InterruptedException {
        app.getBoard().returnToHomepage();
        int before = app.getBoard().getPersonalBoardsCount();
        app.getBoard().clickOnPlusButtonOnHeader();
        app.getBoard().selectCreateBoardFromDropDown();
        app.getBoard().pauseThread(10000);
        app.getBoard().typeBoardName("zaloopa");
        app.getBoard().confirmBoardCreation();
        app.getBoard().pauseThread(10000);
        app.getBoard().returnToHomepage();
        app.getBoard().returnToHomepage();
        app.getBoard().pauseThread(7000);
        int after = app.getBoard().getPersonalBoardsCount();
        Assert.assertEquals(after,before+1);
    }
}