package Medium;

public class GasStation {
	public static void main(String[] args) {
		
	}
	public int canCompleteCircuit(int[]gas,int []cost){
		for (int start = 0; start < gas.length; start++) {
			int g=0;
			int i=start;
			boolean flag=false;
			do {
				if (flag&&i==start) {
					return start;
				}
				flag=true;
				g+=gas[i];
				g-=cost[i];
				if (i==gas.length-1) {
					i=0;
				}else{
					i++;
				}
				
				
			} while (g>0);
		}
		
		return -1;
	}
}
