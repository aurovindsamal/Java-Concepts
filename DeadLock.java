
public class DeadLock {

	public static Object obj1 = new Object();
	public static Object obj2 = new Object();

	public static void main(String[] args) {
		Thread t1 = new Thread(()->{
			synchronized (obj1) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (obj2) {
					System.out.println("in Block m2");
				}
			}	
		});
		
		Thread t2 = new Thread(()->{
			synchronized (obj1) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (obj2) {
					System.out.println("in Block m2");
				}
			}	
		});
		
		t1.start();
		t2.start();
		
		
}

}
