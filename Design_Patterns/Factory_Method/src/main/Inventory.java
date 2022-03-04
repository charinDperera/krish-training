package main;

import java.util.*;

public abstract class Inventory {

	protected List<Loot> loot = new ArrayList<>();

	public Inventory() {
		createInventory();
	}

	protected abstract void createInventory();

	@Override
	public String toString() {
		return "Inventory has loot of tier" + loot;
	}
}
