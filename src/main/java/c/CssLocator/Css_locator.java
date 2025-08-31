package c.CssLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_locator {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        //by tag name:
        driver.findElement(By.cssSelector("textarea")).sendKeys("abc");
        //by tag name+class name
        driver.findElement(By.cssSelector("button.btn ")).click();
        //by tag name +id
        driver.findElement(By.cssSelector("input#my-text-id")).sendKeys("HOLA");
        //by tag name+attribute
        driver.findElement(By.cssSelector("input[list=\"my-options\"]")).click();
        //css ends wih
        driver.findElement(By.cssSelector("input[name$='word']")).sendKeys("123456");
        //css start with
        driver.findElement(By.cssSelector("input[name^='my-pass']")).sendKeys("123");
        // css with contain
        driver.findElement(By.cssSelector("textarea[name*='area']")).sendKeys("hello");
        //parent to child only
        driver.findElement(By.cssSelector("main div form label input#my-text-id")).sendKeys("SC");
    }
}
