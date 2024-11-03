package inheritanceulasım;

public class ulasımaraci {
	String isim ;
	int hiz;
	
	ulasımaraci( String isim , int hiz){
		this.isim=isim ;
		this.hiz=hiz; 
	}
	
	public void hizYazdir() {
		
	}
	
	public void vakitHesapla(int mesafe) {
		double zaman =mesafe/hiz;
	}
}
