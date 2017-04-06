
public class ValidNumber {
	public static void main(String[] args) {
		String s="";
		System.out.println(isNumber(s));
	}
	
	public static boolean isNumber(String s) {
        if(null==s)
            return false;
        return s.matches("^\\s*[\\+|\\-]{0,1}[0-9]*(([\\.]{0,1}[0-9]+)|([0-9]+[\\.]{0,1}))([e|E][\\+|\\-]{0,1}[0-9]+){0,1}\\s*$");
    }
}
