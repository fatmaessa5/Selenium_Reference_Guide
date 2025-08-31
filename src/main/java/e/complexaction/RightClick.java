package e.complexaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://training.aimtech.online/ui-testing/");
        By context=By.cssSelector("a[data-test='nav-context-menu']");
        driver.findElement(context).click();
        By rightclick=By.xpath("//*[text()='Right-click here to open context menu']");
        WebElement element= driver.findElement(rightclick);

        Actions actions=new Actions(driver);
        actions.contextClick(element).perform();//by using perform

        /*--or by using build--*/
//       Action input= actions.contextClick(element).build();
//       input.perform();

    }
}
