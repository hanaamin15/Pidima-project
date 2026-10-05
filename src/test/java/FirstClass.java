import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstClass {
    @Test
    public void firstTest(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://staging.pidima.ai/login");
        driver.findElement(By.tagName("input")).sendKeys("ahmed.kamel@pidima.aio");
        driver.findElement(By.name("password")).sendKeys("12345678");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Search anything...']")).sendKeys("link");
        driver.findElement(By.xpath("//input[@placeholder='Search anything...']")).sendKeys(Keys.ENTER);
        /*driver.findElement(By.cssSelector("a[href='/forgot-password']")).click();
        driver.findElement(By.name("email")).sendKeys("ahmed.kamel@pidima.aio");*/



    }
}
