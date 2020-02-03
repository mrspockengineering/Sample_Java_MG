import java.util.InputMismatchException;
import java.util.Scanner;

public class hotel {

	static int zimmer_frei = 20;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = true;
		int zimmer_buchen = 0;
		
		System.out.println("Start Hotel-App");
		while (flag)  {
			System.out.println("Wie viele Zimmer wollen Sie buchen?");
			try {
				Scanner scan = new Scanner(System.in);
				zimmer_buchen = scan.nextInt();
				
			} catch (InputMismatchException e) {
				System.out.println("InputMismatch Exception; neu: ");
				continue;
				
			}
			
			
			
			catch (Exception e) {
				System.out.println("Wrong input. Bitte eine gerade Zahl eingeben!");
				e.printStackTrace();
			}
			if (buchen(zimmer_buchen) && zimmer_frei > 0) {
				System.out.println("weitere Zimmer buchen? y / n?");
				Scanner scan = null;
				String s = scan.next();
				if (s.equals("n") || s.equals("N")) break;
			}
		}
		System.out.println("Vielen Dank für die Nutzung unserer App :-)");
	}
	
	public static boolean buchen(int zimmer) {
		boolean gebucht = false;
		if (zimmer_frei >= zimmer) {
			gebucht = true;
			zimmer_frei -= zimmer;
			System.out.println("Erfolgreich " + zimmer + " Zimmer gebucht!");
			System.out.println("Noch vorhandene Zimmer: " + zimmer_frei);
		} else
			System.out.println("Es können maximal " + zimmer_frei + " Zimmer gebucht werden"); 
		return gebucht;
	}
}
