package bankaabstraction;

public abstract class odeme {
      String ad;
      int yas; 
      int miktar;
      
      odeme(String ad , int yas, int miktar) {
    	  this.ad=ad;
    	  this.yas=yas;
    	  this.miktar=miktar;
      }
      public abstract double komisyonHesapla();
      
      public void islemBaslat() {
    	  System.out.println("İslem Baslatildi");
      }
      
      public void islemBitir() {
    	  System.out.println("İslem Bitirildi");
      }
      
      public void bilgiYazdir() {
    	  System.out.println("AD="+this.ad);
    	  System.out.println("YAS="+this.yas);
      }
}
