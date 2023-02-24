package Homework2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        //navigate to fb.com
        //click on create new account
        //fill up all the textboxes
        //click on sign up button
        //close the pop up
        //close the browser
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Barbara");
        driver.findElement(By.name("lastname")).sendKeys("Fox");
        driver.findElement(By.name("reg_email__")).sendKeys("barbarafox@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("barbarafox@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("barbara123");
        driver.findElement(By.name("birthday_month")).sendKeys("01");
        driver.findElement(By.name("birthday_day")).sendKeys("01");
        driver.findElement(By.name("birthday_year")).sendKeys("1980");
        driver.findElement(By.xpath("//*[contains(text(),'Female')]")).click();
    //    driver.findElement(By.className("_58mt")).click(); will select female only 
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(2000);
        driver.close();
        driver.quit();


    }
}
