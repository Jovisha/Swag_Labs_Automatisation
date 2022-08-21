package tests_with_login;

import dataCreation.DataCreation;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BuyItemPage;
import pages.VerificationPage;

public class BuyItemTest extends BaseTest{

    @Test (invocationCount = 1)
    public void buyItem(){
        BuyItemPage buyItemPage = new BuyItemPage(driver);
        VerificationPage verificationPage = new VerificationPage(driver);

        String[] persData = DataCreation.personalData();
        buyItemPage.buyItem(persData);

        try {
            verificationPage.verifyPurchasedItem("THANK YOU FOR YOUR ORDER");
            System.out.print("Purchase completed");
        }catch (Exception e){
            Assert.fail("Purchase in NOT completed");
        }
    }
}
