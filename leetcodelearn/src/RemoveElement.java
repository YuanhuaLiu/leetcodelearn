
public class RemoveElement {
	public static void main(String[] args) {
		int[]a={1,2,3,4,5};
		System.out.println(removeElement(a,4));
	}
	public static int removeElement(int[] A, int elem) {
        int pos = 0;
        for (int a : A) {
            if(a!=elem){
                A[pos]=a;
                pos++;
            }
        }
         
        return pos;
    }
}
