package Medium;

public class FindMinInRotatedSortedArray {
	public static void main(String[] args) {
		
	}
	public int  FindMin(int[]num){
		if (num.length==0)
            return num[0];
             
        int left=0;
        int right=num.length-1;
        int min = Integer.MAX_VALUE;
         
        while (left<right) {
            int mid = (left+right)/2;
            if (left==mid)
                break;
                 
            // 3 4 5 6 2, left part is equal or ascending, so for this part num[left] is the smallest
            if(num[left]<=num[mid]) {
                if (num[left]<min)
                    min = num[left];
                left= mid+1;
            }
            // 5 6 1 2 3, both min and max value are in left part
            else {
                if (num[mid]<min)
                    min = num[mid];
                right = mid-1;
            }
        }
         
        if (num[right]<min)
            min = num[right];
        if (num[left]<min)
            min = num[left];
             
        return min;
	}
}
