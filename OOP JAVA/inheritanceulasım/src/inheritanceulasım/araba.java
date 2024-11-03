package inheritanceulasım;

public class araba extends ulasımaraci {
	
	araba(String isim , int hiz){
		super(isim,100);
	}
	
	@Override
    public void hizYazdir() {
		System.out.println("Arabanin Hizi :"+this.hiz);
	}
    
	@Override 
	
	public void vakitHesapla(int mesafe) {
		double zaman=mesafe/this.hiz;
		System.out.println("Arac"+mesafe+"kmyi"+zaman+"sürede alır");
	}
}
