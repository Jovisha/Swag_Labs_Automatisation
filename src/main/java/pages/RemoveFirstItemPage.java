package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RemoveFirstItemPage extends BasePage{
    public RemoveFirstItemPage(WebDriver driver) {
        super(driver);
    }

    By addFirstItemToCartButtonBy = By.id("add-to-cart-sauce-labs-backpack");
    By openSecondItemDetailsPage = By.xpath("//*[@id=\"item_0_title_link\"]/div");
    By addSecondItemToCartButtonBy = By.id("add-to-cart-sauce-labs-bike-light");
    By shoppingCartLinkBy = By.className("shopping_cart_badge");
    By removeFirstItemBy = By.id("remove-sauce-labs-backpack");

    public RemoveFirstItemPage removeFirstItem(){
        click(addFirstItemToCartButtonBy);
        click(openSecondItemDetailsPage);
        click(addSecondItemToCartButtonBy);
        click(shoppingCartLinkBy);
        click(removeFirstItemBy);
        return this;
    }
}
