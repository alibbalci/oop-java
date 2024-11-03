package sirketabstract;

public class sahacalisani extends calisan {
	
	int calismaSaati;
	int ucret;
	
	sahacalisani(String isim , int yas ,String departman,int calismaSaati , int ucret){
		super(isim,yas,departman);
		this.calismaSaati=calismaSaati;
		this.ucret=ucret;
	}
	
	@Override
	protected void performans() {
		System.out.println("B++");
	}
	@Override 
	protected int maasHesapla() {
		return ucret*calismaSaati;
	}
	

}
