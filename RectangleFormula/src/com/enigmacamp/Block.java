package com.enigmacamp;

public class Block extends Rectangle {
	private Double height;

	public Block(Double length, Double width, Double height) {
		super(length, width);
		this.height = height;
	}
	
	@Override
	public Double getArea() {
		return 2 * length * width + 2 * length * height + 2 * width * height;
	}
	
	public Double getVolume() {
		return length * width * height;
	}
	
	public String print() {
		return "Block (length = "+length+", width = "+width+", height = "+height+", area = "+getArea()+", volume = "+getVolume()+")";
	}
}