package inheritanceulasım;

public class ucak extends ulasımaraci {
	
	ucak(String isim,int hiz){
		super(isim,800);
	}
	
	@Override
    public void hizYazdir() {
		System.out.println("Ucagin Hizi :"+this.hiz);
	}
    
	@Override 
	
	public void vakitHesapla(int mesafe) {
		double zaman=mesafe/(double)this.hiz;
		System.out.println("Ucak"+mesafe+"kmyi"+zaman+"sürede alır");
	}

}
