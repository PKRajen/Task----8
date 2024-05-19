
package temppackage;

import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Check the Greater Number!");
		System.out.println("Enter the Numbers!");
		int A,B,C,D;

		Scanner scan= new Scanner(System.in);
		System.out.println(" Value of A is" );
		A=scan.nextInt();
		System.out.println("Value of B is");
		B=scan.nextInt();

		System.out.println("Value of C is");
		C=scan.nextInt();

		System.out.println("Value of D is");
		D=scan.nextInt();
		int Num1, Num2;
		Num1=A+B;
		Num2=C+D;
		
		if(Num1>=Num2)
		
            System.out.println(A+B +  "  Sum of A& B is greater than Sum Of C & D");
		else
       
            System.out.println(C+D +  "  Sum of C&D is greater than Sum Of A & B");
		scan.close();


	}

}
