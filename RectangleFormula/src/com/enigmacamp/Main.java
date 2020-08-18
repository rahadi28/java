package com.enigmacamp;

public class Main {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(8d, 3D);
		System.out.println(rectangle.getArea());
		System.out.println(rectangle.getAround());
		System.out.println(rectangle.print());
		
		Block block = new Block(8d, 3d, 5d);
		System.out.println(block.getArea());
		System.out.println(block.getVolume());
		System.out.println(block.print());
		
		Rectangle rectangularPrism = new Block(8d, 3d, 5d);
		System.out.println(rectangularPrism.getArea());
		System.out.println(((Block) rectangularPrism).getVolume());
		System.out.println(rectangularPrism.print());
	}
}