package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

public class NavigationTests {

    public static void main(String[] args) {

        String browserName = "";
        for (int i = 0; i < 3; i++){
            switch (i) {
                case 0:
                    browserName = "chrome";
                    break;
                case 1:
                    browserName = "firefox";
                    break;
                case 2:
                    browserName = "edge";
                    break;
            }

            WebDriver driver = BrowserFactory.GetDriver(browserName);
            System.out.println("Results for " + browserName + ": " );
            driver.get("https://google.com");
            String title1 = driver.getTitle();
            driver.get("https://etsy.com");
            String title2 = driver.getTitle();
            driver.navigate().back();
            String title1a= driver.getTitle();
            System.out.println(StringUtility.verifyEquals(title1,title1a));
            driver.navigate().forward();
            String title2a = driver.getTitle();
            System.out.println(StringUtility.verifyEquals(title2,title2a));
            driver.quit();
        }
    }
}
