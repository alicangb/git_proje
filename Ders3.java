import java.util.Locale;
import java.util.Scanner; // ctrl + shift + o 'ya basarak �a��rd�m.


// Kullan�c�dan input alma ( Java Scanner )

public class Ders3 {

	public static void main(String [] args){
		
		Scanner b = new Scanner(System.in);
		Scanner c = new Scanner(System.in);
		
		b.useLocale(Locale.UK);
		
		System.out.println("Bir sayi giriniz:");
    	
		double a = b.nextDouble();
		
        System.out.println("isim giriniz:");
        
        String isim = c.nextLine();
		
       
    	System.out.println("A de�i�keninin de�eri:" + a );
		System.out.println("Girdiginiz isim:" +isim);
	}
}
