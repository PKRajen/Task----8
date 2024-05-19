package temppackage;

import java.util.Scanner;

public class PrintGuvi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Print Welcome To Guvi 10 Times:");
		Scanner scan= new Scanner(System.in);

	    String str = scan.nextLine();
		System.out.println("*******************************");

	    
	    for(int i=1;i<=10;i++){
	      System.out.println( str);
		
	    }
	    
		scan.close();

	}
}


