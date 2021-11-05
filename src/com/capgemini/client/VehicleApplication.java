package com.capgemini.client;

import com.capgemini.domain.Car;
import com.capgemini.domain.Truck;
import com.capgemini.domain.Vehicle;

public class VehicleApplication {

	
	public static void main(String[] args) {
	  Vehicle vehicle = new Car("MH121234", "White", 500000, 5);
	  vehicle.display();
	  vehicle.start();
	  vehicle.stop(); 
	  vehicle= new Truck("MH1245677", "Blue", 1500000, 20);
	  vehicle.display();
	  vehicle.start();
	  vehicle.stop();
	   
	}

}
