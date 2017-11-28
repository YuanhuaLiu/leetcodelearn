package Niukewang;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class staticsticSingleDigits {
	public static void main(String[] args){  
        Scanner in = new Scanner(System.in);  
        while (in.hasNext()) {
            String number = in.next();
            System.out.println(staticstic(number));
        }  
        
    }
	public static String staticstic(String number){
		char[]chas=number.toCharArray();
		Set<Character> set=new TreeSet<Character>();
		for (int i = 0; i < chas.length; i++) {
			set.add(chas[i]);
		}
		Map<Character,Integer>map=new HashMap<Character,Integer>();
		for (Character cha:set) {
			int count=0;
			for (int i = 0; i < chas.length; i++) {
				if (cha==chas[i]) {
					count++;
				}
			}
			map.put(cha,count);
		}
		StringBuffer sb=new StringBuffer();
		for (Character i:map.keySet()) {
			sb.append(i+":"+map.get(i)+"\n"+"\n"+"\n");
		}
		return sb.toString().trim();
	}
}
