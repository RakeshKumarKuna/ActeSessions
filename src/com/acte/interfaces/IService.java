package com.acte.interfaces;

//  interface for create constracts rules
// abstract methods  
//normal methids(concreate methods) not allowed  
public interface IService extends IServiceTwo {
	
    static final String name="bharath";
	public abstract int addition(int a,int b);
	public abstract int generateOtp();
	public static void sharecommonlogic() {
		
	}
	public default void commonlogics() {
		
	}

}
