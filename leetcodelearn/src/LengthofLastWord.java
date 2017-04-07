
public class LengthofLastWord {
	public int lengthOfLastWord(String s) {
        if (null==s || "".equals(s.trim()))
        {
            return 0;
        }
        String[] tokens = s.trim().split(" ");
         
        return tokens[tokens.length-1].length();
    }
}
