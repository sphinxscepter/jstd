package jstd.bk.threads.threadsafe;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockThread implements Runnable {
	
	private Lock lock = new ReentrantLock();
	
	private int count;
	
	public LockThread(int count) {
		this.count = count;
	}

	@Override
	public void run() {
//		lock.lock();
		try{
			if(lock.tryLock(1, TimeUnit.SECONDS)) {
				this.count++;
				Thread.currentThread().sleep(1000);
				System.out.println(this.count);
			} else {
				System.out.println("object locked!wait timeout!quit!!!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

}
