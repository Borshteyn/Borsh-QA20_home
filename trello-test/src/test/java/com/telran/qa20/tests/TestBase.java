package com.telran.qa20.tests;

import com.telran.qa20.manager.ApplicationManager;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class TestBase {


    ApplicationManager app = new ApplicationManager(BrowserType.CHROME);

    @BeforeSuite
    public void setUp() throws InterruptedException {
        app.init();
    }

    @AfterSuite
    public void tearDown() {
        app.stop();
    }
}

// //span[@class='icon-lg icon-member']/../../..//li - находим Спан иконку,
// поднимаемся на три директории вверх до необходимого большого блока, внутри него находим все li элементы