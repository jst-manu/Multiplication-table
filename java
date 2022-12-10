package tutorial;

import java.util.Scanner;



public class assignment {

	 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the number ");
		 int i = sc.nextInt();
	 System.out.println("Enter the range you want ");
		int k = sc.nextInt();
     
		if(i > 0)
		{
			for(int j = 1;j <= k;j++) {
				System.out.println(i + " x " + j + " = " + (j * i));
				
			}
		}
		else
			System.err.println(" Enter only Positive Numbers ");
		 
	}
}
