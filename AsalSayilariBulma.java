
public class AsalSayilariBulma {
	public static void main(String[] args){

	int toplam;
	
	for(int i=2; i<1000; i++)
	{
		toplam = 1;
		for(int j=2; j<i; j++){
			if(i%j==0){
				toplam++;
				continue;
			}
		}
		if(toplam==1){
			System.out.println(i);
		}		
	}
	
	}
}
