package CodingInterviewGuide_RecursiveAndDynamicprograming;
//题目：给定数组arr,arr中所有的值都为正数，每个值仅代表一张钱的面值，再给定一个整数aim代表要找的钱数，求组成aim的最小货币数。
//dp[i][j]涵义：在可以任意使用arr[0..i]货币的情况下，组成j所需要的最小张数

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
