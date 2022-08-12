import java.util.Scanner;



    /*
     Karþýlaþtýrma Operatörleri
     a == b ---> eþit mi ( eþitse true, deðilse false)
     a != b ---> eþit deðil mi ( eþit deðilse true, eþitse false )
     a > b ---> a, b'den büyük mü (büyükse true, deðilse false )
     a < b ---> a, b'den küçük mü (küçükse true, deðilse false ) 
     a <= b ---> a, b'ye eþit veya b'den küçükse true, deðilse false)
     a >= b ---> a, b'ye eþit veya b'den büyükse true, deðilse false)
     
     if ( koþul )
     {
         if bloðu
         Burada koþul saðlanýnca iþlemler yapýlýyor.
         
     }
         
     */

public class Ders7 {
	
	public static void main(String [] args){
		
		System.out.println("Sonuc:" + (4 == 4));
		System.out.println("Sonuc:" + (4 > 5));
		System.out.println("Sonuc:" + (5<=6));
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Notunuzu giriniz:");
		
		int note = scan.nextInt();
		
		if(note>=85){
			System.out.println("Dersten gectiniz... Notunuz: A ");
		}
		else if(note>=80 && note<85){
			System.out.println("Dersten gectiniz... Notunuz: A- ");
		}
		else if(note>=75 && note<80){
			System.out.println("Dersten gectiniz... Notunuz: B+ ");
		}
		else if(note>=70 && note<75){
			System.out.println("Dersten gectiniz... Notunuz: B ");
		}
		else if(note>=65 && note<70){
			System.out.println("Dersten gectiniz... Notunuz: B- ");
		}
		else if(note>=60 && note<65){
			System.out.println("Dersten gectiniz... Notunuz: C+ ");
		}
		else if(note>=55 && note<60){
			System.out.println("Dersten gectiniz... Notunuz: C ");
		}
		else if(note>=50 && note<55){
			System.out.println("Dersten gectiniz... Notunuz: C- ");
		}
		else if(note>=45 && note<50){
			System.out.println("Dersten gectiniz... Notunuz: D+ ");
		}
		else if(note>=40 && note<45){
			System.out.println("Dersten gectiniz... Notunuz: D ");
		}
		else{
			System.out.println("Dersten kaldiniz.. Notunuz: F ");
		}
			
	}
       
}
