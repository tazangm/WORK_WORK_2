package tartizio.zacharia.iuea;

import java.util.ArrayList;
import java.util.Scanner;

public class Course2 {

	public static void main(String[] args) {

		ArrayList<String> names =new ArrayList<String>();
		Scanner scan = new Scanner(System.in);

		int p=6;

		int k =1;
		while(true) {
			System.out.print("Enter student" +k+ ":");
			String name =new Scanner(System.in).nextLine();
			if(name.toLowerCase().equals("exit"))
				break;
	

			Scanner X = new Scanner(System.in);
			int OOP;
			System.out.print("OOP2            :");
			OOP = X.nextInt();
			

			int W;
			System.out.print("WEBDESIGN       :");
			W = X.nextInt();

			int B;
			System.out.print("BASICSTATISTIC  :");
			B=X.nextInt();

			int N;
			System.out.print("NETWORKS        :");
			N= X.nextInt();

			int O;
			System.out.print("OPERATING SYSTEM :");
			O= X.nextInt();

			int Sa;
			System.out.print("SYSTEM ANALYSIS AND DESIGN:");
			Sa = X.nextInt();

			int sum =Sa+O+N+B+W+OOP;
			System.out.println("SUM :"+sum + "");

			int av =sum/p;
			System.out.println("AVERAGE :" +av+ " ");

			names.add(name);
		}
			k++;
	}
}
			
	
	
	
	


