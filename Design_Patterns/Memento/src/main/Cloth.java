package main;

public class Cloth {
	private String brand;
	private String type;
	private String size;
	
	public Cloth(String brand, String type, String size) {
		this.brand = brand;
		this.type = type;
		this.size = size;
	}

	@Override
	public String toString() {
		return "Cloth -> [brand=" + brand + ", type=" + type + ", size=" + size + "]";
	}
	
	
	
}
