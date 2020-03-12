package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification2 {

    public static void main(String[] args) {

        List<String> urls = Arrays.asList("https://luluandgeorgia.com",
                "https://wayfair.com/", "https://walmart.com", "https://westelm.com/");

        WebDriver driver = BrowserFactory.GetDriver("firefox");
        for (String each: urls){
            driver.get(each);
            String siteURL = driver.getCurrentUrl().replace("https://www.","").replace(".com/","");
            String siteTitle = driver.getTitle().replace(" ","").toLowerCase();
            System.out.println("SiteURL: " + siteURL + "... SiteTitle: " + siteTitle);
            System.out.println(siteTitle.contains(siteURL));
        }

        driver.quit();
    }
}
