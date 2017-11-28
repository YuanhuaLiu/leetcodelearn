package Niukewang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;



public class digitalBlackHole {
	public static void main(String[] args){  
        Scanner in = new Scanner(System.in);  
        while (in.hasNext()) {
            String number = in.next(); 
            kaprekar(number);
        }  
        
    }  
	public static String kaprekar(String number){
		List<Character> list=new ArrayList<Character>();
		char[]chas=number.toCharArray();
		for (int i = 0; i < chas.length; i++) {
			list.add(chas[i]);
		}
		int a=4-list.size();
		if (list.size()<4) {
			for (int i = 0; i < a; i++) {
				list.add('0');
			}
		}
		Collections.sort(list);
		StringBuffer sb =new StringBuffer();
		for (int i = 0; i < list.size(); i++) {
			sb.append(list.get(i));
		}
		int subnumber=Integer.valueOf(sb.reverse().toString())-Integer.valueOf(sb.reverse().toString());
		if (subnumber==0) {
			System.out.println(sb.reverse().toString()+" - "+sb.reverse().toString()+" = 0000");
			return "";
		}
		if (subnumber==6174) {
			System.out.println(sb.reverse().toString()+" - "+sb.reverse().toString()+" = "+subnumber);
			return "";
		}else{
			System.out.println(sb.reverse().toString()+" - "+sb.reverse().toString()+" = "+subnumber);
			return kaprekar(String.valueOf(subnumber));
		}
	}
}
