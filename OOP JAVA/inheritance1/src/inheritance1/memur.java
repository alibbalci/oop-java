package inheritance1;

public class memur extends calisan{
	
	String departman ;
	int mesai; 
	
	memur(String ad ,String soyad, int telNo, String departman , int mesai){
		super(ad,soyad,telNo);
		this.departman=departman;
		this.mesai=mesai ; 
	}
	
	public void calis() {
		System.out.println(this.ad+this.soyad+" calismaya basladi");
	}

}
