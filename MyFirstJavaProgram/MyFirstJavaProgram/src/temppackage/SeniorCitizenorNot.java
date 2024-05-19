package temppackage;

import java.util.Scanner;

public class SeniorCitizenorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Age to Find If a Person Is Senior Citizen or Not:");
		Scanner scanner= new Scanner(System.in);
		int age;
        age = scanner.nextInt();

		System.out.println("AGE ENTERED IS:" +age);
        if(age>=60)
    		System.out.println("Person Is Senior Citizen:");
        else
    		System.out.println("Person Is Not a Senior Citizen:");
    	scanner.close();


	}

	
}


	


