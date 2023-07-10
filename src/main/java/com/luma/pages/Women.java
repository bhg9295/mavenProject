package com.luma.pages;

import com.luma.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Women extends Utility {
By women = By.xpath("//span[normalize-space()='Women']");
By top = By.xpath("//a[@id='ui-id-9']");
By jacket = By.xpath("By.xpath(//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");
By productName = By.xpath("(//select[@id='sorter'])[1]");

ArrayList<String> jacketsNameListBefore = new ArrayList<>();
ArrayList<String>  jacketsNameListAfter = new ArrayList<>();


public void mouseHoverWomen(){
    clickOnElement(women);
}
public void clickOnTops(){
    clickOnElement(top);
}
public void clickOnJacket(){
    clickOnElement(jacket);
}
public void jacketsNameListBefore (){

    List<WebElement> jacketsElementsList = driver.findElements(By.xpath("//strong[@class='product name product-item-name']//a"));
    List<String> jacketsNameListBefore = new ArrayList<>();
    for (WebElement value : jacketsElementsList) {
        jacketsNameListBefore.add(value.getText());
    }}

public void jacketsElementsList(){
   List<WebElement> jacketsElementsList = driver.findElements(By.xpath("//strong[@class='product name product-item-name']//a"));
    List<String> jacketsNameListAfter = new ArrayList<>();
    for (WebElement value : jacketsElementsList) {
        jacketsNameListAfter.add(value.getText());
    }
    }


public void clickProductName(){
    clickOnElement(productName);
}





}
