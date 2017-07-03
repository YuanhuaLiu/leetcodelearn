package CodingInterviewGuide_String;
/*
 * 判断两个字符串是否互为变形词
 */
public class isDeformation {
	public static void main(String[] args) {
		String str1="123";
		String str2="123";
		System.out.println(isDeformation(str1,str2));
	}
	
	public static boolean isDeformation(String str1,String str2){
		if (str1==null||str2==null||str1.length()!=str2.length()) {
			return false;
		}
		char[] chas1=str1.toCharArray();
		char[] chas2=str2.toCharArray();
		int[]map =new int[256];
		for (int i = 0; i < chas1.length; i++) {
			map[chas1[i]]++;
		}
		for (int i = 0; i < chas2.length; i++) {
			if (map[chas2[i]]--==0) {
				return false;
			}
			
		}
		
		return true;
	}
}
