package main;

import java.util.ArrayList;

public class Basket {
	ArrayList<Cloth> clothes = new ArrayList<>();
	
	public void addCloth(Cloth cloth) {
		clothes.add(cloth);
	}
	
	public ArrayList<Cloth> getClothes(){
		return (ArrayList) clothes.clone();
	}

	public BasketMemento save() {
		return new BasketMemento(getClothes());
	}
	
	public void undo(BasketMemento basketMemento) {
		clothes = basketMemento.getClothes();
	}
	
	@Override
	public String toString() {
		return "Basket \n[\nclothes=" + clothes + "\n]";
	}

	static class BasketMemento{
		ArrayList<Cloth> clothes;

		public BasketMemento(ArrayList<Cloth> clothes) {
			super();
			this.clothes = clothes;
		}

		private ArrayList<Cloth> getClothes() {
			return clothes;
		}
		
		
	}
}

