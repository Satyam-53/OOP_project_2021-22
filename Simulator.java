package Package1;

public class Simulator {
	Shape []shape;
	SimulateShapes sim;
	Simulator(Shape shape[])
	{
		this.shape=shape;
	}
	
	public SimulateShapes assignShape()
	{
		
		if(shape[0].getShapeID()==1 && shape[1]==null)
			sim=new SimulateBoxOnGround();
		else if(shape[0].getShapeID()==1 && shape[1].getShapeID()==1)
			sim=new SimulateBoxOnBox();
		else if(shape[0].getShapeID()==2 && shape[1]==null)
			sim=new SimulateBallOnGround();
		else if(shape[0].getShapeID()==1 && shape[1].getShapeID()==2)
			sim=new SimulateBallOnBox();
		else if(shape[0].getShapeID()==1 && shape[1].getShapeID()==3)
			sim=new SimulateRingOnBox();
		else if(shape[0].getShapeID()==3)
			sim=new SimulateRingOnGround();
		
		return sim;
	}
}
