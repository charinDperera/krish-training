package main;

public class SilverInventory extends Inventory {
	protected void createInventory() {
		loot.add(new GreenLoot());
		loot.add(new BlueLoot());
	}
}