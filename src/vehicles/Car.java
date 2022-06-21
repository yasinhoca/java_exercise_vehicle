package vehicles;

public class Car extends FueledVehicle  {

	// declare instance variables 
	public static String ID;
	public static int carQuantity;

	// constructor
	public Car(String brandAndModel, double vehiclePrice, double fuelTank, double fuelLevel, double fuelToRangeRatio) {

		// initialization 
		super(brandAndModel, vehiclePrice, fuelTank, fuelLevel, fuelToRangeRatio);

		// increments car quantity
		carQuantity += 1;
	}
	
	//Getter setters
	public static String getCarQuantity() {
		String s = Integer.toString(carQuantity);
		
		return s;
	}

	public static String getId() {
		return ID;
	}

	public static void setCarQuantity(int carQuantity) {
		Car.carQuantity = carQuantity;
	}


	@Override
	public Car refualString() {
		return this.refualString();
	}

	@Override
	public String drString() {
		return this.drString(); 
	}

	@Override
	public void drive(double km) {
		this.setVehicleCurrentRange();
				
	}

	@Override
	public String toString() {
		
		return getCarQuantity();
	}
}