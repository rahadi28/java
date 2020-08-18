package com.enigmacamp;

public class Rectangle {
	protected Double length;
	protected Double width;
	
	public Rectangle(Double length, Double width) {
		super();
		this.length = length;
		this.width = width;
	}
	
	public Double getArea() {
		return length * width;
	}
	
	public Double getAround() {
		return 2 * (length + width);
	}
	
	public String print() {
		return "Rectangle (length = "+length+", width = "+width+", area = "+getArea()+", around = "+getAround()+")";
	}
}