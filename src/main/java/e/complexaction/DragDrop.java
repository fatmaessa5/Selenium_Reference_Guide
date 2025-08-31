package e.complexaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://training.aimtech.online/ui-testing/");
        By Drag_Drop=By.xpath("//*[contains(text(),'Practice d')]");
        driver.findElement(Drag_Drop).click();
        By Item1=By.cssSelector("button[data-test='drag-handle-Item 1']");
        By Item2=By.cssSelector("button[data-test='drag-handle-Item 2']");
        By Item3=By.cssSelector("button[data-test='drag-handle-Item 3']");

        Actions actions=new Actions(driver);
        WebElement item1=driver.findElement(Item1);
        WebElement item2=driver.findElement(Item2);
        WebElement item3=driver.findElement(Item3);
        actions.dragAndDrop(item1,item2).perform();
        actions.dragAndDrop(item1,item3).perform();
    }
}
