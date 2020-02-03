/*
 * Functions:
 * - working with big numbers (math.BigInteger), big power-Function
 * 		i < 3		result:		1
 * 		i < 4		result:		5
 * 		i < 5		result:		32
 * 		i < 6		result:		288
 * 		..
 * 		i < 1001	result:		....
 * 
 *   author:
 * 	 markus.gradl@ymail.com
 */



import java.math.BigInteger;
public class Numerics2{
    public static void main(String[] args){
		System.out.println( "Start Numerics 2: Long Pow");
		BigInteger bi = BigInteger.valueOf(0L);
		BigInteger a = BigInteger.valueOf(0L);
		BigInteger somma = BigInteger.valueOf(0L);
		BigInteger pot = BigInteger.valueOf(0L);
			 
		for (int  i= 1; i<6 ;i++){
		      somma = somma.add(pot); 
		      bi = BigInteger.valueOf(i);
		      pot = bi.pow(i); 
		}
		System.out.println(somma);
		
		
		 
    }
}