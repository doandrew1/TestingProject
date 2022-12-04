package org.example.stepdef;
import static org.example.stepdef.hooks.driver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.page.homepage;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D08_WishlistStepDef {
    homepage home = new homepage();
    @When("User click on  the wishlist button")
    public void userClickOnTheWishlistButton() throws InterruptedException {
        home.wishlist().get(2).click();
        Thread.sleep(3000);
    }

    @Then("Chick if The product has been added to your wishlist")
    public void theProductHasBeenAddedToYourWishlist() {
        SoftAssert soft = new SoftAssert();
        String actualMsg = home.mass().getText();
        soft.assertEquals(actualMsg,"The product has been added to your wishlist");
        String actualCol = home.rec().getCssValue("background-color");
        actualCol = Color.fromString(actualCol).asHex();
        soft.assertEquals(actualCol,"#4bb07a");
        soft.assertAll();
    }

    @When("User click on  the wishlist button fot sec time")
    public void userClickOnTheWishlistButtonFotSecTime() throws InterruptedException {
        home.wishlist().get(2).click();
        Thread.sleep(3000);
    }

    @And("Click on  wishlist on the top")
    public void clickOnWishlistOnTheTop() throws InterruptedException {;
        Thread.sleep(3000);
        home.wish().click();
    }

    @Then("Quantity > Zero")
    public void quantityZero() {
    String number = home.Qty().getAttribute("value");
        Assert.assertNotEquals(number,"0");
    }
}
