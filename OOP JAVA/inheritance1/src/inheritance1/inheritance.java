package inheritance1;

public class inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		calisan c =new calisan("Ahmet","Yılmaz",25);
		c.giris();
        bashekim b = new bashekim("Ali","Balci",27, "Dis", 012);
        b.giris();
        b.yemek();
        b.cikis();
        b.ameliyataGir();
        System.out.println("Giris Yapan Kisi Sayisi:"+calisan.girissayisi);
        System.out.println("Cikis Yapan Kisi Sayisi :"+calisan.cikissayisi);
        System.out.println("İceride Bulunan  Kisi Sayisi : "+calisan.kisisayisi);
        memur m = new memur("Mehmet", "Korkmaz ", 33, "Bilgi İslem",8-5);
        m.giris();
        m.yemek();
        System.out.println("Giris Yapan Kisi Sayisi:"+calisan.girissayisi);
        m.calis();
        System.out.println("Cikis Yapan Kisi Sayisi :"+calisan.cikissayisi);
        System.out.println("İceride Bulunan  Kisi Sayisi : "+calisan.kisisayisi);
        m.cikis();
        intern i = new intern("fuat", "Beyaz", 20, "Çocuk", 02,45220);
        i.giris();
        i.belgeYaz();
        System.out.println("Giris Yapan Kisi Sayisi:"+calisan.girissayisi);
        System.out.println("Cikis Yapan Kisi Sayisi :"+calisan.cikissayisi);
        System.out.println("İceride Bulunan  Kisi Sayisi : "+calisan.kisisayisi);
        
	}

}
