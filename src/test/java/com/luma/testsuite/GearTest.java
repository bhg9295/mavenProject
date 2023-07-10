package com.luma.testsuite;

import com.luma.pages.Gear;
import com.luma.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;

public class GearTest extends BaseTest {
    Gear test =new Gear();
    public void userShouldAddProductSuccessFullyToShoppingCart(){
test.hoverGearMenu();
test.setClickBag();
test.productnameovernightDuffle();

String verifyOvvernightDuffle = "Overnight Duffle";
        String verifyOverNightDuffleText =  getTextFromElement(By.xpath("//span[@class='base']"));
        Assert.assertEquals(verifyOvvernightDuffle,verifyOverNightDuffleText);
        test.changeQty();
        test.addtocartProduct();
        String actualMessage = "‘You added Overnight Duffle to your shopping cart";
        String expectedMessage =  getTextFromElement(By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']"));
        Assert.assertEquals(actualMessage,expectedMessage);
        test.clickonshoppingcartlink();
        String verifyNameOvernightDuffle ="Overnight Duffle";
        String expectedverifyNameOvernightDuffle = getTextFromElement(By.xpath("//td[@class='col item']//a[normalize-space()='Overnight Duffle']"));
Assert.assertEquals(verifyNameOvernightDuffle,expectedverifyNameOvernightDuffle,"the product name ‘Overnight Duffle’");
String actualQty3 = "3";
String expectedQty3 = getAttributeValue(By.xpath("//input[@title='Qty']"), "value");
Assert.assertEquals(actualQty3,expectedQty3,"Qty 3 is not dispaly");
String actualPriseProduct = "$135.00";
String expectedPriseProduct = getTextFromElement(By.xpath("(//span[@class='cart-price']//span)[2]"));
Assert.assertEquals(actualPriseProduct,expectedPriseProduct,"product Prise is not verify");
test.clickchangeqty5();
test.clickonUpdatecart();
String productPrice = "‘$225.00";
String verifyproductPrice =  getTextFromElement(By.xpath("(//span[@class='cart-price']//span)[2]"));
Assert.assertEquals(productPrice,verifyproductPrice,"Product price is not right");
    }
    }


