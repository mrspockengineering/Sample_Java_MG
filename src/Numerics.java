/*
 * functionality:
 * 	calculating with big Numbers: int, long, BigInteger
 * 
 *
 * 
 * author:
 * markus.gradl@ymail.com
 * 
 * int:				4 bit
 * BigInteger:		
 * 
 * 
 */

import java.math.BigInteger;
import java.text.NumberFormat;
import java.util.Locale;

public class Numerics {

	public static void main(String[] args) {
		System.out.println("\"Correct usage of power function with big numbers\"");
		System.out.println("-----------------------------------------------------");
		
		System.out.println(
				"int rechnet nur bis 2^31-1 korrekt; andernfalls benutze BigInteger\n" +
				"int calculates only correct until 2^31-1; otherwise use BigInteger\n");
		System.out.println("Potenzen mit int:");
		int potenz = 8;
		System.out.println("2^8: \t\t\t" + (int)(Math.pow(2, potenz)));
//		System.out.println("\tType: " + ((int)(Math.pow(2, potenz))));
		potenz = 16;
		System.out.println("2^16: \t\t\t" + (int)(Math.pow(2, potenz)));
		potenz = 30;
		System.out.println("2^30: \t\t\t" + (int)(Math.pow(2, potenz)));
		potenz = 31;
		System.out.println("2^31: \t\t\t" + (int)(Math.pow(2, potenz)) + "\t\twrong!") ;
		potenz = 32;
		System.out.println("2^" + potenz + ": \t\t\t" + (int)(Math.pow(2, potenz)));
		potenz = 32;
		System.out.println("2^" + potenz + ": \t\t\t" + (Math.pow(2, potenz)) + "\t\ttrue");
		potenz = 64;
		System.out.println("2^" + potenz + ": \t\t\t" + (Math.pow(2, potenz)) + "\t\trounded");
		
		//long
		System.out.println("\nPower with long:");
		potenz = 31;
		System.out.println("2^" + potenz + ": \t\t\t" + (long)(Math.pow(2, potenz)) + "\t\ttrue");
		potenz = 32;
		System.out.println("2^" + potenz + ": \t\t\t" + (long)(Math.pow(2, potenz)) + "\t\ttrue");
		potenz = 64;
		System.out.println("2^" + potenz + ": \t\t\t" + (long)(Math.pow(2, potenz)) + "\t\tfalse");
		potenz = 128;
		System.out.println("2^" + potenz + ": \t\t\t" + (long)(Math.pow(2, potenz)) + "\t\tfalse");

	
		// Schleife BigInteger
		BigInteger basis = BigInteger.valueOf(2L);
		System.out.println("\nPower with BigInteger:");		// Power = basis^exponent
		int[] array = new int[]{4, 8, 16, 31, 32, 64, 128};
		for (int i: array) {
			System.out.println("2^" + i + ": \t\t\t" + basis.pow(i));
		}
		
		// format result with comma - Locale.US
		System.out.println("\nPower with BigInteger, US-formatted:");		
		for (int i: new int[] {16,31, 32, 64}) {
			BigInteger resultBI = basis.pow(i);
			String resultS = NumberFormat.getNumberInstance(Locale.US).format(resultBI);
		    System.out.println("2^" + i + ": \t\t\t" + resultS);			
		}
	}
}
