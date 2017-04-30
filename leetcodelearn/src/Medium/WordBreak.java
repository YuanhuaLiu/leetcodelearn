package Medium;

import java.util.HashSet;
import java.util.Set;

public class WordBreak {
	public static void main(String[] args) {
		String s="leetcode";
		Set<String> dict=new HashSet<String>();
		dict.add("leet");
		dict.add("code");
		WordBreak wBreak =new WordBreak();
		boolean b=wBreak.wordBreak(s, dict);
		System.out.println(b);
	}
	public boolean wordBreak(String s, Set<String> dict) {
        // boolean����mem[i]��ʾ[0,i)�Ƿ����ͨ·��0<=i<=str.length��
        boolean[] mem = new boolean[s.length()+1];
        mem[0] = true;
         
        // mem[i] = {���� mem[k] && ([k,i)��dict) ��ֻҪ��һ��Ϊtrue����Ϊtrue}������0<=k<i��
        for (int i=0; i<=s.length(); i++) {
            for (int k=0; k<i; k++) {
                String str = s.substring(k, i);
                mem[i] = mem[k] && dict.contains(str);
                 
                if (mem[i])
                    break;
            }
        }
         
        return mem[s.length()];
    }
}
