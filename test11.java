import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Collectors;

public class test11 {
	
	public static void main(String[] args) {
		
		int arr[] = {10,6,9,0,8,1,8,7,6};
		int k = 7;
		int min = Integer.MAX_VALUE;
		HashSet<Integer> set = new HashSet<Integer>();
		for(int j=arr.length-1;j>=0;j--) {
			if(set.contains(arr[j])) {
				min = j;
			}
			else {
				set.add(arr[j]);
			}
		}
		System.out.println(arr[min]);
		
		int[] m = {3,1,2,6,5};
		ArrayList<Integer> llist = new ArrayList<Integer>();
		llist.add(3);
		llist.add(1);
		llist.add(2);
		llist.add(6);
		llist.add(5);
		List<Integer> collect = llist.stream().map(x->x*x).sorted().collect(Collectors.toList());
		System.out.println(collect.toString());
		
		String[] str = {"i","we","a","a","i","boy"};
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		for(int i=0;i<str.length;i++) {
			if(tm.containsKey(str[i])) {
				tm.put(str[i], tm.get(str[i])+1);
			}
			else {
				tm.put(str[i], 1);
			}
		}
		for(Map.Entry<String, Integer> entry : tm.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		
		
		
		
		
	}
	
}
