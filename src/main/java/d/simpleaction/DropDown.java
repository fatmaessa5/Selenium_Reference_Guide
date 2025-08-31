package d.simpleaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        By dropdownSelect=By.name("my-select");
        Select select= new Select(driver.findElement(dropdownSelect));
        /*--select by value --*/
        select.selectByValue("1");
        select.selectByValue("2");
        select.selectByValue("3");

        /*--select by index--*/
        select.selectByIndex(1);
        select.selectByIndex(2);
        select.selectByIndex(3);
        /*--select by visible content--*/
        select.selectByVisibleText("One");
        select.selectByVisibleText("One");
        select.selectByVisibleText("One");



    }
}
