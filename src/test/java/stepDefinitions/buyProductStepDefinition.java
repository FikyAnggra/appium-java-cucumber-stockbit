package stepDefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.net.URL;
import java.time.Duration;
import java.util.*;

public class buyProductStepDefinition {

    UiAutomator2Options options = new UiAutomator2Options();

    public static AndroidDriver driver;

    @Given("User Open Application")
    public void userOpenApplication() {
        try {
            baseStep.setup();
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
        } catch (Exception e) {
            Assert.fail("Failed User Open Application : "+e.getMessage());
        }

    }

    @When("Verify The Application Opened")
    public void verifyTheApplicationOpened() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(600));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.saucelabs.mydemoapp.android:id/mTvTitle")));
        } catch (Exception e) {
            Assert.fail("Failed Verify The Application Opened : "+e.getMessage());
        }

    }

    @And("User Choose Product Sauce Lab Back Packs")
    public void userChooseProductSauceLabBackPacks() {
        try {
            driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='Sauce Lab Back Packs']")).click();
        } catch (Exception e) {
            Assert.fail("Failed User Choose Product Sauce Lab Back Packs : "+e.getMessage());
        }
    }

    @Then("Verify Redirect To Detail Product Page")
    public void verifyRedirectToDetailProductPage() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(600));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.saucelabs.mydemoapp.android:id/mTvTitle")));
        } catch (Exception e) {
            Assert.fail("Failed Verify The Application Opened : "+e.getMessage());
        }
    }

    @And("User Choose Blue Color")
    public void userChooseBlueColor() {
        try {
            driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='Blue color']")).click();
        } catch (Exception e) {
            Assert.fail("Failed User Choose Blue Color : "+e.getMessage());
        }

    }

    @Then("Verify The Color is selected")
    public void verifyTheColorIsSelected() {
        try {
            WebElement element = driver.findElement(By.xpath("//androidx.recyclerview.widget.RecyclerView[@content-desc='Displays available colors of selected product']/android.view.ViewGroup[2]"));
            element.findElement(By.id("com.saucelabs.mydemoapp.android:id/aroundIV"));
        } catch (Exception e) {
            Assert.fail("Failed Verify The Color is selected : "+e.getMessage());
        }
    }

    @And("User Increase Quantity to two items")
    public void userIncreaseQuantityToItems() {
        try {
            WebElement element = driver.findElement(By.id("com.saucelabs.mydemoapp.android:id/plusIV"));
            new Actions(driver)
                    .moveToElement(element)
                    .click()
                    .perform();
        } catch (Exception e) {
            Assert.fail("Failed User Increase Quantity to two items : "+e.getMessage());
        }
    }

    @Then("Verify Quantity Increase")
    public void verifyQuantityIncrease() {
        try {
            WebElement element = driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.saucelabs.mydemoapp.android:id/noTV']"));
            Assert.assertEquals(element.getText(), "2");
        } catch (Exception e) {
            Assert.fail("Failed Verify Quantity Increase : "+e.getMessage());
        }
    }

    @And("User Click Button Add to Cart")
    public void userClickButtonAddToCart() {
        try {
            driver.findElement(By.id("com.saucelabs.mydemoapp.android:id/cartBt")).click();
        } catch (Exception e) {
            Assert.fail("Failed User Click Button Add to Cart : "+e.getMessage());
        }
    }

    @Then("Verify Product added to cart")
    public void verifyProductAddedToCart() {
        try {
            WebElement element = driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.saucelabs.mydemoapp.android:id/cartTV']"));
            Assert.assertEquals(element.getText(), "2");
        } catch (Exception e) {
            Assert.fail("Failed Verify Product added to cart : "+e.getMessage());
        }
    }

    @And("User Navigate to Cart Page")
    public void userNavigateToCartPage() {
        try {
            driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.saucelabs.mydemoapp.android:id/cartTV']")).click();
        } catch (Exception e) {
            Assert.fail("Failed User Navigate to Cart Page : "+e.getMessage());
        }
    }

    @Then("Verify Redirect to Cart Page")
    public void verifyRedirectToCartPage() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.saucelabs.mydemoapp.android:id/productTV")));
        } catch (Exception e) {
            Assert.fail("Failed Verify Redirect to Cart Page : "+e.getMessage());
        }
    }

    @And("User Click Button Process to Checkout")
    public void userClickButtonProcessToCheckout() {
        try {
            driver.findElement(By.id("com.saucelabs.mydemoapp.android:id/cartBt")).click();
        } catch (Exception e) {
            Assert.fail("Failed User Click Button Process to Checkout : "+e.getMessage());
        }
    }

    @Then("Verify Redirect to login page")
    public void verifyRedirectToLoginPage() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.saucelabs.mydemoapp.android:id/loginTV")));
        } catch (Exception e) {
            Assert.fail("Failed Verify Redirect to login page : "+e.getMessage());
        }
    }

    @And("user Login")
    public void userLogin() {
        try {
            driver.findElement(By.id("com.saucelabs.mydemoapp.android:id/username1TV")).click();
            driver.findElement(By.id("com.saucelabs.mydemoapp.android:id/loginBtn")).click();
        } catch (Exception e) {
            Assert.fail("Failed user Login : "+e.getMessage());
        }
    }

    @Then("Verify Redirect to Checkout Page")
    public void verifyRedirectToCheckoutPage() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.saucelabs.mydemoapp.android:id/enterShippingAddressTV")));
        } catch (Exception e) {
            Assert.fail("Failed Verify Redirect to Checkout Page : "+e.getMessage());
        }
    }

    @And("User input all form checkout information")
    public void userInputAllFormCheckoutInformation() {
        try {
            driver.findElement(By.id("com.saucelabs.mydemoapp.android:id/fullNameET")).sendKeys("Fiky Anggra Sepriaji");
            driver.findElement(By.id("com.saucelabs.mydemoapp.android:id/address1ET")).sendKeys("Cileungsi");
            driver.findElement(By.id("com.saucelabs.mydemoapp.android:id/cityET")).sendKeys("Bogor");
            driver.findElement(By.id("com.saucelabs.mydemoapp.android:id/stateET")).sendKeys("Jawa Barat");
            driver.findElement(By.id("com.saucelabs.mydemoapp.android:id/zipET")).sendKeys("12312");
            driver.findElement(By.id("com.saucelabs.mydemoapp.android:id/countryET")).sendKeys("Indonesia");
        } catch (Exception e) {
            Assert.fail("Failed User input all form checkout information : "+e.getMessage());
        }
    }

    @And("User Click Button Payment")
    public void userClickButtonPayment() {
        try {
            driver.findElement(By.id("com.saucelabs.mydemoapp.android:id/paymentBtn")).click();
        } catch (Exception e) {
            Assert.fail("Failed User Click Button Payment : "+e.getMessage());
        }
    }

    @Then("Verify Redirect to form payment method")
    public void verifyRedirectToFormPaymentMethod() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.saucelabs.mydemoapp.android:id/enterPaymentMethodTV")));
        } catch (Exception e) {
            Assert.fail("Failed Verify Redirect to form payment method : "+e.getMessage());
        }
    }

    @And("User input all form payment method")
    public void userInputAllFormPaymentMethod() {
        try {
            driver.findElement(By.id("com.saucelabs.mydemoapp.android:id/nameET")).sendKeys("Fiky Anggra Sepriaji");
            driver.findElement(By.id("com.saucelabs.mydemoapp.android:id/cardNumberET")).sendKeys("1234123412341234");
            driver.findElement(By.id("com.saucelabs.mydemoapp.android:id/expirationDateET")).sendKeys("1228");
            driver.findElement(By.id("com.saucelabs.mydemoapp.android:id/securityCodeET")).sendKeys("123");
        } catch (Exception e) {
            Assert.fail("Failed User input all form payment method : "+e.getMessage());
        }
    }

    @And("user click button review order")
    public void userClickButtonReviewOrder() {
        try {
            driver.findElement(By.id("com.saucelabs.mydemoapp.android:id/paymentBtn")).click();
        } catch (Exception e) {
            Assert.fail("Failed user click button review order : "+e.getMessage());
        }
    }

    @Then("Verify Redirect to Review Order page")
    public void verifyRedirectToReviewOrderPage() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.saucelabs.mydemoapp.android:id/enterShippingAddressTV")));
        } catch (Exception e) {
            Assert.fail("Failed Verify Redirect to Review Order page : "+e.getMessage());
        }
    }

    @And("User click button place order")
    public void userClickButtonPlaceOrder() {
        try {
            driver.findElement(By.id("com.saucelabs.mydemoapp.android:id/paymentBtn")).click();
        } catch (Exception e) {
            Assert.fail("Failed User click button place order : "+e.getMessage());
        }
    }

    @Then("Verify status Checkout Complete")
    public void verifyStatusCheckoutComplete() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.saucelabs.mydemoapp.android:id/completeTV")));
        } catch (Exception e) {
            Assert.fail("Failed Verify status Checkout Complete : "+e.getMessage());
        }
    }
}
