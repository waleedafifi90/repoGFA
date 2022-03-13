package InventoryCount;

import tests.BaseTest;

public class InventoryCountActions {
	
	InventoryCount page = new  InventoryCount();
	
	public static int itemCounter = 0;

	public InventoryCountActions clickMenuButton() {
		BaseTest.waitVisibilityOf(page.drawerButton);
		page.drawerButton.click();
		return this;
	}
	
	public InventoryCountActions navigateToInventoryCount() {
		BaseTest.waitVisibilityOf(page.inventoryCountNavigationButton);
		page.inventoryCountNavigationButton.click();
		itemCounter = page.templateItems.size();

//		System.out.println(page.templateItems.size());
		return this;
	}
	
	public InventoryCountActions navigateToSelectLocation() {
		BaseTest.waitVisibilityOf(page.addInventoryCount);
		page.addInventoryCount.click();
		return this;
	}
	
//	public InventoryCountActions inventoryTemplateScreen() {
//		BaseTest.waitVisibilityOf(page.selectLocationScreen);
//		return this;
//	}
	
	public InventoryCountActions selectLocation() {
		BaseTest.waitVisibilityOf(page.locationListPicker);
		page.locationListPicker.click();
		return this;
	}
	
	public InventoryCountActions selectionFirstOnTheList() {
		page.containerItems.get(0).click();
		return this;
	}
	
	public InventoryCountActions clickContinueButton() {
		page.continueButton.click();
		return this;
	}
	
	public InventoryCountActions selectTemplate() {
		page.templateListPicker.click();
		return this;
	}
	
	public InventoryCountActions selectFirstItem() {
		page.templateItems.get(5).click();
		return this;
	}
	
	public InventoryCountActions toggelEditDoneButton() throws InterruptedException {
		Thread.sleep(5000);
		BaseTest.waitVisibilityOf(page.editButton);
		page.editButton.click();
		return this;
	}
	
	public InventoryCountActions clickAddItemButton() {
		page.addItemBtn.click();
		return this;
	}
	
	public InventoryCountActions clickSelectItemDropDown() {
		page.selectItemDropDown.click();
		return this;
	}

	public InventoryCountActions searchForItem(String text) {
		BaseTest.waitVisibilityOf(page.searchField);
		page.searchField.click();
		page.searchField.clear();
		page.searchField.sendKeys(text);
		BaseTest.driver.hideKeyboard();
		return this;
	}
	
	public InventoryCountActions addItemToList() {
		page.addItemToList.click();
		return this;
	}
}
