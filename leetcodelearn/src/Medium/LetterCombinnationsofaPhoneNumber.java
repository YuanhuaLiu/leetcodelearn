package Medium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LetterCombinnationsofaPhoneNumber {
	public static void main(String[] args) {
		LetterCombinnationsofaPhoneNumber letterCombinnationsofaPhoneNumber=new LetterCombinnationsofaPhoneNumber();
		List<String> list =letterCombinnationsofaPhoneNumber.lettercombin("23");
		for (String string : list) {
			System.out.println(string);
		}
		
	}
	public List<String> lettercombin(String digits){
		List<char[]> list = new ArrayList<char[]>();
        list.add(new char[]{' '});
        list.add(new char[]{});
        list.add(new char[]{'a','b','c'});
        list.add(new char[]{'d','e','f'});
        list.add(new char[]{'g','h','i'});
        list.add(new char[]{'j','k','l'});
        list.add(new char[]{'m','n','o'});
        list.add(new char[]{'p','q','r','s'});
        list.add(new char[]{'t','u','v'});
        list.add(new char[]{'w','x','y','z'});
         
        List<String> ret = new ArrayList<String>();
        ret.add("");
 
        return build(ret, list, digits, 0);
	}
	private List<String> build(List<String> ret, List<char[]> list, String digits, int pos) {
		if (pos==digits.length()) {
			return ret;
		}
		int num=digits.charAt(pos)-'0';
		char[]chs=list.get(num);
		if (chs.length==0) {
			return ret;
		}
		List<String> newRet = new ArrayList<String>();
		for (char c : chs) {
			for (String str : ret) {
				newRet.add(str+c);
			}
		}
		return build(newRet, list, digits, pos+1);
	}
}
