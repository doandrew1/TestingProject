package org.example.stepdef;
import static org.example.stepdef.hooks.driver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.page.homepage;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class D06_homeSlidersStepDef {
    homepage home = new homepage();

    @When("The user will click on the first slide\\(Nokia)")
    public void theUserWillClickOnTheFirstSlideNokia() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.attributeContains(home.twt(0),"class","nivo-control active"));
        home.slide().click();


    }
    @Then("user must go to nokia page")
    public void userMustGoToNokiaPage() throws InterruptedException {
        Thread.sleep(1000);
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, "https://demo.nopcommerce.com/nokia-lumia-1020");
    }



        @When("The user will click on the secound slide \\(iphone)")
        public void theUserWillClickOnTheSecoundSlideIphone() {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.attributeContains(home.twt(1),"class","nivo-control active"));
            home.slide().click();
        }

    @Then("user must go to iphone page")
    public void userMustGoToIphonePage() throws InterruptedException {
        Thread.sleep(1000);
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, "https://demo.nopcommerce.com/iphone-6");
    }
}


