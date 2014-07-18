package epam.cdp.module6;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		
		boolean repeat = true;
		double operand1, operand2;
		
		while (repeat) {
			
			System.out.println("Please, enter number of menu:");
			System.out.println("1 - Summa");
			System.out.println("2 - Subtract");
			System.out.println("3 - Multiplication");
			System.out.println("4 - Division");
			System.out.println("5 - Square root");
			System.out.println("0 - Exit");
			
			Scanner scanner = new Scanner(System.in);
			int action = scanner.nextInt();
			
					
			switch(action) {
			
			case 0:
				System.out.println("Completed!");
			
			case 1:
				System.out.println("Please, enter operand1:");
				operand1 = scanner.nextDouble();
				System.out.println("Please, enter operand2:");
				operand2 = scanner.nextDouble();
				System.out.println("Result = " + MathUnits.summ(operand1,operand2));
				break;
			
			case 2:
				System.out.println("Please, enter operand1:");
				operand1 = scanner.nextDouble();
				System.out.println("Please, enter operand2:");
				operand2 = scanner.nextDouble();
				System.out.println("Result = " + MathUnits.subtract(operand1,operand2));
				break;
				
			case 3:
				System.out.println("Please, enter operand1:");
				operand1 = scanner.nextDouble();
				System.out.println("Please, enter operand2:");
				operand2 = scanner.nextDouble();
				System.out.println("Result = " + MathUnits.multiply(operand1,operand2));
				break;
				
			case 4:
				System.out.println("Please, enter operand1:");
				operand1 = scanner.nextDouble();
				System.out.println("Please, enter operand2:");
				operand2 = scanner.nextDouble();
				System.out.println("Result = " + MathUnits.divide(operand1,operand2));
				break;
				
			case 5:
				System.out.println("Please, enter operand:");
				operand1 = scanner.nextDouble();
				System.out.println("Result = " + MathUnits.sqrt(operand1));
				break;
				
				default:
					System.out.println("Incorrect value");
			
	
			}
		}
		

	}

}
