package inheritance3;

public class person {
    String ad; 
    int yas ;
    
    person(String ad ,int yas){
    	this.ad=ad;
    	this.yas=yas;
    }
    public void Yazdir() {
    	System.out.println("Adi:"+this.ad);
    	System.out.println("Yasi:"+this.yas);
    }
}
