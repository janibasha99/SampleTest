package com.home.samples;

// Factory of vehicles
public class Vehicle {
	
	public Engine getEngine(){
		return new Engine();
	}
	
	public Tyres getTyres(){
		return new Tyres();
	}
	
	public String getVehicleName(){
		return "Default Name";
	}

}
