package e.complexaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hover {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://training.aimtech.online/ui-testing/");
        driver.findElement(By.cssSelector("button[data-test='theme-toggle']")).click();
        Actions actions=new Actions(driver);
        By hoverStateLocator = By.xpath("//a[@data-test='nav-hover']");
        driver.findElement(hoverStateLocator).click();
        Thread.sleep(1000);
        // Actions actions=new Actions(driver);
        By figure1=By.xpath("//div[@data-test='hover-figure-1']");
        By figure2=By.xpath("//div[@data-test='hover-figure-2']");
        By figure3=By.xpath("//div[@data-test='hover-figure-3']");

        WebElement element1= driver.findElement(figure1);
        WebElement element2= driver.findElement(figure2);
        WebElement element3= driver.findElement(figure3);
        actions.moveToElement(element1).perform();
        actions.moveToElement(element2).perform();
        actions.moveToElement(element3).perform();
    }
}
