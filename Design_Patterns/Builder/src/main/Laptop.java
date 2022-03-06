package main;

public class Laptop {
	private final String manufacturer;
	private final String model;
	private final String processor;
	private final int ram;
	private final String graphicsCard;
	private final int refreshRate;
	
	public Laptop(Builder builder) {
		this.manufacturer = builder.manufacturer;
		this.model = builder.model;
		this.processor = builder.processor;
		this.ram = builder.ram;
		this.graphicsCard = builder.graphicsCard;
		this.refreshRate = builder.refreshRate;
	}

	static class Builder{
		private String manufacturer;
		private String model;
		private String processor;
		private int ram;
		private String graphicsCard;
		private int refreshRate;
		
		public Laptop build() {
			return new Laptop(this);
		}
		
		
		public Builder (String manufacturer) {
			this.manufacturer = manufacturer;
		}
		
		public Builder model(String model) {
			this.model = model;
			return this;
		}

		public Builder processor(String processor) {
			this.processor = processor;
			return this;
		}

		public Builder ram(int ram) {
			this.ram = ram;
			return this;
		}

		public Builder graphicsCard(String graphicsCard) {
			this.graphicsCard = graphicsCard;
			return this;
		}

		public Builder refreshRate(int refreshRate) {
			this.refreshRate = refreshRate;
			return this;
		}
	}

	@Override
	public String toString() {
		return "Laptop \n[\nmanufacturer=" + manufacturer + ", \nmodel=" + model + ", \nprocessor=" + processor
				+ ", \nram=" + ram + ", \ngraphicsCard=" + graphicsCard + ", \nrefreshRate=" + refreshRate + "\n]";
	}
	
}
