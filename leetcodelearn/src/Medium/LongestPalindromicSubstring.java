package Medium;
/*
 * 注意需要考虑到奇数对称（比如aba）和偶数对称（比如abba）这两种情况
 */
public class LongestPalindromicSubstring {
	public String longestPalindrome(String s) {
        String sub = "";
        for (int i=0; i<s.length(); i++) {
            int j;
            // odd
            for (j=0; i-j>=0 && i+j<s.length(); j++) {
                if (s.charAt(i-j)==s.charAt(i+j)) {
                    if (j*2+1>sub.length())
                        sub = s.substring(i-j, i+j+1);
                } else {
                    break;
                }
            }
 
            // even
            for (j=0; i-j>=0 && i+1+j<s.length(); j++) {
                if (s.charAt(i-j)==s.charAt(i+j+1)) {
                    if ((j+1)*2>sub.length())
                        sub = s.substring(i-j, i+j+2);
                } else {
                    break;
                }
            }
        }
         
        return sub;
    }
}
