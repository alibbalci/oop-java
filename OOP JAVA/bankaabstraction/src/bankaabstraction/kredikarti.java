package bankaabstraction;

public class kredikarti extends odeme {
	
	kredikarti(String ad , int yas, int miktar){
		super(ad,yas,miktar);
	}
	
	@Override 
	
	public  double komisyonHesapla() {
		return ((miktar*2)/100);
	}

}
