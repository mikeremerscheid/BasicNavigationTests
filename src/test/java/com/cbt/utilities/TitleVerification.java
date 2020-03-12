package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification {
    public static void main(String[] args) throws Exception {
        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");

        WebDriver driver = BrowserFactory.GetDriver("chrome");
        for (String each: urls){
            driver.get(each);
            Thread.sleep(1000);
            String actualURL = driver.getCurrentUrl();
            String expectedURL = "http://practice.cybertekschool.com";
            System.out.println(actualURL.startsWith(expectedURL));
        }

        driver.quit();
    }


}
