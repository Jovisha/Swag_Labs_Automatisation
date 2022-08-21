package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuyItemPage extends BasePage{
    public BuyItemPage(WebDriver driver) {
        super(driver);
    }

    By addFirstItemToCartButtonBy = By.id("add-to-cart-sauce-labs-backpack");
    By openSecondItemDetailsPage = By.xpath("//*[@id=\"item_0_title_link\"]/div");
    By addSecondItemToCartButtonBy = By.id("add-to-cart-sauce-labs-bike-light");
    By shoppingCartLinkBy = By.className("shopping_cart_badge");
    By removeFirstItemBy = By.id("remove-sauce-labs-backpack");
    By checkoutButtonBy = By.id("checkout");
    By firstNameInputFieldBy = By.id("first-name");
    By lastNameInputFieldBy = By.id("last-name");
    By postalCodeInputFieldBy = By.id("postal-code");
    By continueButtonBy = By.id("continue");
    By finishButtonBy = By.id("finish");

    public BuyItemPage buyItem(String[] persData){
        click(addFirstItemToCartButtonBy);
        click(openSecondItemDetailsPage);
        click(addSecondItemToCartButtonBy);
        click(shoppingCartLinkBy);
        click(removeFirstItemBy);
        click(checkoutButtonBy);
        writeText(firstNameInputFieldBy,persData[0]);
        writeText(lastNameInputFieldBy,persData[1]);
        writeText(postalCodeInputFieldBy,persData[2]);
        click(continueButtonBy);
        click(finishButtonBy);
        return this;
    }
}
