//I hereby certify that I have completed this lab assignment on my own without any help from anyone else. I understand that the only sources of authorized information in this lab assignment are (1) the course textbook, (2) the materials posted at the course website and (3) any study notes handwritten by myself. I have not used, accessed or received any information from any other unauthorized source in taking this lab assignment. The effort in the assignment thus belongs completely to me. READ AND SIGN BY WRITING YOUR NAME SURNAME AND STUDENT ID SIGNATURE: 
package work;

import java.util.ArrayList;

import vehicles.*;

public class Test {
	
	public static void main(String[] args) {
		
		System.out.println("Total number of Vehicles before creating vehicles: " + Vehicle.getVehicleQuantity());
		
		
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

		
		
		FueledVehicle bmw530 = new Car("BMW 530",54000,70,30,8);
		FueledVehicle mbE300 = new Car("Mercedes-Benz E300",66000,70,10,9);
		Car vlvS60 = new Car("Volvo S60",40000,60,25,12);
		Motorbike harley = new Motorbike("Harley-Davidson",20000,15,5,25);
		
		


		vehicles.add(bmw530);
		vehicles.add(mbE300);
		vehicles.add(vlvS60);
		vehicles.add(harley);

		Tank challenger = new Tank("Challenger 2", 1500000, 250, 200, 1.5, 100);
		Tank blackPanther = new Tank("K2 Black Panther", 1200000, 200, 175, 2, 75);
		vehicles.add(challenger);
		vehicles.add(blackPanther);
		challenger.absorbDamage(50);
		blackPanther.absorbDamage(100);
		System.out.println(challenger);
		System.out.println(blackPanther);

		System.out.println(vehicles);

			System.out.println("\nTotal number of Vehicles: " + Vehicle.getVehicleQuantity());
			System.out.println("Total number of Tanks: " + Tank.getTankQuantity());

        	System.out.println("Total number of Vehicles after creating vehicles: " + Vehicle.getVehicleQuantity());
        	System.out.println("Total number of Cars after creating vehicles: " + Car.getCarQuantity());
        	System.out.println("Total number of Motorbikes after creating vehicles: " + Motorbike.getMotorbikeQuantity());

        	//print all the units
        	for (int i=0; i<vehicles.size(); ++i) {
        		System.out.println(vehicles.get(i));

        
        		bmw530.drive(250);
        		mbE300.drive(50);
        		vlvS60.drive(240);
        		harley.drive(120);
        
        		bmw530.drive(50);
        		mbE300.drive(50);
        		vlvS60.drive(80);
        		harley.drive(20);
        
        		bmw530.refuel(80);
        		mbE300.refuel(50);
        		vlvS60.refuel(50);
        		harley.refuel(20);
        
        		bmw530.drive(600);
        		mbE300.drive(445);
        		vlvS60.drive(300);
        		harley.drive(150);
			}	
			// In-lab
	
	
	}
}
