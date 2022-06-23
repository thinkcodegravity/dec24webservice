package com.tutorial.webserviceClient.rest;

public class ComplexOutputJson {
	int square;
	int cube;
	double areaOfCircle;
	//get set methods
	public int getSquare() {
		return square;
	}
	public void setSquare(int square) {
		this.square = square;
	}
	public int getCube() {
		return cube;
	}
	public void setCube(int cube) {
		this.cube = cube;
	}
	public double getAreaOfCircle() {
		return areaOfCircle;
	}
	@Override
	public String toString() {
		return "ComplexOutputJson [square=" + square + ", cube=" + cube + ", areaOfCircle=" + areaOfCircle + "]";
	}
	public void setAreaOfCircle(double areaOfCircle) {
		this.areaOfCircle = areaOfCircle;
	}

}
