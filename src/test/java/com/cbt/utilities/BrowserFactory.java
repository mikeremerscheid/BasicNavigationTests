package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.SystemUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.Driver;

public class BrowserFactory {

    public static WebDriver GetDriver(String browserName){
        switch (browserName){
            case "safari":
                if (SystemUtils.OS_NAME.contains("Windows")){
                    return null;
                }
            case "chrome":
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();
            case "edge":
                System.setProperty("webdriver.edge.driver","C:\\Program Files (x86)\\Microsoft Web Driver\\MicrosoftWebDriver.exe");
                WebDriverManager.edgedriver().setup();
                return new EdgeDriver();
            default:
                return null;
        }

    }
}
