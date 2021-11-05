package oop_project;

import java.util.Scanner;

public class Box extends Shape{
	private int height;
	private int width;
	private int I;
	
	Box(int shapeId,int shapeTypeId,double mass,int x_initial,int y_initial,int x_velocity,int y_velocity)
	{
		super(shapeId,shapeTypeId,mass,x_initial,y_initial,x_velocity,y_velocity);
	}
	
	@Override
	void readInput()
	{
		Scanner sc= new Scanner(System.in);
		height=sc.nextInt();
		width=sc.nextInt();
		I=sc.nextInt();
	}
	
	@Override
	void calculateFinalPos()
	{
		
	}
}
