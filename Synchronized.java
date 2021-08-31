
public class Synchronized {
	
	public static void main(String[] args) {
		Display d1 = new Display();
		MyThread t1 = new MyThread(d1, "Auro");
		MyThread t2 = new MyThread(d1, "Saml");
		t1.start();
		t2.start();
		}
		
	}

class MyThread extends Thread {
	private String name;
	Display td ;
	
	MyThread(Display td,String name){
		this.name = name;
		this.td=td;
		
	}
	public void run() {
		td.wish(name);
	}
	
}

class Display {
	public synchronized void wish(String message) {
		System.out.println("Inside synchronized");
	}
}
