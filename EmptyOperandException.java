/**
 * Program Name: EmptyOperandException.java
 * Purpose: 	
 * @author		Maximus Slabon, 1000619
 * @version		1.0
 * @since		Apr 6, 2021
 */

public class EmptyOperandException extends Exception{
	
	public EmptyOperandException() {
		
		super("EmptyOperandException: No operand has been entered");
	}
}
//End of class