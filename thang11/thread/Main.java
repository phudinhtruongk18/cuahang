package thang11.thread;

import java.util.Scanner;

class RunnableDemo implements Runnable {
	public Thread t;
	private String threadName;
	boolean suspended = false;

	int n = 500;

	RunnableDemo(String name) {
		threadName = name;
		System.out.println("Creating " + threadName);
	}

	public void run() {
		System.out.println("Running " + threadName);
		try {
			for (int i = 0; i < n; i++) {
				System.out.println("Thread: " + threadName + ", " + i);
//				System.out.println("Running...");
				// Let the thread sleep for a while.
				Thread.sleep(100);
				synchronized (this) {
					while (suspended) {
						wait();
					}
				}
			}
		} catch (InterruptedException e) {
			System.out.println("Thread " + threadName + " interrupted.");
		}
		System.out.println("Thread " + threadName + " exiting.");
	}

	public void start() {
		System.out.println("Starting " + threadName);
		if (t == null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}

	void suspend() {
		suspended = true;
	}

	synchronized void resume() {
		suspended = false;
		notify();
	}
}

class PauseVideo1 extends Thread {
	boolean isPlaying;

	@Override
	public void run() {
		RunnableDemo R1 = new RunnableDemo("Thread-1");
		R1.start();
		isPlaying = true;
		Scanner sc = new Scanner(System.in);
		String temp;
		int key;
		while (true) {
			temp = sc.nextLine();
			key = (int) temp.charAt(0);
			if (isPlaying == true && key == 32) {
				System.out.println("Tam dung");
				R1.suspend();
				;
				isPlaying = false;
			} else if (isPlaying == false && key == 32) {
				System.out.println("Tiep tuc");
				R1.resume();
				isPlaying = true;
			}
		}
	}
}

public class Main {
	public static void main(String args[]) {
		Thread t = new PauseVideo1();
		t.start();
	}
}
