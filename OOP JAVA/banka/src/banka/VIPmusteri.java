package banka;
import java.util.Scanner;

public class VIPmusteri extends müsteri{
	Scanner giris = new Scanner(System.in);
	
	VIPmusteri(int bakiye){
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
			System.out.println(cekilen+"TL tutarında para cekilmistir");
			this.bakiye-=cekilen;
		}
	}
	
	public void kredicek(int limit) {
		
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
	
	public void  faizHesapla() {
		 
		 System.out.println("Faiz Kazanc Tutari ="+(bakiye*20)/100);
		 this.bakiye=((bakiye*20)/100)+bakiye;
		
	}
	public void bakiyeYazdir() {
		System.out.println("Kurumsal Musterinin Bakiyesi="+this.bakiye);
	}
	
	
	
	
}
