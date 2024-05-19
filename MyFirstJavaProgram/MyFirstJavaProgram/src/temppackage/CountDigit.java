package temppackage;

import java.util.Scanner;

public class CountDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);

		System.out.println("Enter A Number:");
        int Num = scanner.nextInt();
        int digitCount = countDigits(Num);

        System.out.println("The number has " + digitCount + " digits.");
scanner.close();
    }
	

    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }
}