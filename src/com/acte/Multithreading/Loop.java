package com.acte.Multithreading;

public class Loop extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 1000; i++) {
			System.out.println("loop class"+i) ; 
		}
	}
	
}
