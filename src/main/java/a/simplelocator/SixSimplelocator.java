package a.simplelocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SixSimplelocator {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        //1-By ID
        driver.findElement(By.id("my-text-id")).sendKeys("selenium course");
        //2-By Name
        driver.findElement(By.name("my-password")).sendKeys("123456");
        //3-By Tag Name
        driver.findElement(By.tagName("textarea")).sendKeys("text area");
        //4- By Link Text
        driver.findElement(By.linkText("Return to index")).click();
        //5- By Partial Link Text
        driver.findElement(By.partialLinkText("Return")).click();
        Thread.sleep(4000);
        driver.navigate().back();
        //6- By class name
        driver.findElement(By.className("btn-outline-primary")).click();


    }


}
