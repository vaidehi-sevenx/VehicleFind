package com.vehiclelfind.main;

import java.util.ArrayList;

import com.vehiclefind.ui.*;
import com.vehiclefind.data.*;

public class VehicleMain {
	public static void  main (String[]args) {
		Car car = new Car();
		Bike bike = new Bike();
		
		car.setBrand("Hyundai");
		car.setModel("Creta");
		car.setColor("Silver");
		car.setFuelType("Petrol");
		car.setMaximumSpeed(195);
		car.setNumberOfPassengers(5);
		car.setPrice(100000);
		car.setReviews("Best");
		
		bike.setBrand("Bajaj");
		bike.setModel("Platina");
		bike.setColor("Black");
		bike.setMaximumSpeed(120);
		bike.setPrice(60000);
		bike.setFuelType("Petrol");
		bike.setReviews("Good");
		
		ArrayList<Vehicle> list = new ArrayList<Vehicle>();
		list.add(car);
		list.add(bike);
		
		
		VehicleDisplay.displayVehicle(list);
		
		
	}
	

}
