package banka;

public class bireyselmusteri extends müsteri {
	
	bireyselmusteri(int bakiye){
		super(bakiye);
	}
	
	@Override
	public void paraYatir(int eklenen) {
		this.bakiye+=eklenen;
		System.out.println(eklenen+"TL tutarında para yatırılmıstır");
	}
	@Override
	public void paraCek(int cekilen) {
		if(cekilen>this.bakiye) {
			System.out.println("Talep edilen miktar bakiyeden daha fazladir");
		}
		else {
			this.bakiye-=cekilen;
		}
	}
	
	@Override 
	
	public void bakiyeYazdir() {
		System.out.println("Bireysel Musterinin Bakiyesi="+this.bakiye);
	}
	
}
