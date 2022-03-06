package main;

public class Application {

	public static void main(String[] args) {
		
		Laptop.Builder asusBuilder = new Laptop.Builder("Asus");
		Laptop laptop1 = asusBuilder.model("rog").processor("ryzen").ram(16).graphicsCard("nvidia").refreshRate(144).build();
		System.out.println(laptop1);
		
		Laptop.Builder msiBuilder = new Laptop.Builder("MSI");
		Laptop laptop2 = msiBuilder.processor("intel").build();
		System.out.println(laptop2);
		
	}

}
