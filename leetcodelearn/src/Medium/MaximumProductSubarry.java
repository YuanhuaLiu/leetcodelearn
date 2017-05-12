package Medium;
/*
 * 两个比较大的负数相乘，可以成为最大值
 */
public class MaximumProductSubarry {
	public int maxProduct(int[] A){
		 int max = Integer.MIN_VALUE;
	        int negative = 1;
	        int positive = 1;
	         
	        for (int a : A) {
	            int n1 = negative*a;
	            int n2 = positive*a;
	            int n3 = a;
	             
	            positive = Math.max(n1, n2);
	            positive = Math.max(positive, n3);
	             
	            negative = Math.min(n1, n2);
	            negative = Math.min(negative, n3);
	             
	            max = Math.max(max, positive);
	        }
	         
	        return max;
	}
}
