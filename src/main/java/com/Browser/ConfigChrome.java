package com.Browser;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfigChrome {

    public static WebDriver driver;

    public static void main(String[] args) {

        launch_chrome();
        //max_size();

        //Open_URL();


    }

        public static void launch_chrome(){

        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }

}
