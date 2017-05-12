package Medium;

import java.util.HashMap;
import java.util.Map;



public class TwoSum {
	public int[]twoSum(int[]numbers,int target){
		Map<Integer, Integer> map=new HashMap<Integer,Integer>();
		for (int i = 0; i < numbers.length; i++) {
			map.put(numbers[i], i);
		}
		for (int i = 0; i < numbers.length; i++) {
			int dif = target-numbers[i];
			Integer index = map.get(dif);
			if (index!=null&&i!=index) {
				if (index>i) {
					return new int[]{i+1,index+1};
				}else{
					return new int[]{index+1,i+1};
				}
			}
		}
		return null;
	}
}
