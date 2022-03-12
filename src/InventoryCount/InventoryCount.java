package InventoryCount;

import java.util.List;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import tests.BaseTest;

public class InventoryCount extends BaseTest {
	@AndroidFindBy(accessibility =  "Open navigation drawer")
	 protected MobileElement drawerButton;
	
	@AndroidFindBy(id = "take_inventory")
	MobileElement inventoryCountNavigationButton;

	@AndroidFindBy(id = "fab_add_inventory_count")
	MobileElement addInventoryCount;
	
	@AndroidFindBy(id = "design_bottom_sheet")
	MobileElement selectLocationScreen;
	
	@AndroidFindBy(id = "ll_location")
	MobileElement locationListPicker;
	
	@AndroidFindBy(id = "ll_template")
	MobileElement templateListPicker;
	
	@AndroidFindBy(id ="date")
	MobileElement datePicker;
	
	@AndroidFindBy(id = "container")
	List<MobileElement> containerItems;
	
	@AndroidFindBy(id = "btn_continue")
	MobileElement continueButton;
	
}
