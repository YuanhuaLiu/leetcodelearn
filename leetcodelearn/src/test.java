public class test{
	/*
	 * 010101 ���������
	 */
	public static void main(String[] args) {
		System.out.println(maxsublen(101));
	}
	public static int maxsublen(int number){
		//����ͷ��0��ʱ��ת�ַ���������
		String str =Integer.toString(number);
		char []str1=str.toCharArray();
		int [] dp=new int[str.length()];	
		dp[0]=1;
	
		for (int i = 0; i < str1.length-1; i++) {
			if (str1[i+1]!=str1[i]){
				dp[i+1]=dp[i]+1;	
			}
		}
		int temp=0;
		for (int i = 0; i < dp.length; i++) {
			
			if (dp[i]>temp) {
				temp=dp[i];
			}
		}
		return temp;
	}
}
