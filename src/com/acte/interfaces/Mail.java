package com.acte.interfaces;

import java.io.Serializable;
import java.util.Random;

public class Mail implements IService,Serializable{
	@Override
	public int addition(int a, int b) {
		return a+b;
	}

	@Override
	public int generateOtp() {
      Random obj=new Random();
      int otp=obj.nextInt(1000, 9999);
		return otp;
	}

	@Override
	public void sendingMail() {
		System.out.println("sending a mail");
		
	}

}
