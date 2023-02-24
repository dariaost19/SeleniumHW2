package Homework2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        //HW1:
        //navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
        //fill out the form
        //click on register
        //close the browser
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.id("customer.firstName")).sendKeys("Daria");
        driver.findElement(By.name("customer.lastName")).sendKeys("Ostrenko");
        driver.findElement(By.id("customer.address.street")).sendKeys("123 New York Ave");
        driver.findElement(By.name("customer.address.city")).sendKeys("New York");
        driver.findElement(By.id("customer.address.state")).sendKeys("NY");
        driver.findElement(By.name("customer.address.zipCode")).sendKeys("10021");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("347-000-0000");
        driver.findElement(By.id("customer.ssn")).sendKeys("124-00-7486");
        driver.findElement(By.id("customer.username")).sendKeys("dariaost");
        driver.findElement(By.id("customer.password")).sendKeys("123321456");
        driver.findElement(By.name("repeatedPassword")).sendKeys("123321456");
        Thread.sleep(3000);
        driver.findElement(By.className("button")).click();
        Thread.sleep(3000);
        driver.quit();


    }
}
