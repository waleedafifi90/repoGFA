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
	
	public InventoryCountAssertions verifyInventoryScreenHeader(String term) {
		Assert.assertTrue(page.toolbarTitle.get(0).getText().contains(term));
		Assert.assertTrue(page.toolbarTitle.get(0).isDisplayed());
		System.out.println("Inventory count header contains " + term);
		return this;
	}
	
	public InventoryCountAssertions verifyInventoryScreenHeaderTitle(String term) {
		Assert.assertTrue(InventoryCountActions.templateName.contains(term));
		Assert.assertTrue(page.toolbarTitle.get(0).getText().contains(term));
		System.out.println("Template screen header contains " + term);
		return this;
	}
	
	public InventoryCountAssertions verifyStorageLocationItemsInList(int locationCount, int itemCount) {
		Assert.assertEquals(itemCount, locationCount);
		System.out.println("location counter " + locationCount + " ,Item counter " + itemCount);
		return this;
	}
	
	public InventoryCountAssertions verifyAddItemScreenDisplayed() {
		Assert.assertTrue(page.promptAddItemScreen.isDisplayed());
		return this;
	}
	
	public InventoryCountAssertions verifySelectItemScreenDisplayed() {
		Assert.assertTrue(page.promptAddItemScreen.isDisplayed());
		return this;
	}
	
	public InventoryCountAssertions verifySearchItemSelectedIcon() {
		Assert.assertNotNull(page.selectedIcon);
		return this;
	}
	
	public InventoryCountAssertions verifyItemPositionIndex(int counter) {
		Assert.assertEquals(counter, Integer.parseInt(page.maxPosition.getText()));
		Assert.assertEquals(Integer.parseInt(page.maxPosition.getText()), Integer.parseInt(page.itemPositionInput.getText()));
		return this;
	}
	
	public InventoryCountAssertions verifyContinuButtonStatus(boolean status) {
		if(status) {
			Assert.assertTrue(page.continueButton.isEnabled());
			System.out.println("Continue button is enabled");			
		} else {
			Assert.assertTrue(!page.continueButton.isEnabled());
			System.out.println("Continue button is disables");
		}
		return this;
	}
	
	public InventoryCountAssertions verifyItemsCountAfterAddNewItem(int oldCount, int newCount) {
		Assert.assertNotEquals(oldCount, newCount);
		return this;
	}
	
	public InventoryCountAssertions verifyRemoveButtonStatus(boolean status) {
//		if(status) {
//			Assert.assertTrue(page.removeButton.isEnabled());
//			System.out.println("Remove button is enabled");			
//		} else {
//			Assert.assertTrue(!page.removeButton.isEnabled());
//			System.out.println("Remove button is disables");
//		}
		return this;
	}
}
