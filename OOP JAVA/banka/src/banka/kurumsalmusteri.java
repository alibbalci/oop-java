package banka;

import java.util.Scanner;

public class kurumsalmusteri extends müsteri {
	Scanner giris = new Scanner(System.in);
	kurumsalmusteri(int bakiye){
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
			System.out.println(cekilen+"TL tutarında para cekilmistir");
		}
	}
	
	public void kredicek(int limit) {
		System.out.println("Kredi Limitiniz="+limit);
		System.out.println("Kredi cekmek istediginiz tutar");
		int tutar=giris.nextInt();
		if(tutar>limit) {
			System.out.println("Cekmek isteginiz tutar kredi kartı limitinizden fazladır");
		}
		else {
			this.bakiye+=tutar;
			limit-=tutar;
			System.out.println("Kalan kredi Limitiniz="+limit);
		}
	}
	
	@Override
	public void bakiyeYazdir() {
		System.out.println("Kurumsal Musterinin Bakiyesi="+this.bakiye);
	}

}
