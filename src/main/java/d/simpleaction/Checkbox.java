package d.simpleaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Checkbox {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        By checkedcheckbox =By.id("my-check-1");
        By Defaultcheckbox =By.id("my-check-2");
        By checkedradio    =By.id("my-radio-1");
        By Defaultradio    =By.id("my-radio-2");
        selectedCheckbox(driver,checkedcheckbox);
        selectedCheckbox(driver,Defaultcheckbox);
        selectedCheckbox(driver,checkedradio);
        selectedCheckbox(driver,Defaultradio);

    }

    public static void selectedCheckbox(WebDriver driver, By locator) {
        if (!driver.findElement(locator).isSelected())
            driver.findElement(locator).click();
    }
    public static void dselectedCheckbox(WebDriver driver, By locator) {
    if (driver.findElement(locator).isSelected())
        driver.findElement(locator).click();
}
}

