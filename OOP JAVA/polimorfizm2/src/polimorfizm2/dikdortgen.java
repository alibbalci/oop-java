package polimorfizm2;

public class dikdortgen extends sekil {
	
	 private double kisakenar;
	 private double uzunkenar;
	 
	 dikdortgen(double kisakenar , double uzunkenar){
		 this.kisakenar=kisakenar;
		 this.uzunkenar=uzunkenar;
	 }
	 
	 @Override 
	 public double alanHesapla() {
		 
		 return kisakenar*uzunkenar;
	}
}
