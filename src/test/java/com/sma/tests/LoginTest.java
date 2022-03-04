package com.sma.tests;

import com.sma.config.ConfigFactory;

import org.testng.annotations.Test;

public class LoginTest {

    @Test
    public void testLogin() {

        System.out.println(ConfigFactory.getConfig().browser());

        /*WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://sma.bajajfinserv.in/");*/
    }
}
