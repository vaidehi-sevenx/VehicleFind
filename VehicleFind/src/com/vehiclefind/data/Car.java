package com.vehiclefind.data;

public class Car extends Vehicle {
	private int numberOfPassengers;
	private boolean convertible;
	private boolean comfortable;
	private boolean sunroof;

	public int getNumberOfPassengers() {
		return numberOfPassengers;
	}

	public void setNumberOfPassengers(int numberOfPassengers) {
		this.numberOfPassengers = numberOfPassengers;
	}

	public boolean isConvertible() {
		return convertible;
	}

	public void setConvertible(boolean convertible) {
		this.convertible = convertible;
	}

	public boolean isComfortable() {
		return comfortable;
	}

	public void setComfortable(boolean comfortable) {
		this.comfortable = comfortable;
	}

	public boolean isSunroof() {
		return sunroof;
	}

	public void setSunroof(boolean sunroof) {
		this.sunroof = sunroof;
	}
	
	
	
	

}
