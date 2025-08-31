package b.xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_function {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        //text function
         driver.findElement(By.xpath("//*[text()='Submit']")).click();
        //contains with attribute
         By colorpicker=By.xpath("//*[contains(@type,'col')]");
         driver.findElement(colorpicker).click();
        //contains with text function  Partial Text Match (contains)
         By color=By.xpath("//*[contains(text(),'Color')]");
         driver.findElement(color).click();
        //any tag equal this value
         By submitbutton=By.xpath("//*[.='Submit']");
        driver.findElement(submitbutton).click();
        //get data that's her attribute equal this value
        driver.findElement(By.xpath("//*[@*='submit']")).click();
        driver.findElement(By.xpath("//*[@*='my-select']")).click();
        //PARENT TO CHILD
        driver.findElement(By.xpath("//div[@class='form-check']/../button")).click();
        //FOLLOWING-SIBLING
        // label[contains(.,'Textarea')]/following-sibling::div
        //preeding sibling
        //label[contains(.,'Textarea')]/preceding-sibling::label
        //ancestor form
        //label/textarea[@name="my-textarea"]/ancestor::form
    }
}
