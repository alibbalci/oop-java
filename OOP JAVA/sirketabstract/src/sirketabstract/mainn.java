package sirketabstract;

public class mainn {

	public static void main(String[] args) {
		
		calisan c1 = new ofiscalisani("ali", 21,"Yazılım", 200, 10);
		calisan c2= new sahacalisani("ahmet", 20, "Sosyolog",100, 20);
		calisan c3=new uzaktancalisan("mete",30, "mühendis",200,300);
		
		c1.calisanBilgileriniGoster();
		c1.performans();
		System.out.println("MAAŞ="+c1.maasHesapla());
		c2.calisanBilgileriniGoster();
		c2.performans();
		System.out.println("MAAŞ="+c2.maasHesapla());
		c3.calisanBilgileriniGoster();
		c3.performans();
		System.out.println("MAAŞ="+c3.maasHesapla());

	}

}
