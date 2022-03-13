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
	
	@AndroidFindBy(className = "android.view.ViewGroup")
	List<MobileElement> templateItems;
	
	@AndroidFindBy(id = "action_toggle_edit")
	MobileElement editButton;
	
	@AndroidFindBy(id = "btn_add_item")
	MobileElement addItemBtn;
	
	@AndroidFindBy(id = "v_select_item_button")
	MobileElement selectItemDropDown; 
	
	@AndroidFindBy(id = "et_item_position")
	MobileElement itemPositionInput;
	
	@AndroidFindBy(id = "et_search")
	MobileElement searchField;
	
	@AndroidFindBy(id = "iv_selected_icon")
	MobileElement selectedIcon;
	
	@AndroidFindBy(id = "tv_item_name")
	List<MobileElement> itemName;
	
	@AndroidFindBy(id = "tv_selected_item_name")
	MobileElement selectedItemName; 
	
	@AndroidFindBy(id = "action_bar_root")
	MobileElement promptAddItemScreen; 
	
	@AndroidFindBy(id = "btn_edit")
	MobileElement addItemToList;
	
	@AndroidFindBy(id = "snackbar_text")
	MobileElement AlertMessage;
	
	@AndroidFindBy(id = "iv_status")
	List<MobileElement> itemStatus; 
	
	@AndroidFindBy(id = "nav_view")
	MobileElement navigationView;
	
	@AndroidFindBy(accessibility = "In progress")
	MobileElement inProgressTab;
	
//	@AndroidFindBy(xpath = "//*[contains(@text, 'Inventory Counts')]")
	@AndroidFindBy(className = "android.widget.TextView")
	List<MobileElement> toolbarTitle; 
	
	@AndroidFindBy(id = "tv_inventory_name")
	List<MobileElement> templateName; 
	
	@AndroidFindBy(id = "tv_items")
	List<MobileElement> storageLocationItemCount; 
}
