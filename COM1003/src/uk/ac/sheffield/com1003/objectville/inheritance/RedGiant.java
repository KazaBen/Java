/*
 * RedGiant.java  	1.1 21/12/2015
 *
 * Copyright (c) University of Sheffield 2016
 */

/** 
* RedGiant.java
* 
* 
* @version 1.1 21/12/2015
* 
* @author Phil McMinn/Richard Clayton
*/

package uk.ac.sheffield.com1003.objectville.inheritance;

public class RedGiant extends Star {

	private double yearsToExtinction;

	public RedGiant(double magnitude, 
					double surfaceTemperature,
					double yearsToExtinction) {
		super(magnitude, surfaceTemperature);
		this.yearsToExtinction = yearsToExtinction;
	}

	public double getYearsToExtinction() {
		return yearsToExtinction;
	}

	public void printInfo() {
		super.printInfo();
		System.out.println("Years to extinction: "+yearsToExtinction);
	}
	public void setYearsToExtinction(int x){
		this.yearsToExtinction = x;
	}
	public boolean equals(RedGiant anotherObject){
		if(this == anotherObject || (anotherObject.getMagnitude()==this.getMagnitude() && anotherObject.getSurfaceTemperature() == this.getSurfaceTemperature() && this.getYearsToExtinction()==anotherObject.getYearsToExtinction())){
			return true;
		}
		else if(anotherObject == null || anotherObject.getClass() != this.getClass()){
			return false;
		}
		return false;
	}
	public RedGiant makeCopy(){
		// makes a copy of the current object
		return new RedGiant(super.getMagnitude(),super.getSurfaceTemperature(),this.yearsToExtinction);
	}
}



