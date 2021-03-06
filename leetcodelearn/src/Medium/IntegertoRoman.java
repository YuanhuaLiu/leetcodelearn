package Medium;

import java.util.HashMap;
import java.util.Map;

public class IntegertoRoman {
	public static void main(String[] args) {
		IntegertoRoman integertoRoman=new IntegertoRoman();
		System.out.println(integertoRoman.intToRoman(5));
	}
	public String intToRoman(int num){
		Map<Integer,String>map = new HashMap<Integer,String>();
		map.put(1, "I");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(90, "XC");
        map.put(100, "C");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(900, "CM");
        map.put(1000, "M");
       
        int enums[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String result="";
        for (int i = 0; i < enums.length; i++) {
			int quotient = num/enums[i];
			num=num%enums[i];
			for (int j = 1; j <=quotient; j++) {
				result+=map.get(enums[i]);
			}
		}
        return result;
	}
}
