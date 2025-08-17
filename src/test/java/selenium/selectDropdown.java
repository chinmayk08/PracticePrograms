package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class selectDropdown {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeDriver wd= new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wd.get("https://the-internet.herokuapp.com/");
        wd.findElement(By.xpath("//a[text()='Dropdown']")).click();
        WebElement drop=wd.findElement(By.id("dropdown"));
        Select drp=new Select(drop);

        List<WebElement> option=drp.getOptions();
        for(WebElement options:option) {
            String str = options.getText();

            System.out.println(str);
        }
    }
}
