import java.util.Scanner;


/*
 
     ! ( NOT )
     Kullanýmý: !(3 > 4)
     Anlamý:
     true bir deðeri, false'a çevirir; false bir deðeri ise, true'ya çevirir
     
     && ( AND )
     Kullanýmý: ( 3 > 4 ) && ("yazýlým" == "yazýlým")
     Anlamý:
     true,true  -----> true
     false,true -----> false
     true,false -----> false
     false, false -----> false
     
     || ( OR )
     Kullanýmý: ( 3 > 4 ) || ( "yazýlým" == "yazýlým" )
     true,true ----> true
     false,true -----> true
     true,false -----> true
     false, false -----> false
 */


public class Ders8 {

	public static void main(String [] args){
		System.out.println("Sonuc:" + !(3<4)); // True'yu, False'a çevirdi.
		System.out.println("Sonuc:" + ((3<4) && ("Yazilim" == "Yazilimm")) );
		System.out.println("Sonuc:" + ((3<4) || ("Yazilim" == "Yazilimm")) );
		System.out.println();
		
		String sys_kullanici_adi = "yazilimBilimi";
		String sys_parola = "abcd1234";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Kullanici adini giriniz:");
		String kullanici_adi = scan.nextLine();
		
		System.out.println("Parolayý giriniz:");
		String parola = scan.nextLine();
		
		if(!(sys_kullanici_adi.equals(kullanici_adi)) && !(sys_parola.equals(parola))){
			System.out.println("Kullanýcý adý ve þifre hatalý.");
		}
		else if(!(sys_kullanici_adi.equals(kullanici_adi)) && (sys_parola.equals(parola))){
			System.out.println("Kullanici adý hatalý.");
		}
		else if((sys_kullanici_adi.equals(kullanici_adi)) && !(sys_parola.equals(parola))){
			System.out.println("Þifre hatalý.");
		}
		else{
			System.out.println("Kullanýcý ve parolayý doðru girdiniz.");
		}
			
		
	}
}
