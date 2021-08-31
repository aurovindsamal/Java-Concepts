
public class EvenOddDemo {
	int counter = 1;
	static int number;
	
	public void printOdd() {
		synchronized (this) {
			while (counter < number) {
				while (counter % 2 == 0) {
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println(counter+" ");
				counter++;
				notify();
			}
		}
	}

	public void printEven() {
		synchronized (this) {
			while (counter < number) {
				while (counter % 2 == 1) {
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				System.out.println(counter+ " ");
				counter++;
				notify();
			}
		}
	}
	
	

	public static void main(String[] args) {
		number = 10;
		EvenOddDemo ev = new EvenOddDemo();
		Thread t1 = new Thread(() -> {
			ev.printEven();
		});

		Thread t2 = new Thread(() -> {
			ev.printOdd();
		});

		t1.start();
		t2.start();
	}

}
