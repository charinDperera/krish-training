
public class Car {
	private static volatile Car car;
	
	private Car() {
		if (car != null)
			throw new RuntimeException("Please Use getCar() method to create an object");
	}
	
	public static Car getCar() {
		if (car == null) {
			synchronized (Car.class) {
				if (car == null) {
					car = new Car();
				}
			}
		}
		
		return car;
	}
}
