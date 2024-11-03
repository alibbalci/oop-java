package banka;

public class bankaa {

	public static void main(String[] args) {
		/*müsteri m1= new bireyselmusteri (5000);
		m1.bakiyeYazdir();
		m1.paraCek(6000);
		m1.paraYatir(2000);
		m1.bakiyeYazdir(); */ 
       
		/*müsteri m2 = new kurumsalmusteri(10000);
		m2.bakiyeYazdir();
		m2.paraYatir(2000);	
		m2.paraCek(1000);
		m2.bakiyeYazdir();
		m2.kredicek(4000);
		m2.bakiyeYazdir(); */ 
		
		müsteri m3= new VIPmusteri(1000);
		m3.paraYatir(1000);
		m3.bakiyeYazdir();
		m3.paraCek(1000);
		m3.bakiyeYazdir();
		m3.faizHesapla();
		m3.bakiyeYazdir();
		
	}

}
