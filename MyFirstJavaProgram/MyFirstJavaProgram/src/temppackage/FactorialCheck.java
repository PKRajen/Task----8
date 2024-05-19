package temppackage;

import java.util.Scanner;

public class FactorialCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);

		System.out.println("Enter A Number To Find Its Factorial:");
        int Num = scanner.nextInt();
        int fact=1;
        for(int i=1;i<=Num;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of the number: "+fact); 
		scanner.close();

     }  


	}


