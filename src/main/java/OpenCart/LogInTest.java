package OpenCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInTest {

    public static WebDriver driver;

    public static void main(String[] args) {

        launch_chrome();
        Open_URL();
        TC_001();
        TC_002();
        TC_003();
        TC_004();
        Close_Chrome();

    }

    public static void launch_chrome(){
        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();

    }
    public static void Open_URL(){
        driver.get("https://demo.opencart.com/index.php?route=account/login");
    }

    public static void TC_001(){
        WebElement Email=driver.findElement(By.id("input-email"));
        Email.clear();
        Email.sendKeys("Abrar@gmail.com");

        WebElement Password=driver.findElement(By.id("input-password"));
        Password.clear();
        Password.sendKeys("123456");

        WebElement LoginBtn=driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input"));
        LoginBtn.click();
        String Expected_Tittle="My Account";
        String Actual_Tittle=driver.getTitle();

        if (Expected_Tittle.equals(Actual_Tittle)){
            System.out.println("Test Case Pass");
        }
        else{
            System.out.println("Test Case Failed");
        }
        WebElement Logout=driver.findElement(By.linkText("Logout"));
        Logout.click();

        WebElement Login=driver.findElement(By.linkText("Login"));
        Login.click();




    }
    public static void TC_002() {
        WebElement Email = driver.findElement(By.id("input-email"));
        Email.clear();
        Email.sendKeys("brar@gmail.com");

        WebElement Password = driver.findElement(By.id("input-password"));
        Password.clear();
        Password.sendKeys("12345678");

        WebElement LoginBtn = driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input"));
        LoginBtn.click();



        String Expected_Tittle="Account Login";
        String Actual_Tittle=driver.getTitle();

        if (Expected_Tittle.equals(Actual_Tittle)){
            System.out.println("Test Case Pass");
        }
        else{
            System.out.println("Test Case Failed");
        }

    }

    public static void TC_003() {
        WebElement Email = driver.findElement(By.id("input-email"));
        Email.clear();
        Email.sendKeys("Abrar@gmail.com");

        WebElement Password = driver.findElement(By.id("input-password"));
        Password.clear();
        Password.sendKeys("1123456");

        WebElement LoginBtn = driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input"));
        LoginBtn.click();



        String Expected_Tittle="Account Login";
        String Actual_Tittle=driver.getTitle();

        if (Expected_Tittle.equals(Actual_Tittle)){
            System.out.println("Test Case Pass");
        }
        else{
            System.out.println("Test Case Failed");
        }


    }

    public static void TC_004() {
        WebElement Email = driver.findElement(By.id("input-email"));
        Email.clear();
        Email.sendKeys("Abriuoar@gmail.com");

        WebElement Password = driver.findElement(By.id("input-password"));
        Password.clear();
        Password.sendKeys("123456");

        WebElement LoginBtn = driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input"));
        LoginBtn.click();



        String Expected_Tittle="Account Login";
        String Actual_Tittle=driver.getTitle();

        if (Expected_Tittle.equals(Actual_Tittle)){
            System.out.println("Test Case Pass");
        }
        else{
            System.out.println("Test Case Failed");
        }

    }

    public static void Close_Chrome(){
        driver.close();
    }

}
