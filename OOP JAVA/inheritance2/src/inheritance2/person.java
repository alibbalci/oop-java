package inheritance2;

public class person {
   String ad ;
   String soyad;
   
  person(String ad , String soyad) {
	  this.ad=ad;
	  this.soyad=soyad;
  }
 
  public void Yazdir () {
	  System.out.println("Kisinin Adi ve Soyadi "+this.ad+this.soyad);
	  
  }
}
