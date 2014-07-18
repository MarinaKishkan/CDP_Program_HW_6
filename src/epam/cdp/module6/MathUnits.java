package epam.cdp.module6;

import java.util.Scanner;

public class MathUnits {
	
	static double result;
	
	public static double summ (double operand1, double operand2) {
		result = operand1 + operand2;
		return result;
		
	}
	
	public static double subtract (double operand1, double operand2) {
		result = operand1 - operand2;
		return result;
		
	}
	
	public static double multiply (double operand1, double operand2) {
		result = operand1 * operand2;
		return result;
		
	}
	
	public static double divide (double operand1, double operand2) {
			result = operand1 / operand2;
			return result;
								
	}
	
	public static double sqrt (double operand1) {
		result = Math.sqrt(operand1);
		return result;
							
}
	

}
