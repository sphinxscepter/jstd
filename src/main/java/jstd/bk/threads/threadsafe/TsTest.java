package jstd.bk.threads.threadsafe;

public class TsTest {
	
	private static int count = 0;
	
	public static void main(String[] args) {
//		SyncThread syncThread = new SyncThread(count);
		LockThread lockThread = new LockThread(count);
		for(int i = 0; i < 100; i++) {
			Thread t = new Thread(lockThread);
//			Thread t = new Thread(syncThread);
			t.start();
		}
	}

}
