package CodingInterviewGuide_RecursiveAndDynamicprograming;
//��Ŀ����������arr,arr�����е�ֵ��Ϊ������ÿ��ֵ������һ��Ǯ����ֵ���ٸ���һ������aim����Ҫ�ҵ�Ǯ���������aim����С��������
//dp[i][j]���壺�ڿ�������ʹ��arr[0..i]���ҵ�����£����j����Ҫ����С����

public class minCoins1 {
		public int minCoins(int[] arr,int aim){
			if(arr==null||arr.length==0||aim<0){
				return -1;
			}
			int n=arr.length;
			int max=Integer.MAX_VALUE;
			int[][]dp=new int[n][aim+1];
			for (int j = 0; j <=aim; j++) {
				dp[0][j]=max;
			}
			return 0;
		}
}
