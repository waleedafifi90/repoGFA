package tests;

import org.junit.Test;

import InventoryCount.InventoryCountActions;
import InventoryCount.InventoryCountAssertions;

public class InventoryCountTests extends BaseTest {
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
		inventoryAssertion.verifyInventoryScreenHeader();
		
		inventoryAction.selectFirstItem();
		inventoryAssertion.verifyInventoryScreenHeaderTitle();
		
		inventoryAction.selectionFirstOnTheList()
					   .toggelEditDoneButton()
					   .clickAddItemButton()
					   .clickSelectItemDropDown()
					   .searchForItem("Appium Item 14g")
					   .selectionFirstOnTheList()
					   .clickContinueButton()
					   .clickAddItemButton()
					   .addItemToList()
					   .toggelEditDoneButton();
//					   .navigateToSelectLocation();

//		inventoryAssertion.verifyAddNewInventoryCountScreen();
		
//		inventoryAction.selectLocation()
//					   .selectionFirstOnTheList()
//					   .clickContinueButton()
//					   .selectTemplate()
//					   .selectionFirstOnTheList()
//					   .clickContinueButton();
	};
}
