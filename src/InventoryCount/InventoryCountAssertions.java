package InventoryCount;

import org.junit.Assert;

import tests.BaseTest;

public class InventoryCountAssertions {
	
	InventoryCount page = new InventoryCount();
	InventoryCountActions invAction = new InventoryCountActions();
	
	public InventoryCountAssertions verifyAddNewInventoryCountScreen() {
		BaseTest.waitVisibilityOf(page.selectLocationScreen);
		System.out.println("Inventory Count displayed");
		Assert.assertTrue(page.selectLocationScreen.isDisplayed());
		return this;
		
	}
	
	public InventoryCountAssertions verifyNavigationIsDisplayed() {
		BaseTest.waitVisibilityOf(page.navigationView);
		Assert.assertTrue(page.navigationView.isDisplayed());
//		System.out.println(InventoryCountActions.itemCounter);

		Assert.assertNotNull(page.templateItems);
		return this;
	}
	
	public InventoryCountAssertions verifyInProgressIsFocused() {
		Assert.assertTrue(page.inProgressTab.isSelected());
		return this;
	}
	
	public InventoryCountAssertions verifyInventoryScreenHeader() {
		Assert.assertTrue(page.toolbarTitle.get(0).isDisplayed());
		return this;
	}
	
	public InventoryCountAssertions verifyInventoryScreenHeaderTitle() {
		Assert.assertTrue(InventoryCountActions.templateName.contains("2wt"));
		Assert.assertTrue(page.toolbarTitle.get(0).getText().contains("2wt"));
		return this;
	}
}
