package Medium;

public class JumpGame {
	public static void main(String[] args) {
		int[] A={1,1,2};
		JumpGame jg=new JumpGame();
		System.out.println(jg.canJump(A));
	}
	public boolean canJump(int[] A) {
		int end = 0;
        for (int i=0; i<A.length; i++) {
            if (i>end)
                continue;
             
            if (A[i]+i > end)
                end = A[i]+i;
             
            if (end>=A.length-1)
                return true;
        }
         
        return false;
    }
		
}
