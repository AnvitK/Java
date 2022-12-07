package com.java.threads;

public class ThreadMain {

	public static void main(String[] args) {
		
		System.out.println("Hello from the main thread");
		
		Thread anotherThread = new AnotherThread();
//		anotherThread.run();
		anotherThread.setName("<=== Another Thread ===>");
		anotherThread.start();  // start --> run
//		anotherThread.run();
//		anotherThread.stop();
		
		new Thread() {
			public void run() {
				System.out.println( "Hello from the anonymous class thread");
			}
		}.start();
		
//		Thread myRunnableThread = new Thread(new MyRunnable());
//		myRunnableThread.start();
		
		Thread myRunnableThread = new Thread(new MyRunnable()) {
			@Override
			public void run() {
//				super.run();
				System.out.println("Hello from the anonymous class thread using MyRunnable class");
				try {
					anotherThread.join();
					System.out.println("AnotherThread terminated, or timed out so I'm running again");
				} catch(InterruptedException e) {
					System.out.println("I could not wait after all. I was interrupted");
				}
			}
		};
		myRunnableThread.start();
		
//		anotherThread.interrupt();
		System.out.println("Hello again the from main thread");
//		anotherThread.start();  Exception in thread "main" java.lang.IllegalThreadStateException
		
		
		
	}

}
