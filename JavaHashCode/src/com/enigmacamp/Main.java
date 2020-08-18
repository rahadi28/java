package com.enigmacamp;

import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Set<Circle> circleSet = new HashSet<Circle>();
		
		circleSet.add(new Circle (10D));
		circleSet.add(new Circle (5D));
		circleSet.add(new Circle (4D));
		circleSet.add(new Circle (3D));
		circleSet.add(new Circle (1D));
		circleSet.add(new Circle (1D));
		circleSet.add(new Circle (1D));
		
		for (Circle circle : circleSet) {
			System.out.println(circle.toString());
		}
	}
}