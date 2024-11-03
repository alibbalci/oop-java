package bankaabstraction;

public class havale extends odeme{
	
	havale(String ad , int yas, int miktar){
		super(ad,yas,miktar);
	}
	@Override
	public  double komisyonHesapla() {
		return 5;
	}
	
}
