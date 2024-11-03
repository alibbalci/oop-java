package learninterface;

public class araba implements Iarac{
	
	private int hiz ;
	
	araba(int hiz) {
		this.hiz=hiz;
	}
	
	@Override
	public void hizlan(int artis) {
		hiz+=artis;
		System.out.println("Arabanin hızının artis Miktarı="+artis);
		System.out.println("Arabanin yeni hizi="+this.hiz);
	}
	
	@Override 
	public void yavasla( int azalis) {
		hiz-=azalis;
		System.out.println("Arabanin hızının azalis Miktarı="+azalis);
		System.out.println("Arabanin yeni hizi="+this.hiz);
	}
}
