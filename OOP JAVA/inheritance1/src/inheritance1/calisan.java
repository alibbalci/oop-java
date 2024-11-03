package inheritance1;

public class calisan {
   String ad ; 
   String soyad; 
   int telNo;
   static int kisisayisi=0;
   static int girissayisi=0;
   static int cikissayisi=0;

calisan(String ad , String soyad , int telNo){
	this.ad=ad;
	this.soyad=soyad; 
	this.telNo=telNo;
}
   
   
public String getAd() {
	return ad;
}


public void setAd(String ad) {
	this.ad = ad;
}


public String getSoyad() {
	return soyad;
}


public void setSoyad(String soyad) {
	this.soyad = soyad;
}


public int getTelNo() {
	return telNo;
}


public void setTelno(int telNo) {
	this.telNo = telNo;
}


public int giris() {
	System.out.println(this.ad+this.soyad+" tarafından Giris Yapildi!");
	++calisan.girissayisi;
	return ++calisan.kisisayisi;

}

public int cikis() {
	System.out.println(this.ad+this.soyad+" tarafından Cikis Yapildi!");
	++calisan.cikissayisi;
	return --calisan.kisisayisi;
}

public void yemek() {
    System.out.println(this.ad+this.soyad+" tarafından Yemek Kartı Okutuldu !");
}




}
