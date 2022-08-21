package tests_with_login;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddSecondItemPage;
import pages.VerificationPage;

public class AddSecondItemToCartTest extends BaseTest{

    @Test
    public void addSecondItem(){
        AddSecondItemPage addSecondItemPage = new AddSecondItemPage(driver);
        VerificationPage verificationPage = new VerificationPage(driver);

        addSecondItemPage.addSecondItemToCart();

        try {
            verificationPage.verifyItemsInCart("2");
            System.out.print("Both items are added to cart badge");
        }catch (Exception e){
            Assert.fail("Both items are NOT added to cart badge");
        }



    }
}
