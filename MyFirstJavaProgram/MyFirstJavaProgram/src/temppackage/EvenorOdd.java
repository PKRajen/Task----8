package temppackage;

import java.util.Scanner;

public class EvenorOdd {
	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);

		System.out.println("Enter A Number:");
        int Num = scanner.nextInt();

		if(Num%2==0)
			
			System.out.println(Num  +  "  It is an Even Number");
		else
			System.out.println(Num  +  "  It is an ODD Number");
		scanner.close();

		}

		

}

