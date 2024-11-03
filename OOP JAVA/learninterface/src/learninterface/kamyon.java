package learninterface;

public class kamyon implements Iarac{
	private int hiz;
	
	kamyon(int hiz){
		this.hiz=hiz;
	}
	
	@Override
	public void hizlan(int artis) {
		hiz+=artis;
		System.out.println("Kamyonun hızının artis Miktarı="+artis);
		System.out.println("Kamyonun yeni hizi="+this.hiz);
	}
	@Override 
	
	public void yavasla(int azalis) {
		hiz-=azalis;
		System.out.println("Kamyonun hızının azalis Miktarı="+azalis);
		System.out.println("Kamyonun yeni hizi="+this.hiz);
	}
}
