package inheritamcearac;

public class araba extends arac {
	
	araba(String marka , int modelYili){
		super(marka,modelYili);
	}
	
	@Override 
	public void Hizlan() {
		System.out.println("Arabanin Hizi 180 km/h ");
	}

}
