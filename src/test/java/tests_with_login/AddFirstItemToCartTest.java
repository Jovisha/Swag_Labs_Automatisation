package tests_with_login;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddFirstItemPage;
import pages.VerificationPage;

public class AddFirstItemToCartTest extends BaseTest{

    @Test
    public void addFirstItem(){
        AddFirstItemPage addFirstItemPage = new AddFirstItemPage(driver);
        VerificationPage verificationPage = new VerificationPage(driver);

        addFirstItemPage.addFirstItemToCart();

        try {
            verificationPage.verifyItemsInCart("1");
            System.out.print("First item is added to cart badge");
        }catch (Exception e){
            Assert.fail("First item is NOT added to cart badge");
        }



    }
}
