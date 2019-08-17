package com.telran.qa20.tests;

import com.telran.qa20.framework.ApplicationManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.lang.reflect.Method;

public class TestBase {


    static ApplicationManager app =
            new ApplicationManager();
    Logger logger = LoggerFactory.getLogger(TestBase.class); //org.s4lfj - чет такое

    @BeforeSuite
    public void setUp() throws InterruptedException {
        app.init();
    }

    @AfterSuite
    public void tearDown() {
        //app.stop();
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
