package inheritance1;

public class bashekim extends calisan {
	String alan ;
    int odaNo;
        bashekim(String ad, String soyad, int telNo,String alan,int odaNo) {
		super(ad, soyad, telNo);
	}
        public void ameliyataGir() {
        	System.out.println(this.ad+this.soyad+" tarafından Ameliyata Girildi!");
        }
		
        
    
        
}
