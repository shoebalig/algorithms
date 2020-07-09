package pack;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadSeries {
	static AtomicInteger i = new AtomicInteger(0);
	static AtomicInteger j = new AtomicInteger(0);
	// static BlockingQueue<Integer> bl = new ArrayBlockingQueue<>(1);

	public static void main(String[] args) {
		
		
		ExecutorService executor = Executors.newFixedThreadPool(2);
		ReentrantLock lock = new ReentrantLock();

		executor.submit(() -> {
		    lock.lock();
		    try {
		        try {
		        	System.out.println("Locked: memem bdns hfjs");
					Thread.sleep(1);
					System.out.println("After me");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    } finally {
		    	System.out.println("Locked: memem" + lock.isLocked());
		        lock.unlock();
		    }
		});

		executor.submit(() -> {
			System.out.println(lock.tryLock());
		    System.out.println("Locked: " + lock.isLocked());
		    System.out.println("Held by me: " + lock.isHeldByCurrentThread());
		    boolean locked = lock.tryLock();
		    try {
				Thread.sleep(1);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    System.out.println("Lock acquired: " + lock.isLocked());
		    System.out.println("Lock acquired: " + locked);
		});

		//stop(executor);
		
		/*System.out.println("....Started.........");
		// bl.add(1);
		Thread t1 = new MyThread();
		t1.setName("First");
		Thread t2 = new MyThread2();
		t2.setName("Second");
		Thread t3 = new MyThread3();
		t3.setName("Third");
		t1.start();
		t2.start();*/
		// t3.start();
	}

}

class MyThread extends Thread {
	public void run() {
		
			while (true) {
				synchronized (ThreadSeries.i){
				synchronized (ThreadSeries.j){
				//if (ThreadSeries.i.get() > 10)
					//return;
				System.out.println(Thread.currentThread().getName());
				
				//System.out.println(ThreadSeries.i.incrementAndGet());
				/*try {
					//Thread.sleep(100);
					// int i = ThreadSeries.bl.poll();
					// ThreadSeries.bl.add(i + 1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}*/
			}}
		}
	}
}

class MyThread2 extends Thread {
	public void run() {

		// if (ThreadSeries.bl.element() > 10)
		// return;
		// System.out.println(ThreadSeries.bl.element());
		
			while (true) {
				synchronized (ThreadSeries.j) {
				synchronized (ThreadSeries.i) {
					
				//if (ThreadSeries.i.get() > 10)
				//	return;
				System.out.println(Thread.currentThread().getName());
				//System.out.println(ThreadSeries.i.incrementAndGet());
				/*try {
					Thread.sleep(100);
					// int i = ThreadSeries.bl.poll();
					// ThreadSeries.bl.offer(i + 1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}*/
				}
			}
		}
	}
}
class MyThread3 extends Thread {
	public void run() {

		// if (ThreadSeries.bl.element() > 10)
		// return;
			while (true) {
				if (ThreadSeries.i.get() > 10)
					return;
				System.out.println(Thread.currentThread().getName());
				// System.out.println(ThreadSeries.bl.element());
				System.out.println(ThreadSeries.i.incrementAndGet());
				try {
					Thread.sleep(100);
					// int i = ThreadSeries.bl.poll();
					// ThreadSeries.bl.offer(i + 1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		}
	}
}
