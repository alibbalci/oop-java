package sirketabstract;

public class ofiscalisani extends calisan{
   int sabitmaas;
   int prim;
   
   ofiscalisani(String ad ,int yas ,String departman , int sabitmaas, int prim){
	   super(ad,yas,departman);
	   this.sabitmaas=sabitmaas;
	   this.prim=prim;
   }
   
   @Override
   protected void performans() {
	   System.out.println("A++");
   }
   @Override
   protected int maasHesapla() {
	   return sabitmaas+prim;
   }
   
   
   
}
