import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.lang.model.element.Element;
import javax.swing.*;
import java.sql.Driver;

public class KitapYurdu extends kitapYurduClass{
    public void main() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\testinium\\Selenium\\ChromeDriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.kitapyurdu.com/");
        driver.manage().window().maximize();
        Actions action = new Actions(driver);


        driver.findElement(By.cssSelector("div[class='menu-top-button login']")).click();
        driver.findElement(By.id("login-email")).sendKeys("serkan.kekecd@hotmail.com");
        Thread.sleep(Long.parseLong("1000"));
        driver.findElement(By.id("login-password")).sendKeys("123456789");
        driver.findElement(By.cssSelector("div[class='ky-form-buttons']")).click();
        Thread.sleep(Long.parseLong("2000"));
        driver.findElement(By.id("search-input")).sendKeys("Çocuk");
        driver.findElement(By.cssSelector("span[class='common-sprite button-search']")).click();
        Thread.sleep(Long.parseLong("2000"));
        driver.findElement(By.xpath("(//div[@class='name']/a)[1]")).click();
        //driver.findElement(By.xpath("(//div[@class='menu top my-list'/a)[1]")).click();
        //driver.findElement(By.xpath("(//a[text()='Listelerim')")).click();
        driver.findElement(By.cssSelector("span[class='personal-lists__text']")).click();
        WebElement element = driver.findElement(By.xpath("//a[text()='Listelerim']"));
        action.moveToElement(element).build().perform();
        element.click();

        driver.findElement(By.xpath("//a[text()='Favorilerim']")).click();
        Thread.sleep(Long.parseLong("1000"));
        driver.findElement(By.cssSelector("a[class='add-to-cart']")).click();
        Thread.sleep(Long.parseLong("1000"));
        driver.findElement(By.cssSelector("i[class='green fa fa-shopping-cart']")).click();
        driver.findElement(By.name("quantity")).clear();
        driver.findElement(By.name("quantity")).sendKeys("2");
        driver.findElement(By.cssSelector("i[class='fa fa-refresh green-icon']")).click();
        Thread.sleep(Long.parseLong("1000"));
        driver.findElement(By.cssSelector("div[class='right']")).click();

        Thread.sleep(Long.parseLong("2000"));

        driver.findElement(By.cssSelector("a[class='checkout-logo']")).click();
        Thread.sleep(Long.parseLong("1000"));
        driver.findElement(By.xpath("//span[@id='cart-items']")).click();
        Thread.sleep(Long.parseLong("1000"));
        driver.findElement(By.cssSelector("i[title='Kaldır']")).click();
        Thread.sleep(Long.parseLong("1000"));
        WebElement listDrop = driver.findElement(By.xpath("//a[text()='Listelerim']"));
        action.moveToElement(listDrop).build().perform();
        listDrop.click();
        driver.findElement(By.xpath("//a[text()='Favorilerim']")).click();
        Thread.sleep(Long.parseLong("1000"));
        driver.findElement(By.cssSelector("i[class='fa fa-heart-o']")).click();
        driver.quit();

    }
}
