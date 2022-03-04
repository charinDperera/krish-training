package main;

public class application {
	
	public static void main(String[] args) {
		Inventory inventory1 = InventoryFactory.createInventory(InventoryCode.MASTER);
		System.out.println(inventory1);
		
		Inventory inventory2 = InventoryFactory.createInventory(InventoryCode.GOLD);
		System.out.println(inventory2);
		
		Inventory inventory3 = InventoryFactory.createInventory(InventoryCode.SILVER);
		System.out.println(inventory3);
		
		Inventory inventory4 = InventoryFactory.createInventory(InventoryCode.BRONZE);
		System.out.println(inventory4);
	}
}
