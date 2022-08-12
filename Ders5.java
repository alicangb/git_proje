import java.util.Random;


// Atama, Artirma ve Azaltma Operatorleri , random sayi uretme

public class Ders5 {
        public static void main(String [] args){
        	int a = 10;
        	int b = 15;
        	int c = 23;
        	int d  = 7;
        			
        	a = a + 1;
        	b -= 8;
        	
        	System.out.println("a'nin yeni degeri:" + a);
        	System.out.println("b'nin yeni degeri:" + b);
        	System.out.println("c'nin yeni degeri:" + c--);
        	System.out.println("c = " + c);
        	System.out.println("d = " + --d);
        	
        	Random rand = new Random();
        	
        	int e = rand.nextInt(10); // 10'a kadar olan random sayý üretir.
        	
        	System.out.println("Random Sayi:" + e);
        }
}
