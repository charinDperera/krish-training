package main;

public class GoldInventory extends Inventory {
	protected void createInventory() {
		loot.add(new BlueLoot());
		loot.add(new PurpleLoot());
	}
}
