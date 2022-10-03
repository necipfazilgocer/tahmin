import java.util.Scanner;
public class tahmin {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int number=(int)(Math.random()*100);
		int tahmin;
		int right=0;
		System.out.println(number);
	System.out.println("0 ile 100 arasında bir sayı tahmin ediniz. ");
		tahmin=scanner.nextInt();
			for(int i=0;i<=4;i++) {
	
			if(tahmin>0&&tahmin<=100) {
				if(tahmin==number) {
					System.out.println("Doğru tahmin :) ");
					break;
					
				}
				
				else if(tahmin<number) {
					right++;
					System.out.println("Yanlış tahmin,sayıyı arttırarak tekrar deneyiniz.Kalan hakkınız: "+(5-right));	
					if(right==5) { break; }
					tahmin=scanner.nextInt();
				
					
				}
				else if(tahmin>number) {
					right++;
					System.out.println("Yanlış tahmin,sayıyı azaltarak tekrar deneyiniz.Kalan hakkınız: "+(5-right));	
					if(right==5) { break; }
					tahmin=scanner.nextInt();
									
				}
				
				
				
				
			}
			else {
				
				System.out.println("Lütfen 0 ile 100 arasında bir değer giriniz!!!");
				tahmin=scanner.nextInt();
				
				
			}
			
		

		}	
			
			
	}
}