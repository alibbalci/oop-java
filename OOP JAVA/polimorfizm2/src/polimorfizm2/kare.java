package polimorfizm2;

public class kare extends sekil {
	private double kenar;
	
	
	kare(double kenar){
		this.kenar=kenar;
	}
	
	
	
    public double alanHesapla() {
    	return kenar*kenar;
    }
}
