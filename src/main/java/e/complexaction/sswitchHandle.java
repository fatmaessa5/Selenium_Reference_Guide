package e.complexaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sswitchHandle {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get(" https://the-internet.herokuapp.com/windows");
        driver.findElement(By.linkText("Click Here")).click();
        Object[] handles=driver.getWindowHandles().toArray();

        driver.switchTo().window((String) handles[1]);
        System.out.println(driver.getTitle());
        driver.switchTo().window((String) handles[0]);
        System.out.println(driver.getTitle());
    }

}
