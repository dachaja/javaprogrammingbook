package chapter13;

public class ThreadMainEx {
	public static void main(String[] args) {
		long id = Thread.currentThread().getId();
		String name = Thread.currentThread().getName();
		int priority = Thread.currentThread().getPriority();
		Thread.State s = Thread.currentThread().getState();
		
		System.out.println("current thread name = " + name);
		System.out.println("current thread id = " + id);
		System.out.println("current thread priority = " + priority);
		System.out.println("current thread state = " + s);
	}
}
