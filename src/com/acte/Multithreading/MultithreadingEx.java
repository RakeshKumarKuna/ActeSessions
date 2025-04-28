package com.acte.Multithreading;
// extends Thred
// impelment runnable
public class MultithreadingEx extends Thread{
	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println("multithread class"+i);
		}
	}

	public static void main(String[] args) {
		System.out.println("main thread started");  //single threaded
		//main thread
		// MultithreadingEx thread
		
		//loop thread
		MultithreadingEx obj = new MultithreadingEx();
	     obj.start();
	 	Loop loop=new Loop();
		loop.start();
		
	  
	}

}
