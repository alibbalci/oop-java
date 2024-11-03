package sirketabstract;

public class uzaktancalisan extends calisan {
	int projesayisi;
	int projeucreti;
	
	uzaktancalisan(String isim , int yas ,String departman,int projesayisi, int projeucreti){
		super(isim,yas,departman);
		this.projesayisi=projesayisi;
		this.projeucreti=projeucreti;
	}
	
	@Override
	protected void performans() {
		System.out.println("A++++");
	}
	@Override
	protected int maasHesapla() {
		return projesayisi*projeucreti;
	}
	
}
