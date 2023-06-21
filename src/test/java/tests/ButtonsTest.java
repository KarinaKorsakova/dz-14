package tests;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ButtonsTest extends BaseTest {

    private final static String buttonName = "Click Me";


    @Test
    @Description("Тест відкриває сторінку https://demoqa.com/elements, натискає на Buttons, клікає кнопку Click Me, рахує і виводить в консоль текст повідомлення")
    public static void testButtonClick() {

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/buttons");

        String buttonText = "Click Me";
        String xpathExpression = "//button[text()='" + buttonText + "']";
        WebElement buttonElement = driver.findElement(By.xpath(xpathExpression));

        buttonElement.click();


        Assert.assertEquals("You have done a dynamic click", "You have done a dynamic click",
                "Message is correct");

        driver.quit();
    }
}