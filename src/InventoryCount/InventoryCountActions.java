package InventoryCount;

import org.openqa.selenium.WebElement;

import tests.BaseTest;

public class InventoryCountActions {
	
	InventoryCount page = new  InventoryCount();
	
	public static int itemCounter = 0;
	static String templateName;

	public InventoryCountActions clickMenuButton() {
		BaseTest.waitVisibilityOf(page.drawerButton);
		page.drawerButton.click();
		return this;
	}
	
	public InventoryCountActions navigateToInventoryCount() throws InterruptedException {
		BaseTest.waitVisibilityOf(page.inventoryCountNavigationButton);
		page.inventoryCountNavigationButton.click();
//		System.out.println(page.templateItems.size());
		Thread.sleep(2000);
		itemCounter = 5;
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
		templateName = page.templateName.get(4).getText();
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
	
	public int getItemsCount() {
		return page.containerItems.size();
	}
	
	public int getItemInStorageLocation() {
		String text = page.storageLocationItemCount.get(0).getText();
		text = text.split(" ")[0];
		int num = Integer.parseInt(text);
		return num;
	}
	
	public boolean getListRadioStatus() {
		for(int i = 0; i < page.itemStatus.size(); i++) {
			WebElement el = (WebElement) page.itemStatus.get(i);
			System.out.println("Radio Status is: " + page.itemStatus.get(i).isSelected());
			if(page.itemStatus.get(i).isSelected()) {
				return true;
			}			
		}
		return false; 
	}
}
