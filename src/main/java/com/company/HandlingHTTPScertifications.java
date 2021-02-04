package com.company;

import com.company.util.FileExtensionUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;

public class HandlingHTTPScertifications {

    public static void main(String[] args) throws IOException {

        //SSl certificates

//Desired capabilities=
//general chrome profile - its customised given the 'ch' knowledge so that we can integrate the Chrome Browser
        DesiredCapabilities ch=DesiredCapabilities.chrome();
//ch.acceptInsecureCerts(); INJECTING
        ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);//Whichever ACCEPT INSECURE CERT I GET SHOULD ACCEPT IT
        ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

//Belows to your local browser - and you are merging the profile you have created above 'ch' to your ChromeOptions object 'c' Browser below
        ChromeOptions c= new ChromeOptions();
        c.merge(ch);
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aisha Hlatshwayo\\Desktop\\chromedriver.exe");
        WebDriver driver=new ChromeDriver(c); //'c' object is passed as an argument

        driver.get("https://www.google.com");//Simply opening the website

        MaximizingWindowDeletingCookies max = new MaximizingWindowDeletingCookies();
        max.MaximizeYourWindows();

        FileExtensionUtil f = new FileExtensionUtil();
        f.getFileExtension();

        BrokenLinks brokenlinks = new BrokenLinks();
        brokenlinks.getBrokenUrl();
    }
}
