package week17homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();
        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(5000);
        driver.manage().window().maximize();

        Thread.sleep(3000);
        driver.findElement(By.className("ico-register")).click();   //Finding element by class Name
        Thread.sleep(5000);

        driver.findElement(By.id("gender-female")).click();          //Finding element by id
        Thread.sleep(3000);

        driver.findElement(By.id("FirstName")).sendKeys("Disha");
        Thread.sleep(3000);

        driver.findElement(By.cssSelector("input[id^='LastName']")).sendKeys("Upadhyay"); //Finding element by css Selector
        Thread.sleep(2000);

        WebElement day = driver.findElement(By.name("DateOfBirthDay"));
        WebElement month = driver.findElement(By.name("DateOfBirthMonth"));
        WebElement year = driver.findElement(By.name("DateOfBirthYear"));

        Select select = new Select(day);
        select.selectByVisibleText("14");
                                                    //Using Select Class Method
        Select select1 = new Select(month);
        select1.selectByVisibleText("October");


        selectValueFromDropDown(year,"1989");  //Using Generic Method
        Thread.sleep(3000);


        driver.findElement(By.id("Email")).sendKeys("dishatrivedi14@gmail.com");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='Company']")).sendKeys("Unify Testing"); //Finding element by xPath
        Thread.sleep(2000);

        driver.findElement(By.id("Newsletter")).click();

        driver.findElement(By.id("Password")).sendKeys("Disha123");

        WebDriverWait wait = new WebDriverWait(driver,20);  //Explicit Wait

        driver.findElement(By.id("ConfirmPassword")).sendKeys("Disha123");
        Thread.sleep(3000);

        driver.findElement(By.id("register-button")).click();

    }

   public static void selectValueFromDropDown(WebElement element, String value) {
       Select select = new Select(element);
      select.selectByVisibleText(value);
  }
}
