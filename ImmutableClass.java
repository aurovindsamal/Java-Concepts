import java.util.ArrayList;
import java.util.Iterator;

public final class ImmutableClass {
	
	private final int id;
	private final String name;
	private final ArrayList<Integer> list;
	
	public ImmutableClass(int id, String name, ArrayList<Integer> list) {
		super();
		this.id = id;
		this.name = name;
		ArrayList<Integer> temp = new ArrayList<Integer>();
		Iterator<Integer> itr = temp.iterator();
		while(itr.hasNext()) {
			temp.addAll(list);
		}
		this.list = temp;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	public ArrayList<Integer> getList() {
		ArrayList<Integer> temp = new ArrayList<Integer>();
		Iterator<Integer> itr = temp.iterator();
		while(itr.hasNext()) {
			temp.addAll(list);
		}
		return temp;
	}

	
	
	
	

}
