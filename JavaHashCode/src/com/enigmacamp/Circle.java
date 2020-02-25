package com.enigmacamp;

public class Circle {
	private final Double pi = 3.14;
	private Double r;
	
	public Circle(Double r) {
		super();
		this.r = r;
	}
	
	public Double getArea() {
		Double area = 2*pi*r*r;
		return area;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result =1;
		result = prime * result + ((pi == null) ? 0 : pi.hashCode());
		result = prime * result + ((r == null) ? 0 : r.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (this.getClass() != obj.getClass()) return false;
		Circle circle = (Circle) obj;
		
		if (pi == null) {
			if (circle.pi != null) return false;
		} else if (!pi.equals(circle.pi)) return false;
		
		if (r == null) {
			if (circle.r != null) return false;
		} else if (!r.equals(circle.r)) return false;
		
		return true;
	}
	
	@Override
	public String toString() {
		return "Circle [r=" + r + "pi=" + pi + ", getArea()=" + getArea() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}