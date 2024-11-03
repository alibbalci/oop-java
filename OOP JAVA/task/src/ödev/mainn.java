package ödev;

public class mainn {

	public static void main(String[] args) {
		
		ögrenci ogr1 = new  ögrenci("Ali", "Balci",27);
		lisansögrenci ogr2 = new lisansögrenci("Ali","Balci",27,"Gaziantep");
		lisansögrenci ogr3 = new lisansögrenci("ahmet","Balci",27,"Gaziantep");
		ogr1.yaz();
		ogr2.yaz();
		System.out.println(ogr3.toString());
		
		

	}

}
