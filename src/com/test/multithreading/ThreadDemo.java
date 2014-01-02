package com.test.multithreading;

public class ThreadDemo {
	public static void main(String args[]) {
		new NewThread(); // create a new thread

		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Main Thread: " + i);
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted.");
		}
		System.out.println("Main thread exiting.");
	}
}

// Create a new thread.
class NewThread implements Runnable {
	Thread t;

	NewThread() {
		// Create a new, second thread
		t = new Thread(this, "Demo Thread");
		System.out.println("Child thread: " + t);
		t.start(); // Start the thread
	}

	// This is the entry point for the second thread.
	public void run() {
		try {
			new NewThreadII().join();
			// Join this thread with Thread II
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Child Thread: " + i);
				// Let the thread sleep for a while.
				Thread.sleep(50);
			}
		} catch (InterruptedException e) {
			System.out.println("Child interrupted.");
		}
		System.out.println("Exiting child thread.");
	}
}

// Create a second thread by extending Thread
class NewThreadII extends Thread {
	NewThreadII() {
		// Create a new, second thread
		super("Demo Thread II");
		System.out.println("Child thread II: " + this);
		start(); // Start the thread
	}

	// This is the entry point for the second thread.
	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Child Thread II: " + i);
				// Let the thread sleep for a while.
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			System.out.println("Child interrupted II.");
		}
		System.out.println("Exiting child thread II.");
	}
}
