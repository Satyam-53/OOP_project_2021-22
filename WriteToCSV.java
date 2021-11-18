package project_1;
import java.io.*;
public class WriteToCSV {
	public static File csvFile = null;
	public static PrintWriter out = null;
	
	public static void makeFile() throws FileNotFoundException {
		csvFile = new File("data1.csv");
		out = new PrintWriter(csvFile);
		System.out.println("File Created");
	}
	public static void writeToCSV(int timeslice, int l_x, int l_y, int v_X, int v_Y) {
		out.printf("%d, %d, %d, %d, %d\n", timeslice, l_x, l_y, v_X, v_Y);
//		out.println(timeslice+ l_x+ l_y+ v_X+ v_Y);
		System.out.println("file updated");
	}
	
	public static void closeFile() {
		if(out!= null) {
			out.close();
		}
	}
}

