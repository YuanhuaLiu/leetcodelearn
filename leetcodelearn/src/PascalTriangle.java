import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
	public static void main(String[] args) {
		System.out.println(generate(4));
		
	}
	public static List<List<Integer>> generate(int numRows) {
        // 0
        List<List<Integer>> list = new ArrayList<>();
        if (numRows==0)
            return list;
         
        // 1
        List<Integer> first = new ArrayList<>();
        first.add(1);
        list.add(first);
        if (numRows==1)
            return list;
         
        // >1
        for (int i=2; i<=numRows; i++) {
            List<Integer> latest = list.get(list.size()-1);
            List<Integer> item = new ArrayList<>();
            item.add(1);
            int prev = 0;
            for (int num : latest) {
                if (prev==0) {
                    prev = num;
                    continue;
                }
                 
                item.add(prev + num);
                prev = num;
            }
            item.add(1);
            list.add(item);
        }
        return list;
    }
}
