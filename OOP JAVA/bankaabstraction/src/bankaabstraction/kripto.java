package bankaabstraction;

public class kripto extends odeme {
	
	kripto(String ad , int yas, int miktar){
		super(ad,yas,miktar);
	}
	
	public double komisyonHesapla() {
		return ((miktar*1.5)/100);
	}
}
