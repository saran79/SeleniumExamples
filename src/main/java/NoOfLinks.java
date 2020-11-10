import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class NoOfLinks {

    WebDriver driver;
    @Before
    public void beforeTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void noOfLinks(){
      driver.get("http://www.nike.com/gb");
      List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("No of Links in Nike Home Page : " + allLinks.size());

        for(int i = 0;i<allLinks.size();i++){
            System.out.println("Link No : " + (i +1) + " " + allLinks.get(i).getText());
        }
    }
    @After
    public void afterTest(){
        driver.quit();
    }
}
