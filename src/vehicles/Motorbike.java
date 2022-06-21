package vehicles;

public class Motorbike extends FueledVehicle {

	// declare instance variables 
	public static String ID;
	public static int motorbikeQuantity;

	// constructor
	public Motorbike(String brandAndModel, double vehiclePrice, double fuelTank, double fuelLevel,
			double fuelToRangeRatio) {

		// initialization 
		super(brandAndModel, vehiclePrice, fuelTank, fuelLevel, fuelToRangeRatio);

		// increments motorbike quantity
		motorbikeQuantity += 1;
	}

	

	public static String getID() {
		return ID;
	}
	public static String getMotorbikeQuantity() {
		String ss = Integer.toString(motorbikeQuantity);
		return ss;
	}
	public static void setMotorbikeQuantity(int motorbikeQuantity) {
		Motorbike.motorbikeQuantity = motorbikeQuantity;
	}



	@Override
	public  Motorbike refualString() {
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
		
		return getMotorbikeQuantity();
	}
}