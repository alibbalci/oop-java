package polimorfizm2;

public class daire extends sekil{
   private final double PI=3.14;
   private double yaricap;
   
   daire(double yaricap){
	   this.yaricap=yaricap;
   }
   
   @Override
   public double alanHesapla() {
	   return PI*yaricap*yaricap;
   }
   
}
