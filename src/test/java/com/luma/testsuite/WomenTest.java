package com.luma.testsuite;

import com.luma.pages.Women;
import com.luma.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class WomenTest extends BaseTest {
    Women women = new Women();
    List<String> jacketsNameListAfter;
    List<String> jacketsNameListBefore;

    @Test
    public void verifyTheSortByProductNameFilter() {
        women.mouseHoverWomen();
        women.clickOnTops();
        women.clickOnJacket();
        women.jacketsNameListBefore();
        women.jacketsElementsList();
        Assert.assertEquals(jacketsNameListAfter, jacketsNameListBefore, "Ascending order ");
    }

    @Test
    public void verifyTheSortByPriceFilter() {

    }

}
