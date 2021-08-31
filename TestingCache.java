import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class TestingCache {
	
	private int capacity;
	private Set<Integer> lhasset;
		
	public TestingCache(int capacity) {
		super();
		this.capacity = capacity ;
		this.lhasset = new LinkedHashSet<Integer>();
	}

	public static void main(String[] args) {
		TestingCache testing = new TestingCache(4);
		testing.refer(1);
		testing.refer(2);
		testing.refer(3);
		testing.refer(1);
		testing.refer(4);
		testing.refer(5);
		testing.display();	
	}

	private void display() {
		LinkedList<Integer> ll = new LinkedList<Integer>(lhasset);
		Iterator itr = ll.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next()+" ");
		}	
	}

	private void refer(int key) {
		if(getKey(key)==false)
			put(key);	
	}

	private void put(int key) {
		if(lhasset.size()==capacity) {
			int firstKey = lhasset.iterator().next();
			lhasset.remove(firstKey);
		}
		lhasset.add(key);	
	}

	private boolean getKey(int key) {
		if(!lhasset.contains(key)) {
			return false;
		}
		lhasset.remove(key);
		lhasset.add(key);
		return true;
	}
}
