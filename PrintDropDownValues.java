package week17homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class PrintDropDownValues {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();
        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(5000);
        driver.manage().window().maximize();

        Thread.sleep(3000);
        driver.findElement(By.className("ico-register")).click();   //Finding element by class Name
        Thread.sleep(5000);


        WebElement day = driver.findElement(By.name("DateOfBirthDay"));

        Select select = new Select(day);

        List<WebElement> dayList = select.getOptions();
       // System.out.println(dayList.size());

        for (int a = 0; a <dayList.size(); a++) {
            String value = dayList.get(a).getText();
            System.out.println(value);
        }
        WebElement month = driver.findElement(By.name("DateOfBirthMonth"));

        Select s1 = new Select(month);

        List<WebElement> monthList = s1.getOptions();

        for(int b=0; b< monthList.size(); b++) {
            String value1 = monthList.get(b).getText();
            System.out.println(value1);
        }
        WebElement year = driver.findElement(By.name("DateOfBirthYear"));

        Select s2 = new Select(year);

        List<WebElement> yearList = s2.getOptions();

        for(int c=0; c<yearList.size(); c++) {
            String value2 = yearList.get(c).getText();
            System.out.println(value2);
        }

        }
    }
