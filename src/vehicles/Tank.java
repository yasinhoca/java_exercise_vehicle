package vehicles;

public class Tank extends FueledVehicle implements Hittable {
    protected static int tankQuantity = 0;
    protected double armour;

    public void absorbDamage(double damage) {
		if (damage >= this.armour) {
			this.armour = 0;
            tankQuantity -= 1;
		} else {
            this.armour -= damage; 
        }
		
	}

    public Tank(String brandAndModel, double vehiclePrice, double fuelTank, double fuelLevel, double fuelToRangeRatio,
            double armour) {
        super(brandAndModel, vehiclePrice, fuelTank, fuelLevel, fuelToRangeRatio);
        this.armour = armour;
        tankQuantity += 1;
    }

    public static String getTankQuantity() {
        String sss = Integer.toString(tankQuantity);
		
		return sss;
    }

    public static void setTankQuantity(int tankQuantity) {
        Tank.tankQuantity = tankQuantity;
    }

    public double getArmour() {
        return armour;
    }

    public void setArmour(double armour) {
        this.armour = armour;
    }
    
    @Override
	public Tank refualString() {
		return this.refualString();
	}

	@Override
	public String drString() {
		return this.drString(); 
	}
    @Override
    public String hitString() {
        return this.hitString();
    }

	@Override
	public void drive(double km) {
		this.setVehicleCurrentRange();
				
	}

	@Override
	public String toString() {
		
		return getTankQuantity();
	}   
}