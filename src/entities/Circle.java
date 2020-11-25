package entities;

import entities.enums.Color;

public class Circle extends Shape{
	private Double radius;

	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}
	
	@Override
	public Double area() {
		return 2*3.14*radius;
	}
}
