package tests_with_login;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RemoveFirstItemPage;
import pages.VerificationPage;

public class RemoveFirstItemTest extends BaseTest{

    @Test
    public void removeFirstItem(){
        RemoveFirstItemPage removeFirstItemPage = new RemoveFirstItemPage(driver);
        VerificationPage verificationPage = new VerificationPage(driver);

        removeFirstItemPage.removeFirstItem();

        try {
            verificationPage.verifyItemsInCart("1");
            System.out.print("First item is removed from the cart");
        }catch (Exception e){
            Assert.fail("First item is NOT removed from the cart");
        }
    }
}
