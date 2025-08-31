package d.simpleaction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class simple {
    public static void main(String[] args) {
        //simple action like
        // click
        // send keys
        // clear
        // send keys
        // tab
        // enter
        //shift
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        driver.findElement(By.id("my-text-id")).sendKeys("selenium ");
        //driver.findElement(By.linkText("Return to index")).click();
        driver.findElement(By.name("my-password")).sendKeys("123456");
        driver.findElement(By.name("my-password")).clear();
        driver.findElement(By.tagName("textarea")).sendKeys(Keys.TAB);
        driver.findElement(By.tagName("textarea")).sendKeys(Keys.ENTER);
        driver.findElement(By.tagName("textarea")).sendKeys(Keys.TAB);





    }
}
