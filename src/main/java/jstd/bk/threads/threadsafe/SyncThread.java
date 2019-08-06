package jstd.bk.threads.threadsafe;

import java.util.Random;

public class SyncThread implements Runnable {
	
	private int count;
	
	public SyncThread(int count) {
		this.count = count;
	}

	@Override
	public void run() {
		synchronized(this) {
			this.count++;
			try {
				Thread.currentThread().sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(this.count);
		}		
	}

}
