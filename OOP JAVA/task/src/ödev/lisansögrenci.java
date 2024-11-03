package ödev;

public class lisansögrenci extends ögrenci {
	
	String stajyeri;
	
	lisansögrenci(String ad , String soyad , int no, String stajyeri){
		super(ad,soyad,no);
		this.stajyeri=stajyeri;
	}

	public String getStajyeri() {
		return stajyeri;
	}

	public void setStajyeri(String stajyeri) {
		this.stajyeri = stajyeri;
	}
	
	public void dersCalis(int saat) {
		System.out.println(saat+"ders calisildi");
	}
	
	@Override
	public void yaz() {
		System.out.println("Ogrencinin adi:"+getAd()+"ogrencinin soyadi:"+getSoyad()+"ogrencinin numarasi:"+getNo()+"Stajyeri"+getStajyeri());
	}
	
	public String toString() {
		super.yaz();
		return stajyeri;
	}
}
