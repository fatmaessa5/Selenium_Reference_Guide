package e.complexaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Alert {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://training.aimtech.online/ui-testing/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.findElement(By.xpath("//*[@*='nav-alerts']")).click();
        WebElement showAlertBtn = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//button[contains(text(),'Show Alert')]")));
        showAlertBtn.click();
        WebElement confirmAlertBtn = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.cssSelector("button[data-test='confirm-button']")));
        WebElement performAlertBtn = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.cssSelector("button[data-test='prompt-button']")));
        Actions actions = new Actions(driver);
        actions.moveToElement(showAlertBtn).click().perform();
    }
}
