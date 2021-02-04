package com.company;

import com.company.util.FileExtensionUtil;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class MaximizingWindowDeletingCookies {

    public void MaximizeYourWindows() throws IOException {

        //Set System Property to Chrom .exe file to invoke the browser below
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aisha Hlatshwayo\\Desktop\\chromedriver.exe");

        //Invoke the test in Chrome Driver = creating an object for my driver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();//Maximizing the browser
        driver.manage().deleteAllCookies(); //Deletes all Cookies in your Browser
//        driver.manage().deleteCookieNamed("sdf");//Deleting in a specific cookie

        //Scenario:
        //click on any link
        //long in page - verify login url


        driver.get("https://www.google.com");//Simply opening the website

//How to take Screenshots in Selenium
        //How to change driver object to capturing screen shot, by casting driver
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        /*First it casting driver object to take "TakesScreenshot"(So that it is ready to capture the screenshot) by using method"getScreenshotAs()"
        Method used to invoke web objects -> in the Parameter we are passing a 'FILE', that means we are telling the WebDriver script: Get the Output
        as a file format so that we can View so that we are storing in a Object called 'src' -> So its taking the google.com page and stores it in
        the 'src' page -> So that this Object can bring this screenshot into the desktop -> Which is a file called   FileUtils
         */
        FileUtils.copyFile(src, new File("C:\\Users\\Aisha Hlatshwayo\\screenshot.png")); //This is to see the screenshot on our local machine -> so we use a Java function called: FileUtils


    }
}
