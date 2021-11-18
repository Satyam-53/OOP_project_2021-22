package Package1;
import java.util.*;
public abstract class Shape {
	private int shapeId;
	//private int shapeTypeId;
	private double mass;
	private double orientation;
	private double x_initial;
	private double y_initial;
	private double x_velocity;
	private double y_velocity;
	public ReadInput input;
	int onTop;
//	Shape(int shapeId,int shapeTypeId,double mass,int x_initial,int y_initial,int x_velocity,int y_velocity)
//	{
//		this.shapeId=shapeId;
//		this.shapeTypeId=shapeTypeId;
//		this.mass=mass;
//		this.x_initial=x_initial;
//		this.y_initial=y_initial;
//		this.x_velocity=x_velocity;
//		this.y_velocity=y_velocity;
//	}
	
	
	public void readInput()
	{
//		Driver.inanner Driver.in=new Driver.inanner(System.in);
		System.out.println("Enter mass in kg: ");
		mass=Driver.in.nextDouble();
		System.out.println("Enter orientation in degrees");
		orientation=Driver.in.nextDouble();
		System.out.println("Enter the X coordinate:");
		x_initial=Driver.in.nextDouble();
		System.out.println("Enter the Y coordinate:");
		y_initial=Driver.in.nextDouble();
		System.out.println("Enter the X component of velocity in m/s:");
		x_velocity=Driver.in.nextDouble();
		System.out.println("Enter the Y component of velocity ini m/s:");
		y_velocity=Driver.in.nextDouble();
	}
	abstract public void simulate();
	abstract public void display();
	
	public int getShapeID()
	{
		return shapeId;
	}
	
//	public String getShapeTypeID()
//	{
//		return shapeTypeId;
//	}
	public double getMass()
	{
		return mass;
	}
	public double getOrientation()
	{
		return orientation;
	}
	public double getLocation_X()
	{
		return x_initial;
	}
	public double getLocation_Y()
	{
		return y_initial;
	}
	public void displayLocation()
	{
		System.out.println("(X,Y)=("+x_initial+","+y_initial+")");
	}
	public double getVelocity_X()
	{
		return x_velocity;
	}
	public double getVelocity_Y()
	{
		return y_velocity;
	}
	public void displayVelocity()
	{
		System.out.println("Velocity is=" +Math.sqrt(x_velocity*x_velocity+y_velocity*y_velocity));
	}
	
	public void setShapeID(int shapeId)
	{
		this.shapeId=shapeId;
	}
//	public void setShapeTypeID(String shapeTypeId)
//	{
//		this.shapeTypeId=shapeTypeId;
//	}
	public void setMass(double mass)
	{
		this.mass=mass;
	}
	public void setOrientation(double orientation)
	{
		this.orientation=orientation;
	}
	public void setLocation_X(double x_initial)
	{
		this.x_initial=x_initial;
	}
	public void setLocation_Y(double y_initial)
	{
		this.y_initial=y_initial;
	}
	public void setVelocity_X(double x_velocity)
	{
		this.x_velocity=x_velocity;
	}
	public void setVelocity_Y(double y_velocity)
	{
		this.y_velocity=y_velocity;
	}
}
