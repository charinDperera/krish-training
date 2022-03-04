package main;

public class MasterInventory extends Inventory {
	protected void createInventory() {
		loot.add(new PurpleLoot());
		loot.add(new RedLoot());
	}
}
