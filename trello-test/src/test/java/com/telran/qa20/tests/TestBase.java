package com.telran.qa20.tests;

import com.telran.qa20.manager.ApplicationManager;
import org.openqa.selenium.remote.BrowserType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.lang.reflect.Method;

public class TestBase {


    static ApplicationManager app =
            new ApplicationManager(System.getProperty("browser",BrowserType.CHROME));
    Logger logger = LoggerFactory.getLogger(TestBase.class); //org.s4lfj - чет такое

    @BeforeSuite
    public void setUp() throws InterruptedException {
        app.init();
    }

    @AfterSuite
    public void tearDown() {
        app.stop();
    }

    @BeforeMethod
    public void startLogger(Method m){
        logger.info("=========================================================================");
        logger.info("Start");

    }

    @AfterMethod
    public void stopLogger(Method m){
        logger.info("Stop");
        logger.info("=========================================================================");
    }
}

// //span[@class='icon-lg icon-member']/../../..//li - находим Спан иконку,
// поднимаемся на три директории вверх до необходимого большого блока, внутри него находим все li элементы