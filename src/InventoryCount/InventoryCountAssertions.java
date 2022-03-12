package InventoryCount;

import org.junit.Assert;

import tests.BaseTest;

public class InventoryCountAssertions {
	
	InventoryCount page = new InventoryCount();
	
	public InventoryCountAssertions verifyAddNewInventoryCountScreen() throws InterruptedException {
		BaseTest.waitVisibilityOf(page.selectLocationScreen);
		Assert.assertTrue(page.selectLocationScreen.isDisplayed());
		return this;
		
	}
}
