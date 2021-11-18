package Package1;

public class SimulateBoxOnBox implements SimulateShapes{
	public void simulate(Shape []shape)
	{
		Ground ground= Ground.getGround();
		double a=-ground.getMu();
		for(int i=0; i<ground.k; i++)
		{
			double s= shape[1].getVelocity_X()*ground.t+(0.5)*a*ground.t*ground.t;
			shape[1].setLocation_X(shape[1].getLocation_X()+s);
			double v=shape[1].getVelocity_X()+a*ground.t;
			shape[1].setVelocity_X(v);
			System.out.println("After "+ground.t*(i+1)+"seconds, position is "+shape[1].getLocation_X()+" and velocity is "+shape[1].getVelocity_X());
		}
		
		a=-ground.getMu();
		for(int i=0; i<ground.k; i++)
		{
			double s= shape[0].getVelocity_X()*ground.t+(0.5)*a*ground.t*ground.t;
			shape[0].setLocation_X(shape[1].getLocation_X()+s);
			double v=shape[0].getVelocity_X()+a*ground.t;
			shape[0].setVelocity_X(v);
			System.out.println("After "+ground.t*(i+1)+"seconds, position is "+shape[0].getLocation_X()+" and velocity is "+shape[0].getVelocity_X());
		}
	}
}
