package main;

import java.util.Stack;

public class Caretaker {
	Stack<Basket.BasketMemento> basketHistory = new Stack<>();
	
	public void save(Basket basket) {
		basketHistory.push(basket.save());
	}
	
	public void undo(Basket basket) {
		if (!basketHistory.isEmpty())
			basket.undo(basketHistory.pop());
		else
			System.out.println("Enable to undo as no clothes left");
	}
}


