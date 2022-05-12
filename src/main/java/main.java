import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class main {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window();
        driver.get("https://www.lcwaikiki.com/tr-TR/TR");

        WebElement el1 = driver.findElement(By.cssSelector(".cart-dropdown .header-dropdown-toggle[href=\"https://www.lcwaikiki.com/tr-TR/TR/giris\"]"));
        el1.click();

        WebElement el2 = driver.findElement(By.cssSelector(".login-form__link[href=\"https://www.lcwaikiki.com/tr-TR/TR/uye-ol\"]"));
        el2.click();

        WebElement el3 = driver.findElement(By.cssSelector("#RegisterFormView_RegisterEmail"));
        el3.sendKeys("yanlismail@mail.com");

        WebElement el4 = driver.findElement(By.cssSelector("#RegisterFormView_Password"));
        el4.sendKeys("1234");

        WebElement el5 = driver.findElement(By.cssSelector("img[src='/Resource/Images/customer/show-password-open.png']"));
        el5.click();

        WebElement el6 = driver.findElement(By.cssSelector("#RegisterFormView_Password-error"));

        System.out.println(el6.getText());



    }
}
