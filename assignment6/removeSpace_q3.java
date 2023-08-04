package assignment6;

public class removeSpace_q3 {
	public static void main(String[] args)
	    {
	        String str = "     Geeks     for Geeks     ";
	        str = str.replaceAll("\\s", "");                              					//InBuilt Function
	        System.out.println(str);
	        
	        String str2 = "    Geeks     for Geeks     ";
	        String op = "";
	        for (int i = 0; i < str2.length(); i++) {
	            char ch = str2.charAt(i);												//Custom Logic
	            if (!Character.isWhitespace(ch)) {
	                op += ch;
	            }
	        }
	        System.out.println(op);
	    }
}
