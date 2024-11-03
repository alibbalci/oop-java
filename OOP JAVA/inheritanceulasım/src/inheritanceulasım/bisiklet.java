package inheritanceulasım;

public class bisiklet extends ulasımaraci {
	
	bisiklet (String isim , int hiz){
	super(isim,25);
	}
	
	@Override
    public void hizYazdir() {
		System.out.println("Bisikletin Hizi :"+this.hiz);
	}
    
	@Override 
	
	public void vakitHesapla(int mesafe) {
		double zaman=mesafe/this.hiz;
		System.out.println("Bisiklet"+mesafe+"kmyi"+zaman+"sürede alır");
	}

        
}
