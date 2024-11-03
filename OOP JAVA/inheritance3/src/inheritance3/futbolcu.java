package inheritance3;

public class futbolcu extends sporcu{
	int prim ; 
	
	futbolcu(String ad , int yas , String brans , int prim) {
		super(ad,yas,brans);
		this.prim=prim;
	}
	@Override
	public void Yazdir() {
		super.Yazdir();
		System.out.println("Prim Tutari:"+this.prim);
	}

}
