/*
 * 
 * instanceof, getClass()
 */


public class objectType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		Integer o = a;
		System.out.println("Type of o == Integer: " + (o instanceof Integer));
		System.out.println("Class of o: " + o.getClass());
		
		// primitves ?
		// System.out.println("Class of o: " + a.getClass());


	}

}
