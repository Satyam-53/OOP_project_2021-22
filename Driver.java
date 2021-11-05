package oop_project;
import java.util.*;
public class Driver {
	Ground ground;
	Shape[] shape;
	int N;
	
	public void readInput()
	{
		Scanner sc= new Scanner(System.in);
		double theta,g,mu;
		theta=sc.nextDouble();
		g= sc.nextDouble();
		mu=sc.nextDouble();
		ground= new Ground(theta,g,mu);
		int N;
		N= sc.nextInt();
		for(int i=0; i<N; i++)
		{
			int id;
			int shapeId;
			double mass;
			int x_initial;
			int y_initial;
			int x_velocity;
			int y_velocity;
			
			id= sc.nextInt();
			shapeId=sc.nextInt();
			mass=sc.nextDouble();
			x_initial=sc.nextInt();
			y_initial=sc.nextInt();
			x_velocity=sc.nextInt();
			y_velocity=sc.nextInt();
			
			if(shapeId==1)
			{
				shape[i]=new Box(id,shapeId,mass,x_initial,y_initial,x_velocity,y_velocity);
				shape[i].readInput();
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver driver1= new Driver();
		driver1.readInput();
	}

}
