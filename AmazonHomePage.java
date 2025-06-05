package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonHomePage {
    WebDriver driver;

    By searchBox = By.id("twotabsearchtextbox");
    By searchButton = By.id("nav-search-submit-button");

    public AmazonHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchForProduct(String product) {
        driver.findElement(searchBox).sendKeys(product);
        driver.findElement(searchButton).click();
    }
}
