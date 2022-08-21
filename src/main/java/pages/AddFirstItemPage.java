package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddFirstItemPage extends BasePage{
    public AddFirstItemPage(WebDriver driver) {
        super(driver);
    }

    By addFirstItemToCartButtonBy = By.id("add-to-cart-sauce-labs-backpack");

    public AddFirstItemPage addFirstItemToCart(){
        click(addFirstItemToCartButtonBy);
        return this;
    }
}
