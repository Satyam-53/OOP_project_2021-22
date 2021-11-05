package oop_project;

abstract public class Shape {
	private int shapeId;
	private int shapeTypeId;
	private double mass;
	private int x_initial;
	private int y_initial;
	private int x_velocity;
	private int y_velocity;
	
	Shape(int shapeId,int shapeTypeId,double mass,int x_initial,int y_initial,int x_velocity,int y_velocity)
	{
		this.shapeId=shapeId;
		this.shapeTypeId=shapeTypeId;
		this.mass=mass;
		this.x_initial=x_initial;
		this.y_initial=y_initial;
		this.x_velocity=x_velocity;
		this.y_velocity=y_velocity;
	}
	
	abstract void readInput();
	abstract void calculateFinalPos();
	
	
}
