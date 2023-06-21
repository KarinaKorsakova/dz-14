package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Map;

public class ButtonsPage extends AbstractPageObject {
    private final By title = By.cssSelector(".app_logo");
    private final By filterDropDown = By.cssSelector(".product_sort_container");
    private final By linkTitle = By.cssSelector("a div");

    public ButtonsPage(WebDriver driver) {
        super(driver);
    }

    public String getTitleText() {
        return getElement(title).getText();
    }

    public ButtonsPage sort(String visibleText) {
        Select select = new Select(getElement(filterDropDown));
        select.selectByVisibleText(visibleText);
        return this;
    }

    public List<WebElement> getLinkTitleElements() {
        return getElements(linkTitle);
    }

    public ButtonsPage changeColorForTheFirstTitleLink(String color) {
        changeElementColor(linkTitle, color);
        return this;
    }

    private void changeElementColor(By linkTitle, String color) {
    }


}




