package com.luma.pages;

import com.luma.utilities.Utility;
import org.openqa.selenium.By;

public class Men extends Utility {
By mens = By.xpath("//span[normalize-space()='Men']");
By bottom = By.xpath("//a[@id='ui-id-18']");
By pants = By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");
By cronusYoga = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
By clicksize = (By.xpath("(//div[@class='swatch-option text'])[1]"));
By clickonColourBlack = (By.xpath("(//div[@class='swatch-option color'])[1]"));
By yoga = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
By AddToCart =By.xpath("(//span[contains(text(),'Add to Cart')])[1]");
By shoppingCart = (By.xpath("//a[normalize-space()='shopping cart']"));
public void mouseHourMenMenu(){
    clickOnElement(mens);
}
public void mouseHourBottomMenu(){
    clickOnElement(bottom);
}
public void clickonPents(){
    clickOnElement(pants);
}
public void setCronusYoga(){
    clickOnElement(cronusYoga);
}
public void setClicksize(){
    clickOnElement(clicksize);
}
public void clickonblackcolourpents(){
    clickOnElement(clickonColourBlack);
}
public void clickonyogapants(){
    clickOnElement(yoga);
}
public void setAddToCart(){
    clickOnElement(AddToCart);
}
public void clickonShoppingCart(){
    clickOnElement(shoppingCart);
}

}
