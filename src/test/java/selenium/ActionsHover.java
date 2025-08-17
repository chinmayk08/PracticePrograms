package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsHover {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver wd=new ChromeDriver();
        wd.get("https://the-internet.herokuapp.com/");
        wd.manage().window().maximize();
        wd.findElement(By.xpath("//a[text()='Hovers']")).click();

        WebElement h1=wd.findElement(By.xpath("//img[@alt='User Avatar']"));
       WebElement h2=wd.findElement(By.xpath("(//img[@alt='User Avatar'])[2]"));
        WebElement h3=wd.findElement(By.xpath("(//img[@alt='User Avatar'])[3]"));

        Actions action=new Actions(wd);
        action.moveToElement(h1).perform();
        action.moveToElement(h2).perform();
        action.moveToElement(h3).perform();

        wd.findElement(By.linkText("Open in New Tab")).click();









    }
}
