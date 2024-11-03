package inheritance1;

public class intern extends bashekim {
	
	int lisansNo;
	
	intern(String ad , String soyad , int telNo ,String alan, int odaNo ,int lisansNo){
		super(ad,soyad,telNo,alan,odaNo);
		this.lisansNo=lisansNo;
	}
	
	public void belgeYaz()
	{
		System.out.println(this.ad+this.soyad+" tarafından belge yazildi");
	}

	
	
       
}
