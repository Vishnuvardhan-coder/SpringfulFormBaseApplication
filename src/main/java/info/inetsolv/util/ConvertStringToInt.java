package info.inetsolv.util;

public class ConvertStringToInt {
	public static int convert(String numStr) throws Exception {
		
		//validate the given string is numberic/alphanumeric.
		new Integer(numStr);
		
		char ch[] = numStr.toCharArray();
		int sum = 0;
		//get ascii value for zero
		int zeroAscii = (int)'0';
		
		for (char c:ch) {
			int tmpAscii = (int)c;
			sum = (sum*10)+(tmpAscii-zeroAscii);
		}
		return sum;
	}
	public static void main(String a[]) {
		try{
			int convertedValue = convert("vivek123");
			System.out.println("The converted value is :"+ convertedValue);
		}catch (NumberFormatException e) {
			System.out.println(e);
		}catch (Exception e) {
			System.out.println(e);
		}
	}
}
