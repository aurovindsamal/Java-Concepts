import java.util.Stack;

public class ReverseWords {
	
	public static void main(String[] args) {
		
		String str = "I am a good boy";
		Stack<Character> stack = new Stack<Character>();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) != ' ') {
				stack.push(str.charAt(i));
			}
			else {
				while(stack.isEmpty()==false) {
					System.out.print(stack.pop());
				}
				System.out.print(" ");
			}
			
		}
		while (stack.empty() == false) {
	        System.out.print(stack.pop());
	         
	    }
		
	}

}
