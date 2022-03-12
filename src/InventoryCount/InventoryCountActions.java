package InventoryCount;

import tests.BaseTest;

public class InventoryCountActions {
	
	InventoryCount page =new  InventoryCount();

	public InventoryCountActions clickMenuButton() {
		BaseTest.waitVisibilityOf(page.drawerButton);
		page.drawerButton.click();
		return this;
	}
	
	public InventoryCountActions navigateToInventoryCount() {
		BaseTest.waitVisibilityOf(page.inventoryCountNavigationButton);
		page.inventoryCountNavigationButton.click();
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

}
