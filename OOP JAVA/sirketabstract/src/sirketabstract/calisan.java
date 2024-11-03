package sirketabstract;

public abstract class calisan {
	String isim ;
	int yas;
	String departman;
	
	calisan(String isim , int yas ,String departman){
		this.isim=isim;
		this.yas=yas;
		this.departman=departman;
	}
	
	protected abstract void performans() ;
	protected abstract int maasHesapla() ;
	
	public void calisanBilgileriniGoster() {
        System.out.println("Çalışan İsmi: " + isim);
        System.out.println("Yaş: " + yas);
        System.out.println("Departman: " + departman);
    }
}
