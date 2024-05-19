package temppackage;

import java.util.Scanner;

public class CheckPrimeorNot {


public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter any number:");
	int num  =scan.nextInt();
	boolean flag = isPrimeNumber(num);
	if (flag) {
		System.out.println("number " + num + " is prime number");
	} else {
		System.out.println("number " + num + " is  not prime number");
	}
	scan.close();
}

private static boolean isPrimeNumber(int num){
	if (num <= 1) {
		return false;
	}
	boolean flag = true;
	for (int j = 2; j <= num / 2; j++) {
		if (num % j == 0) {
			flag = false;
			break;
		}
	}
	return flag;
}
}




	


