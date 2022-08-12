import java.util.Scanner;


/*
 
     ! ( NOT )
     Kullan�m�: !(3 > 4)
     Anlam�:
     true bir de�eri, false'a �evirir; false bir de�eri ise, true'ya �evirir
     
     && ( AND )
     Kullan�m�: ( 3 > 4 ) && ("yaz�l�m" == "yaz�l�m")
     Anlam�:
     true,true  -----> true
     false,true -----> false
     true,false -----> false
     false, false -----> false
     
     || ( OR )
     Kullan�m�: ( 3 > 4 ) || ( "yaz�l�m" == "yaz�l�m" )
     true,true ----> true
     false,true -----> true
     true,false -----> true
     false, false -----> false
 */


public class Ders8 {

	public static void main(String [] args){
		System.out.println("Sonuc:" + !(3<4)); // True'yu, False'a �evirdi.
		System.out.println("Sonuc:" + ((3<4) && ("Yazilim" == "Yazilimm")) );
		System.out.println("Sonuc:" + ((3<4) || ("Yazilim" == "Yazilimm")) );
		System.out.println();
		
		String sys_kullanici_adi = "yazilimBilimi";
		String sys_parola = "abcd1234";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Kullanici adini giriniz:");
		String kullanici_adi = scan.nextLine();
		
		System.out.println("Parolay� giriniz:");
		String parola = scan.nextLine();
		
		if(!(sys_kullanici_adi.equals(kullanici_adi)) && !(sys_parola.equals(parola))){
			System.out.println("Kullan�c� ad� ve �ifre hatal�.");
		}
		else if(!(sys_kullanici_adi.equals(kullanici_adi)) && (sys_parola.equals(parola))){
			System.out.println("Kullanici ad� hatal�.");
		}
		else if((sys_kullanici_adi.equals(kullanici_adi)) && !(sys_parola.equals(parola))){
			System.out.println("�ifre hatal�.");
		}
		else{
			System.out.println("Kullan�c� ve parolay� do�ru girdiniz.");
		}
			
		
	}
}
