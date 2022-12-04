package org.example.stepdef;
import static org.example.stepdef.hooks.driver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.page.homepage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class D04_searchStepDef {
    homepage home =new homepage();
    static String search;
    @When("The user enter the product {string}")
    public void theUserEnterTheProductName(String name) {
        search=name;
        home.searchField().sendKeys(search);
    }

    @And("The press on the search bottom")
    public void thePressOnTheSearchBottom() {
        home.searchButton().click();
    }

    @Then("results must be shown")
    public void resultsMustBeShown() {
        SoftAssert soft = new SoftAssert();
        String actualUrl = driver.getCurrentUrl();
        soft.assertEquals(actualUrl,"https://demo.nopcommerce.com/search?q=" +search);
        int size = home.AddCard().size();
        for (int x=0 ;x<size;x++)
        {
        String productname = home.productname().get(x).getText();
        System.out.println(productname.toLowerCase());
        }
        soft.assertAll();
    }


    @And("click on the product")
    public void clickOnTheProduct() {

        home.product().click();
    }

    @Then("Results must be shown secoundly")
    public void resultsMustBeShownSecoundly() {
        String actualMsg = home.sku().getText();
        Assert.assertEquals(actualMsg,search);
    }
}

