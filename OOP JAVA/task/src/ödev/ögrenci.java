package ödev;

public class ögrenci {
	String ad; 
	String soyad ; 
	int no ;


ögrenci(String ad , String soyad , int no){
	this.ad=ad;
	this.soyad=soyad;
	this.no=no;
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


public int getNo() {
	return no;
}


public void setNo(int no) {
	this.no = no;
}

public void yaz() {
	System.out.println("Ogrencinin adi:"+getAd()+"ogrencinin soyadi:"+getSoyad()+"ogrencinin numarasi:"+getNo());
}

}