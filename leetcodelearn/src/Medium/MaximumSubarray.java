package Medium;

public class MaximumSubarray {
	
	public static void main(String[] args) {
		int[]a={-2,1,-3,4,-1,2,1,-5,4};
		MaximumSubarray ms = new MaximumSubarray();
		System.out.println(ms.maxSubArray(a));
	}
	public int maxSubArray(int []A){
		int max=Integer.MIN_VALUE;
		int sum=0;
		for (int i : A) {
			sum+=i;
			if (sum>max) {
				max=sum;
			}
			if (sum<0) {
				sum=0;
			}
		}
		return max;
	}
}
