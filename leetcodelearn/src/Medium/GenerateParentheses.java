package Medium;


import java.util.ArrayList;
import java.util.List;
/*
 * 
    д���������Ŵ�������С��n���ǾͿ���д�����ţ�
    д���������Ŵ�������С��n������ҲС�������Ŵ������ǾͿ���д�����š�
 */

public class GenerateParentheses {
	public static void main(String[] args) {
		GenerateParentheses gParentheses=new GenerateParentheses();
		List<String> list=gParentheses.generateParenthesis(3);
		for (String string : list) {
			System.out.println(string);
		}
	}
	 public List<String> generateParenthesis(int n) {
	        List<String> list = new ArrayList<>();
	        append(n, 0, 0, "", list);
	        return list;
	    }
	     
	    private void append(int n, int left, int right, String s, List<String> list) {
	        if (left==n && right==n) {
	            list.add(s);
	            return;
	        }
	         
	        if (left<n) {
	            append(n, left+1, right, s+'(', list);
	        }
	         
	        if (right<n && left>right) {
	            append(n, left, right+1, s+')', list);
	        }
	    }
}
