package vehicles;

public abstract class FueledVehicle extends Vehicle implements Refuelable {

	// declare instance variables 
	public double fuelTank;
	public double fuelLevel; 
	public double fuelToRangeRatio;

	// constructor
	public FueledVehicle(String brandAndModel, double vehiclePrice, double fuelTank, double fuelLevel,
			double fuelToRangeRatio) {
				// intialization
		super(brandAndModel, vehiclePrice);
		this.fuelTank = fuelTank;
		this.fuelLevel = fuelLevel;
		this.fuelToRangeRatio = fuelToRangeRatio;

		// controlled initialization of instance variables
	}

	// sets current and max ranges
	
	public void setVehicleCurrentRange() {
		this.vehicleCurrentRange = fuelLevel * fuelToRangeRatio;
	}
	 
	public void setVehicleMaxRange() {
		this.vehicleMaxRange = fuelTank * fuelToRangeRatio;
	}

	// getters
	public double getFuelTank() {
		return fuelTank;
	}

	public void setFuelTank(double fuelTank) {
		this.fuelTank = fuelTank;
	}

	public double getFuelLevel() {
		return fuelLevel;
	}

	public void setFuelLevel(double fuelLevel) {
		this.fuelLevel = fuelLevel;
	}

	public double getFuelToRangeRatio() {
		return fuelToRangeRatio;
	}

	public void setFuelToRangeRatio(double fuelToRangeRatio) {
		this.fuelToRangeRatio = fuelToRangeRatio;
	}		 
	
	public void refuel(double fuelLevel) {
		if (fuelLevel > 0) {
			if (fuelLevel > this.fuelTank) {
				this.fuelLevel = this.fuelTank;
			}
			else {
				if (fuelLevel + this.fuelLevel <= this.fuelTank) {
					this.fuelLevel += fuelLevel;
				}
			}
			
		}
		this.setVehicleCurrentRange();
		System.out.println("Fueled Vehicle: " + this.brandAndModel + " is refilled, with new range: " + this.getVehicleCurrentRange());

	}
			
	public void drive(double km) {
		if (km >= 0) {
			if (km <= this.vehicleCurrentRange) {
				this.fuelLevel += this.fuelLevel - (this.vehicleCurrentRange / fuelToRangeRatio);
			}
		}
		this.setVehicleCurrentRange();
		System.out.println("Fueled Vehicle: " + this.brandAndModel + " is driven: " + km + "kms.");
	}
	
	public String toString() {
		
		return brandAndModel;
	}
}