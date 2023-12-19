package Practice;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String S = "Selenium";
		String rev = "";
		
		int length = S.length();
		
		System.out.println(length);
		
		for(int i = length-1; i>=0; i--) {
			
			rev =rev+S.charAt(i);
		}
		
		System.out.println(rev);
		
		
		
	}

}
