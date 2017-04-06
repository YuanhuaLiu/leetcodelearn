
public class RemoveDuplicatesFromSortedArray {
	public static void main(String[] args) {
		int[] a={1,1,2,2};
		System.out.println(removeDuplicates(a));
		System.out.println(a.length);
	}
	
	public static int removeDuplicates(int[] A) {
        if (A.length<=1)
            return A.length;
             
        int i=0;
        int j=1;
        while (j<A.length) {
            if (A[j]==A[i]) {
                j++;
            }
            else {
                i++;
                A[i] = A[j];
                j++;
            }
        }
        return i+1;
    }
}
