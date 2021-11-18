package Package1;


public class Ground {
	private static Ground ground=null;
	private  double g;
	private  double mu;
	
	public int k;
	public double t;
	
//	private Ground()
//	{
//		this.g=g;
//		this.mu=mu;
//	}
	
//	public static void setGroundVariables(double g, double mu)
//	{
//		if(ground==null)
//		{
//			ground=new Ground(g,mu);
//			System.out.println("Ground Variables are set");
//		}
//		else
//		{
//			System.out.println("Ground Variables are already set");
//		}
//	}
	
	public void readInput()
	{
//		Driver.inanner Driver.in=new Driver.inanner(System.in);
		System.out.println("Enter acceleration due to gravity-");
		g=Driver.in.nextDouble();
		System.out.println("Enter coeficient of friction-");
		mu=Driver.in.nextDouble();
		// Setting Ground variables
//		Ground.setGroundVariables(g, mu);
		
		System.out.println("Enter number of snapshots-");
		k=Driver.in.nextInt();
		System.out.println("Enter time slice-");
		t=Driver.in.nextDouble();
		System.out.println("---------------------------------------------------------------------");
		
	}
	
	public static Ground getGround() {
		if(ground != null)
			return ground;
		else {
			ground = new Ground();
			return ground;
		}
	}
	
	public double getMu()
	{
		return mu;
	}
	public double getG()
	{
		return g;
	}
	
}

