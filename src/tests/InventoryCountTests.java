package tests;

import org.junit.Test;

import InventoryCount.InventoryCountActions;
import InventoryCount.InventoryCountAssertions;

public class InventoryCountTests extends BaseTest {
	
	String searchTerm = "Appium Item 14g";
	String headerInventoryTitle = "Inventory Counts";
	String headerItemTitle = "Test Template 2wt";
	int storageLocationItemCount = 0;
	int itemPosition = 0;
	int itemCounterInList = 0;
	String templateItemNameHeader = "Test SL j8e";
	
	InventoryCountActions inventoryAction = new InventoryCountActions();
	InventoryCountAssertions inventoryAssertion = new InventoryCountAssertions();
	LoginTest login = new LoginTest();
	
	@Test
	public void addNewInventoryCount() throws Throwable {
		login.loginToApp();

		inventoryAction.clickMenuButton();
		inventoryAssertion.verifyNavigationIsDisplayed();
		
		inventoryAction.navigateToInventoryCount();
		inventoryAssertion.verifyInProgressIsFocused();
		inventoryAssertion.verifyInventoryScreenHeader(headerInventoryTitle);
		
		inventoryAction.selectFirstItem();
		inventoryAssertion.verifyInventoryScreenHeaderTitle(headerItemTitle);
				
		storageLocationItemCount = inventoryAction.getItemInStorageLocation();
		inventoryAction.selectionFirstOnTheList();
		itemCounterInList = inventoryAction.getItemsCount();
		inventoryAssertion.verifyStorageLocationItemsInList(storageLocationItemCount, itemCounterInList);
		
		inventoryAction.toggelEditDoneButton();
		inventoryAssertion.verifyStorageLocationItemsInList(storageLocationItemCount, itemCounterInList);
		
		inventoryAction.clickAddItemButton();
		inventoryAssertion.verifyAddItemScreenDisplayed();
		
		inventoryAction.clickSelectItemDropDown();
		inventoryAssertion.verifySelectItemScreenDisplayed();
		
		inventoryAction.searchForItem(searchTerm);
		inventoryAssertion.verifyContinuButtonStatus(false);
		
		inventoryAction.selectionFirstOnTheList();
		inventoryAssertion.verifySearchItemSelectedIcon();
		inventoryAssertion.verifyContinuButtonStatus(true);

		inventoryAction.clickContinueButton();
		inventoryAssertion.verifyItemPositionIndex(itemCounterInList + 1);
		
		inventoryAction.clickAddItemButton()
					   .addItemToList()
					   .toggelEditDoneButton();
		inventoryAssertion.verifyItemsCountAfterAddNewItem(itemCounterInList, inventoryAction.getItemsCount());
		inventoryAssertion.verifyInventoryScreenHeader(templateItemNameHeader);

		
		
		//					   .navigateToSelectLocation();

		//		inventoryAssertion.verifyAddNewInventoryCountScreen();
				
		//		inventoryAction.selectLocation()
		//					   .selectionFirstOnTheList()
		//					   .clickContinueButton()
		//					   .selectTemplate()
		//					   .selectionFirstOnTheList()
		//					   .clickContinueButton();
	};
	
	@Test
	public void removeButtonDisabled() throws InterruptedException {
		inventoryAction.toggelEditDoneButton();
		inventoryAssertion.verifyRemoveButtonStatus(inventoryAction.getListRadioStatus());
		
//		inventoryAction.selectionFirstOnTheList();
//		inventoryAssertion.verifyRemoveButtonStatus(inventoryAction.getListRadioStatus());

	}
}
