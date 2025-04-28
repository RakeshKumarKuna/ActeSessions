package com.acte.Multithreading;

public class RunnableEx implements Runnable {
	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println("Runnableex class" + i);
		  try {
			Thread.sleep(5000);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
	public static void main(String[] args) {
		RunnableEx obj=new RunnableEx();
		Thread tobj=new Thread(obj);
		tobj.start();
		

	}

}
