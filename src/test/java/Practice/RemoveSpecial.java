package Practice;

public class RemoveSpecial {
	
	public static void main(String[] args) {
		
		String s = "&&&&$$!! selenium 123456789";
		
	 s =s.replaceAll("&!$", "");
		
		System.out.println(s);
		
	}

}
