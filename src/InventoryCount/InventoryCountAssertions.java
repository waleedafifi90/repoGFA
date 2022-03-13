package InventoryCount;

import org.junit.Assert;

import tests.BaseTest;

public class InventoryCountAssertions {
	
	InventoryCount page = new InventoryCount();
	
	public InventoryCountAssertions verifyAddNewInventoryCountScreen() {
		BaseTest.waitVisibilityOf(page.selectLocationScreen);
		System.out.println("Inventory Count displayed");
		Assert.assertTrue(page.selectLocationScreen.isDisplayed());
		return this;
		
	}
	
	public InventoryCountAssertions verifyNavigationIsDisplayed() {
		BaseTest.waitVisibilityOf(page.navigationView);
		Assert.assertTrue(page.navigationView.isDisplayed());
		Assert.assertNotEquals(0, 0);
		return this;
	}
}
