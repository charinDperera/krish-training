package main;

public class InventoryFactory {
	public static Inventory createInventory(InventoryCode inventoryCode) {
		switch (inventoryCode) {
		case BRONZE:
			return new BronzeInventory();
		case SILVER:
			return new SilverInventory();
		case GOLD:
			return new GoldInventory();
		case MASTER:
			return new MasterInventory();
		default:
			return null;
		}
	}
}