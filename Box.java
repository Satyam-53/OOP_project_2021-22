package Package1;

import java.util.*;

public class Box extends Shape{
	 int height;
	 int width;
//	private ReadInput input;
	
	Box()
	{
//		input=new ReadBoxInput();
	}
	
	
	@Override
	public void readInput()
	{
		
//		input.readInput(this);
		super.readInput();
//		Driver.inanner Driver.in=new Driver.inanner(System.in);
		System.out.println("Enter the box height in cm:");
		height=Driver.in.nextInt();
		System.out.println("Enter the box width in cm:");
		width=Driver.in.nextInt();
	}
	
	public void display()
	{
		System.out.println(height+" "+width);
	}
	
	@Override
	public void simulate()
	{
		
	}
}
