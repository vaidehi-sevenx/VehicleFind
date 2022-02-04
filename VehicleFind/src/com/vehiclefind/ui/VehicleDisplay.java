package com.vehiclefind.ui;

import java.util.ArrayList;

import com.vehiclefind.data.*;

public class VehicleDisplay {
	public static void displayVehicle(ArrayList<Vehicle> list) {
		for (Vehicle Vehicles : list) {
			if(Vehicles instanceof Car) {
				Car car = (Car) Vehicles;
				System.out.println("Company name\t" +car.getBrand());
				System.out.println("Fuel type\t" +car.getFuelType());
				System.out.println("Color\t" +car.getColor());
				System.out.println("Price\t" +car.getPrice());
				System.out.println("Maximum Speed\t" +car.getMaximumSpeed());
				System.out.println("Model\t" +car.getModel());
			}else if(Vehicles instanceof Bike) {
				Bike bike = (Bike)Vehicles;
				System.out.println("Company name\t" +bike.getBrand());
				System.out.println("Fuel type\t" +bike.getFuelType());
				System.out.println("Color\t" +bike.getColor());
				System.out.println("Price\t" +bike.getPrice());
				System.out.println("Maximum Speed\t" +bike.getMaximumSpeed());
				System.out.println("Model\t" +bike.getModel());
			}
		}
		
	}

}
