package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class About {

    WebDriver driver;

    public About(WebDriver driver){
     
     this.driver = driver;

    }


    public String getTitle(){

     return  driver.getTitle();

    }


}