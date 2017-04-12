import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class test {
	public static void main(String[] args) {
		int n=5;
		int m=4;
		int[]price={2,8,10,7,3};
		System.out.println(paimai(n,m,price));
	}
	public static int paimai(int n,int m,int []price){
		Set<Integer> set = new TreeSet<Integer>();
		int sum=0;
		for (int i = 0; i < price.length; i++) {
			set.add(price[i]);
			sum+=price[i];
		}
		int setsize=set.size();
		int avg=sum/m;
		set.add(avg);
		int setsize1=set.size();
		if (setsize==setsize1) {
			return avg;
		}else{
			int count=0;
			List<Integer> list =new ArrayList<Integer>();
			for (Integer s : set) {  
			     if (s>avg) {
					count++;
					list.add(s);
				}  
			}  
			if (count<=n) {
				
				return list.get(0);
			}else{
				return 0;
			}
		}
		
	}
}
 