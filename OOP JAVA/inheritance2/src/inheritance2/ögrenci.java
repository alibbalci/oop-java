package inheritance2;

import java.lang.classfile.Superclass;

public class ögrenci extends person {
    int ogrNo;
    
ögrenci(String ad , String soyad ,int ogrNo) {
	super(ad,soyad);
	this.ogrNo=ogrNo;
}

@Override 
public void Yazdir() 
{
	super.Yazdir();
	System.out.println("Numarası"+this.ogrNo);
}
    
}
