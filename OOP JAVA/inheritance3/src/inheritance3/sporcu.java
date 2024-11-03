package inheritance3;

public class sporcu extends person {
     String brans;
     
  sporcu(String ad , int yas , String brans){
	  super(ad,yas);
	  this.brans=brans;
  }
  @Override
  public void Yazdir() {
	  super.Yazdir();
	  System.out.println("Branşı:"+this.brans);
  }
}
