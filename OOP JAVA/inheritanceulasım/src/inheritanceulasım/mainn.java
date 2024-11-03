package inheritanceulasım;



public class mainn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       araba car = new araba("Opel", 100) ; 
       ucak plane = new ucak("Boeing",800);
       bisiklet bike= new bisiklet("Bisan", 25);
       
       car.hizYazdir();
       car.vakitHesapla(500);
       plane.hizYazdir();
       plane.vakitHesapla(500);
       bike.hizYazdir();
       bike.vakitHesapla(500);
       
	}

}
