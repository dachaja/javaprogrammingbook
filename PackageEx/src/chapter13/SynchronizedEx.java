package chapter13;

public class SynchronizedEx {
	public static void main(String[] args) {
		SyncObject obj = new SyncObject();
		
		Thread th1 = new WorkerThread("kitae", obj);
		Thread th2 = new WorkerThread("hyosoo", obj);
		
		th1.start();
		th2.start();
	}
}

class SyncObject {
	int sum=0;
	synchronized void add(Thread currentThread) {
		int n=sum;
		//Thread.currentThread().yield();
		currentThread.yield();
		n += 10;
		sum = n;
		System.out.println(Thread.currentThread().getName() + " : " + sum);
		
	}
	int getSum() {
		return sum;
	}
}

class WorkerThread extends Thread {
	SyncObject sObj;
	
	public WorkerThread(String name, SyncObject sObj) {
		super(name);
		this.sObj = sObj;
	}
	@Override
	public void run() {
		super.run();
		
		int i = 0;
		while(i<10) {
			sObj.add(this);
			i++;
		}
	}
}
