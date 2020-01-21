import java.util.Scanner;
public class NonaRusu_Scanner {
	public static void main (String [] args) {
	Scanner xy=new Scanner(System.in);
	int x=xy.nextInt();
	int y=xy.nextInt();
	System.out.println("Perioada exprimata in minute este - "+ x*y);
	
	Scanner ab=new Scanner(System.in);
	int a=ab.nextInt();
	int b=ab.nextInt();
	System.out.println("Lungimea ipotenuzei triunghiului este - "+a*b);
	
	Scanner pnmkg=new Scanner(System.in);
	int p=pnmkg.nextInt();
	int k=pnmkg.nextInt();
	int n=pnmkg.nextInt();
	System.out.println("Kilograme de fructe ramase(g) dupa uscarea cantitatii initiale(k/f) - "+(p*k)/n);
	int g=pnmkg.nextInt();
	int f=pnmkg.nextInt();
	int m=pnmkg.nextInt();
	System.out.println("Kilograme de fructe necesare pentru a obtine 30kg-(m) de fructe uscate - "+(g*f)/m);
	

	}
}
