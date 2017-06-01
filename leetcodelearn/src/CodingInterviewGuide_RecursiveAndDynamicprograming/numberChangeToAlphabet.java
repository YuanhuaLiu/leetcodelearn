package CodingInterviewGuide_RecursiveAndDynamicprograming;
/*
 * 数字字符串转换为字母组合的种数(暴力递归)
 */
public class numberChangeToAlphabet {
	public static void main(String[] args) {
		numberChangeToAlphabet ncta= new numberChangeToAlphabet();
		int i=ncta.num1("1111");
		System.out.println(i);
	}
	public int num1(String str){
		if (str==null||str.equals("")) {
			return 0;
		}
		char[] chs =str.toCharArray();
		return process(chs,0);
	}

	public int process(char[] chs, int i) {
		if (i==chs.length) {
			return 1;
		}
		if (chs[i]=='0') {
			return 0;
		}
		
		int res=process(chs, i+1);
		if (i+1<chs.length&&(chs[i]-'0')*10+chs[i+1]-'0'<27) {
			res+=process(chs, i+2);
		}
		return res;
	}
}
