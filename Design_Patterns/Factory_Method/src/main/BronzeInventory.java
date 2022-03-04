package main;

public class BronzeInventory extends Inventory {
	protected void createInventory() {
		loot.add(new WhiteLoot());
		loot.add(new GreenLoot());
	}
}
