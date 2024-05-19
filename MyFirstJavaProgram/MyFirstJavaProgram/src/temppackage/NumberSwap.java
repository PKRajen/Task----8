package temppackage;

import java.util.Scanner;

public class NumberSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		int Num1,Num2,swap;

		System.out.println("Number Swapping:");
		System.out.println("Enter the First Number:");
		Num1=scanner.nextInt();
		System.out.println("Enter the Second Number:");
		Num2=scanner.nextInt();
		System.out.println("Before swapping: ");
        System.out.println("First Number: " + Num1);
        System.out.println("Second Number: " + Num2);
        swap=Num1;
        Num1=Num2;
        Num2=swap;
        System.out.println("Aftr swapping: ");
        System.out.println("First Number: " + Num1);
        System.out.println("Second Number: " + Num2);
		scanner.close();

	}

}
