package inheritamcearac;

public class bisiklet extends arac{
     
	bisiklet(String marka , int modelYili){
		super(marka,modelYili);
	}
	
	public void Hizlan() {
		System.out.println("Bisikletin Hızı 25km/h");
	}
}
