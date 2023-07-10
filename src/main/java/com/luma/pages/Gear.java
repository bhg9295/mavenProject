package com.luma.pages;

import com.luma.utilities.Utility;
import org.openqa.selenium.By;

public class Gear extends Utility {
    By gearMenu = By.xpath("//span[normalize-space()='Gear']");
    By clickBag = By.xpath("//span[normalize-space()='Bags']");
    By overnightDuffle = (By.xpath("//a[normalize-space()='Overnight Duffle']"));
    By qty3 = By.xpath("//input[@id='qty']");
    By addCart = By.xpath("//button[@id='product-addtocart-button']");
By shoppingcartlink =By.xpath("//a[normalize-space()='shopping cart']");
By changeQty5 = (By.xpath("(//input[@class='input-text qty'])[1]"));
By updateShoppingCart = By.xpath("//span[normalize-space()='Update Shopping Cart']");
    public void hoverGearMenu() {
clickOnElement(gearMenu);
    }

    public void setClickBag() {
        clickOnElement(clickBag);
    }
    public void productnameovernightDuffle(){
        clickOnElement(overnightDuffle);
    }
    public void changeQty() {
        clickOnElement(qty3);
    }
    public void addtocartProduct() {
       clickOnElement(addCart);

    }
    public void clickonshoppingcartlink(){
        clickOnElement(shoppingcartlink);
    }
    public void clickchangeqty5(){
        clickOnElement(changeQty5);
    }
    public void clickonUpdatecart(){
        clickOnElement(updateShoppingCart);
    }
}