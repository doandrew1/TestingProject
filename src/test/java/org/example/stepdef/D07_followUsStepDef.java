package org.example.stepdef;
import static org.example.stepdef.hooks.driver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.page.homepage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class D07_followUsStepDef {
    homepage home = new homepage();

    @When("user could click opens facebook link")
    public void UserCouldClickOpensFacebookLink(){
    home.face().click();
    }

    @Then("facebook will opened")
    public void facebookWillOpened() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        Set<String> tabs = driver.getWindowHandles();
        ArrayList<String> arraytabs = new ArrayList<String>(tabs);
        driver.switchTo().window(arraytabs.get(1));
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, "https://www.facebook.com/nopCommerce");
        Thread.sleep(2000);
    }


    @When("user opens twitter link")
    public void userOpensTwitterLink() {
    home.twit().click();
    }

    @Then("twitter will be opened")
    public void twitterWillBeOpened() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        Set<String> tabs = driver.getWindowHandles();
        ArrayList<String> arraytabs = new ArrayList<String>(tabs);
        driver.switchTo().window(arraytabs.get(1));
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, "https://twitter.com/nopCommerce");
        Thread.sleep(2000);
    }


    @When("user opens rss link")
    public void userOpensRssLink() {
     home.rss().click();

    }

    @Then("rss will be opened")
    public void rssWillBeOpened() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        Set<String> tabs = driver.getWindowHandles();
        ArrayList<String> arraytabs = new ArrayList<String>(tabs);
        driver.switchTo().window(arraytabs.get(1));
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, "https://demo.nopcommerce.com/new-online-store-is-open");
        Thread.sleep(2000);
    }


    @When("user opens youtube link")
    public void userOpensYoutubeLink() {
        home.yout().click();
    }

    @Then("youtube will be opened")
    public void youtubeWillBeOpened() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        Set<String> tabs = driver.getWindowHandles();
        ArrayList<String> arraytabs = new ArrayList<String>(tabs);
        driver.switchTo().window(arraytabs.get(1));
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, "https://www.youtube.com/user/nopCommerce");
        Thread.sleep(2000);

    }
}

