package polimorfizm2;

public class mainn {

	public static void main(String[] args) {
		
		sekil a =new dikdortgen(5,4);
		sekil b =new kare(5);
		sekil c=new daire(4);
		
		System.out.println("Alan="+a.alanHesapla());
		System.out.println("Alan="+b.alanHesapla());
		System.out.println("Alan="+c.alanHesapla());
        
		  sekil[] sekiller = new sekil[3];
	        sekiller[0] = new dikdortgen(5, 10); 
	        sekiller[1] = new daire(7);          
	        sekiller[2] = new kare(4);   
	        
	        for (sekil sekil : sekiller) {
	            System.out.println("Alan: " + sekil.alanHesapla());
	        }
	}

}
