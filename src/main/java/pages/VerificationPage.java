package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VerificationPage extends BasePage{
    public VerificationPage(WebDriver driver) {
        super(driver);
    }

    By cartBadgeUpdateBy = By.className("shopping_cart_badge");
    By completedOrderGreetingBy = By.className("complete-header");

    public VerificationPage verifyItemsInCart(String expectedText){
        String itemInCart = readText(cartBadgeUpdateBy);
        assertStringEquals(itemInCart,expectedText);
        return this;
    }

    public VerificationPage verifyPurchasedItem(String expectedText){
        String purchasedItem = readText(completedOrderGreetingBy);
        assertStringEquals(purchasedItem,expectedText);
        return this;
    }
}
