package Package1;
import java.util.*;
public class Driver
{
	public static final Scanner in=new Scanner(System.in);
	public static Shape shape[];
	int N;
	SimulateShapes sim;
	public void simulate()
	{
		// finds the shape on the top
		if(shape[1] != null)
			shape[0].onTop = shape[1].getShapeID();
		else shape[0].onTop = 0;
		
		Simulator s=new Simulator(shape);
		sim=s.assignShape();
//		if(shape[0].getShapeID()==1 && shape[1]==null)
//			sim=new SimulateBoxOnGround();
//		else if(shape[0].getShapeID()==1 && shape[1].getShapeID()==1)
//			sim=new SimulateBoxOnBox();
//		else if(shape[0].getShapeID()==2 && shape[1]==null)
//			sim=new SimulateBallOnGround();
//		else if(shape[0].getShapeID()==1 && shape[1].getShapeID()==2)
//			sim=new SimulateBallOnBox();
//		else if(shape[0].getShapeID()==1 && shape[1].getShapeID()==3)
//			sim=new SimulateRingOnBox();
//		else if(shape[0].getShapeID()==3)
//			sim=new SimulateRingOnGround();
		
		sim.simulate(shape);
	}
	
	public static void main(String[] args)
	{
	// TODO Auto-generated method stub
		Driver driver=new Driver();
		System.out.println("SPRING FRICTION AND FORCES SIMULATION");
		System.out.println("SET GROUND VARIABLES");
		
		System.out.println("Enter Number of objects to be used in simulation:");	
		int N=Driver.in.nextInt();
		shape=new Shape[N];
		
		Ground ground=Ground.getGround();
		ground.readInput();
		
		// Displays the shape details
		driver.shapeDetails();
		
		for(int i=0; i<N; i++)
		{
			 //Creates Shapes 
			System.out.println("Enter Shape ID:");
			int temp=in.nextInt();
			switch(temp)
			{
			case 1:
				shape[i]=new Box();
				shape[i].setShapeID(temp);
				shape[i].readInput();
			case 2:
				shape[i]= new Ball();
				shape[i].setShapeID(temp);
				shape[i].readInput();
			case 3:
				shape[i]= new Ring();
				shape[i].setShapeID(temp);
				shape[i].readInput();
			case 4:
				shape[i]= new Cylinder();
				shape[i].setShapeID(temp);
				shape[i].readInput();
			}
			
			//shape[i].display();
		}
		
		driver.simulate();
					
	}
	
	public void shapeDetails() {
		System.out.println("1. BOX");
		System.out.println("2. BALL");
		System.out.println("3. RING");
	}
	
	
}

