package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Main {

    public static void main(String[] args) {
	// chrome browser----->chromedriver
        //1.open the chrome browser
        System.setProperty("webdriver.chrome.driver", "C://selenium jars and drivers//drivers//chromedriver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        //2.navigate to the url
        driver.get("https://www.google.com");

        //3.close the browser
        driver.close();
    }
}
