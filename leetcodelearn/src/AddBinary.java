
public class AddBinary {
	public static void main(String[] args) {
		String string="1111";
		String string1="1";
		System.out.println(addBinary(string, string1));
		
		
	}
	
	 public static String addBinary(String a, String b) {
	        int carry = 0;
	        String s = "";
	        int i, j;
	        for (i = a.length() - 1, j = b.length() - 1; i >= 0 && j >= 0; i--, j--) {
	            int sum = carry + a.charAt(i) - '0' + b.charAt(j) - '0';
	            if (sum == 0) {
	                s = '0' + s;
	                carry = 0;
	            } else if (sum == 1) {
	                s = '1' + s;
	                carry = 0;
	            } else if (sum == 2) {
	                s = '0' + s;
	                carry = 1;
	            } else {
	                s = '1' + s;
	                carry = 1;
	            }
	        }
	 
	        if (i >= 0)
	            return prepend(s, a, i, carry);
	        else if (j >= 0)
	            return prepend(s, b, j, carry);
	 
	        if (carry == 1)
	            return "1" + s;
	 
	        return s;
	    }
	 
	    public static String prepend(String s, String a, int i, int carry) {
	        if (carry == 0)
	            return a.substring(0, i + 1) + s;
	 
	        for (; i >= 0; i--) {
	            if (carry == 1) {
	                if (a.charAt(i) == '1') {
	                    s = '0' + s;
	                    carry = 1;
	                } else {
	                    s = '1' + s;
	                    carry = 0;
	                }
	            } else {
	                if (a.charAt(i) == '1') {
	                    s = '1' + s;
	                    carry = 0;
	                } else {
	                    s = '0' + s;
	                    carry = 0;
	                }
	            }
	        }
	 
	        if (carry == 1) {
	            s = '1' + s;
	        }
	 
	        return s;
	    }
}
