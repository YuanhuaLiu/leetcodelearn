import java.util.ArrayList;
import java.util.List;

public class PascalTriangleII {
	public static void main(String[] args) {
		System.out.println(getRow(4));
	}
	 public static List<Integer> getRow(int rowIndex) {
	        List<Integer> list = new ArrayList<>();
	        list.add(1);
	         
	        if (rowIndex==0)
	            return list;
	         
	        for (int i=1; i<=rowIndex; i++) {
	            List<Integer> newList = new ArrayList<>();
	            newList.add(1);
	            int prev=0;
	            for (int num : list) {
	                if (prev==0){
	                    prev = num;
	                    continue;
	                }
	                newList.add(prev+num);
	                prev = num;
	            }
	            newList.add(1);
	            list = newList;
	        }
	         
	        return list;
	    }
}
