package SchoolFinderRealQuestion;

import com.sun.javafx.image.IntPixelGetter;

/*
 * 风口的猪-中国的牛市(分治法)
 */
public class CalculateMax {
	public static void main(String[] args) {
		int []prices={3,8,5,1,7,8};
		System.out.println(calcuateMax(prices));
	}
	public static int getmax(int[]prices,int start,int end){
		int max=0;
		int min=prices[start];
		for (int i = start+1; i<=end; i++) {
			if (prices[i]-min>max) {
				max=prices[i]-min;
			}
			if (prices[i]<min) {
				min=prices[i];
			}
		}
		return max;
	}
	public static int calcuateMax(int[] prices){
		int sum=0;
		for (int i = 0; i < prices.length; i++) {
			int temp=getmax(prices, 0, i)+getmax(prices, i, prices.length-1);
			if (temp>sum) {
				sum=temp;
			}
		}
		return sum;
	}
		
}
