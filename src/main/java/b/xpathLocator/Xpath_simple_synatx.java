package b.xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_simple_synatx {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        //tag name + attribute value
        By textinput=By.xpath("//input[@name='my-text']");
        driver.findElement(textinput).sendKeys("selenium course");
        //tagname + more than one attribute
        By textarea=By.xpath("//textarea[@class='form-control' and @rows='3']");
        driver.findElement(textarea).sendKeys("text area");
        //attribute only
        By datepicker=By.xpath("//*[@name='my-date']");
        driver.findElement(datepicker).click();
        //only tag name
        By submitbutton=By.xpath("//button");
        driver.findElement(submitbutton).click();
    }
}
