
public class StringToIntger {
	public static void main(String[] args) {
		String string="-12311.1";
		System.out.println(atoi(string));
	}
	public static int atoi(String str) {
        int digit = 0;
        double number = 0;
        str = str.trim();
         
        boolean signed = false;
         
        for (int i=str.length()-1; i>=0; i--) {
            char ch = str.charAt(i);
            if (ch>='0' && ch<='9') { // number
                number += (ch-'0') * (int)Math.pow(10, digit);
                digit++;
            } else if(ch=='-' || ch=='+') {
                if(signed)
                    return 0;
                signed = true;
                 
                if (ch=='-')
                    number = -number;
            } else {
                number = 0;
                digit = 0;
                 
                signed = false;
            }
        }
         
        if (number>Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        if (number<=Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
         
        return (int)number;
    }
}
