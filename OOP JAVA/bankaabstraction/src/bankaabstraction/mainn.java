package bankaabstraction;

public class mainn {

	public static void main(String[] args) {
		
		odeme m1= new havale("Ali", 20, 2000);
		m1.bilgiYazdir();
		m1.islemBaslat();
		System.out.println("Komisyon Ucreti="+m1.komisyonHesapla());
		m1.islemBitir();
		odeme m2= new kredikarti("Ahmet", 50, 2000);
		m1.bilgiYazdir();
		m2.islemBaslat();
		System.out.println("Komisyon Ucreti="+m2.komisyonHesapla());
		m2.islemBitir();
		odeme m3= new kripto("Mete",30,2000);
		m3.bilgiYazdir();
		m3.islemBaslat();
		System.out.println("Komisyon Ucreti="+m3.komisyonHesapla());
		m3.islemBitir();
	}

}
