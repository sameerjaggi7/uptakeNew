package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.Assert;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import pages.HomePage;

import pages.About;

public class Navigation {

    WebDriver driver;

    About objAbout;

    HomePage objHomePage;

    

    @BeforeTest

    public void openBrowser(){

        driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.uptake.com/");

    }

   

    @Test

    public void testNavigation(){


    objAbout = new About(driver);


    Assert.assertTrue(objAbout.getTitle().contains("About"));


    }