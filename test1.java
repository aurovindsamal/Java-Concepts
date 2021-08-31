

public class test1 {
	private static void printString(int columnNumber)
	{
		StringBuilder columnName = new StringBuilder();

		while (columnNumber > 0) {
			int rem = columnNumber % 26;
			if (rem == 0) {
				columnName.append("Z");
				columnNumber = (columnNumber / 26) - 1;
			}
			else {
				columnName.append((char)((rem - 1) + 'A'));
				columnNumber = columnNumber / 26;
			}
		}
		System.out.println(columnName.reverse());
	}
	public static void main(String[] args)
	{
		getString(26);
		printString(51);
		printString(52);
		printString(80);
		printString(676);
		printString(702);
		getString(705);
		getNumber("AAC");
	}
	
	public static void getString(int number) {
		StringBuilder sb = new StringBuilder();
		while(number>0) {
			int index = (number-1)%26;
			sb.append((char)(index+'A'));
			number = (number-1)/26;
		}
		System.out.println(sb.reverse().toString());
	}
	
	public static void getNumber(String str) {
		int result = 0;
		for(int i=0;i<str.length();i++) {
			result*=26;
			result+=str.charAt(i)-'A'+1;
		}
		System.out.println(result);;
	}
}
