package CodingInterviewGuide_stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class search {
public static void main(String[] args) {
	
	System.out.println(search());
}
	public  static int search(){
		Scanner inScanner =new Scanner(System.in);
		int number =inScanner.nextInt();
		if (number>50) {
			return -1;
		}
		Set<Integer> set =new TreeSet<Integer>();
		while (number>0) {
			int price =inScanner.nextInt();
			set.add(price);
			number--;
		}
		List<Integer> list =new ArrayList<Integer>();
		list.addAll(set);
		if (list.size()>=3) {
			return list.get(2);
		}
		return -1;
	}
}
