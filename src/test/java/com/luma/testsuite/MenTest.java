package com.luma.testsuite;

import com.luma.pages.Men;
import com.luma.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenTest extends BaseTest {
    Men men = new Men();
@Test
    public void userShouldAddProductSuccessFullyToShoppingCart() {
        men.mouseHourMenMenu();
        men.mouseHourBottomMenu();
        men.clickonPents();
        men.setCronusYoga();
        men.setClicksize();
        men.clickonblackcolourpents();
        men.clickonyogapants();
        men.setAddToCart();
        String actualMessage = "You added Cronus Yoga Pant to your shopping cart.";
        String expectedMessage = getTextFromElement(By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']"));
        Assert.assertEquals(actualMessage, expectedMessage, "Message not display");
        men.clickonShoppingCart();
        String actualProductsize = "32";
        String expectedProductsize = getTextFromElement(By.xpath("//dd[contains(text(),'32')]"));
        Assert.assertEquals(actualProductsize, expectedProductsize, "size is not display");
        String verifycolour = "Black";
        String verifyBlackColour = getTextFromElement(By.xpath("//dd[contains(text(),'Black')]"));
        Assert.assertEquals(verifycolour, verifyBlackColour, "Colour not select");

    }

}
