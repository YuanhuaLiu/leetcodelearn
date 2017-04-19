package easy;

public class ValidPalindrome {
	public static void main(String[] args) {
		String string="A man, a plan, a canal: Panama";
		System.out.println(isPalindrome(string));
	}
	 public static boolean isPalindrome(String s) {
	        int left = 0;
	        int right = s.length()-1;
	         
	        while (left<right) {
	            char l = s.charAt(left);
	            char r = s.charAt(right);
	             
	            if ( !isValidChar(l) ) {
	                left++;
	                continue;
	            }
	            if ( !isValidChar(r) ) {
	                right--;
	                continue;
	            }
	             
	            if (toLowerCase(l)!=toLowerCase(r))
	                return false;
	                 
	            left++;
	            right--;
	        }
	         
	        return true;
	    }
	     
	    private static boolean isValidChar(char ch) {
	        return (ch<='z' && ch>='a') || (ch<='Z' && ch>='A') || (ch>='0' && ch<='9');
	    }
	     
	    private static char toLowerCase(char ch) {
	        if (ch>='a' && ch<='z')
	            return ch;
	        else
	            return (char) ( ch + ('z'-'Z') );
	    }
}
