package vehicles;

public abstract class Vehicle implements Drivable{

	// declare instance variables
	protected static int vehicleQuantity = 0; 
	protected String brandAndModel;
	protected double vehiclePrice;
	protected double vehicleMaxRange;
	protected double vehicleCurrentRange;

// constructor
public Vehicle(String brandAndModel, double vehiclePrice) { 
	// controlled initialization of instance variables
	if (brandAndModel != "" && vehiclePrice >= 0) {
		this.brandAndModel = brandAndModel;
		this.vehiclePrice = vehiclePrice;
		vehicleQuantity++;
	}
	
	
}
	//static get
	public static int getVehicleQuantity() {
		return vehicleQuantity;
	}


	// getters and setters
	public String getBrandAndModel() {
		return brandAndModel;
	}
	public void setBrandAndModel(String brandAndModel) {
		this.brandAndModel = brandAndModel;
	}
	public double getVehiclePrice() {
		return vehiclePrice;
	}
	public void setVehiclePrice(double vehiclePrice) {
		this.vehiclePrice = vehiclePrice;
	}
	public double getVehicleMaxRange() {
		return vehicleMaxRange;
	}
	public void setVehicleMaxRange(double vehicleMaxRange) {
		this.vehicleMaxRange = vehicleMaxRange;
	}
	public double getVehicleCurrentRange() {
		return vehicleCurrentRange;
	}
	public void setVehicleCurrentRange(double vehicleCurrentRange) {
		this.vehicleCurrentRange = vehicleCurrentRange;
	}

	
	//abstracts
	public abstract void setVehicleMaxRange();
	
	public abstract void setVehicleCurrentRange();
	
	public abstract void drive(double km);
	
	
	
	
	public String toString() {
		String theVehicle = "Vehicle Type:" + "car" + "Fueled Vehicle Name:" + this.getBrandAndModel() ;
		return theVehicle;
	}
}
