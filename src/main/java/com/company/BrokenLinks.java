package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

public class BrokenLinks {
    public void getBrokenUrl() throws IOException {
        //Set System Property to Chrom .exe file to invoke the browser below
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aisha Hlatshwayo\\Desktop\\chromedriver.exe");

        //Invoke the test in Chrome Driver = creating an object for my driver
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        //To get all links on the footer (all 'a' elements) and store then in a list
        List<WebElement> links = driver.findElements(By.xpath("//a[contains(text(),'Broken Link')]"));

        //Soft Assertions -> To avoid stopping your execution with the help of softAssert
        SoftAssert a = new SoftAssert();

        //Iterate through the list with 'Enhanced for loop'
        for (WebElement link : links) {

            //Broken URL
            //STEP 1: Is to get all URL's tied up to the links using selenium once you have the URL->
            //Java Methods will call URL's and get you th status code
            //If status code is >400 then the URL is not working -> link which is tied to URL is broken
            String url = link.getAttribute( "href");

            //Method OpenConnection comes from URL class
            HttpURLConnection conn =  (HttpURLConnection) new URL(url).openConnection();
            conn.setRequestMethod("HEAD");//Making a call to the method using a HEAD request method
            conn.connect();//this method will do what you've done your browser
            int respCode = conn.getResponseCode();//This method will give the code of the response of what you got
            System.out.println(respCode);
            a.assertTrue(respCode > 400, "The link with Text " + link.getText() + " is broken with code " + respCode);
        }
        //To catch all fail and report them
        a.assertAll();
    }
}
