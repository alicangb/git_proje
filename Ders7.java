import java.util.Scanner;



    /*
     Kar��la�t�rma Operat�rleri
     a == b ---> e�it mi ( e�itse true, de�ilse false)
     a != b ---> e�it de�il mi ( e�it de�ilse true, e�itse false )
     a > b ---> a, b'den b�y�k m� (b�y�kse true, de�ilse false )
     a < b ---> a, b'den k���k m� (k���kse true, de�ilse false ) 
     a <= b ---> a, b'ye e�it veya b'den k���kse true, de�ilse false)
     a >= b ---> a, b'ye e�it veya b'den b�y�kse true, de�ilse false)
     
     if ( ko�ul )
     {
         if blo�u
         Burada ko�ul sa�lan�nca i�lemler yap�l�yor.
         
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
