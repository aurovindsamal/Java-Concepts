
import java.util.LinkedList;

public class ProducerConsumer {

	public static void main(String[] args) throws InterruptedException {
		PC pc = new PC();

		Thread t1 = new Thread(() -> {
			try {
				pc.produce();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});

		Thread t2 = new Thread(() -> {
			pc.consume();
		});

		t1.start();
		t2.start();

		t1.join();
		t2.join();
	}

	static class PC {
		LinkedList<Integer> list = new LinkedList<>();
		int capacity = 2;

		private void consume() {
				while(true) {
					synchronized (this) {
						while(list.size()==0) {
							try {
								wait();
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						
						}
						int val = list.removeFirst();
						System.out.println(""+val);
						notify();
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					}
				}

		}

		private void produce() throws InterruptedException {
			int value = 0;
			while (true) {
				synchronized (this) {
					while (list.size() == capacity) {
						try {
							wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					System.out.println("produced" + value);
					list.add(value++);
					notify();
					Thread.sleep(1000);
				}
			}
		}

	}

}
