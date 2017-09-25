package SchoolFinderRealQuestion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;



public class HighScores {
	public static void main(String[] args) {
		Scanner inScanner=new Scanner(System.in);
		Map<Integer,Integer> student=new HashMap<Integer,Integer>();
		List<Integer> maxnumber=new ArrayList<Integer>();
		while (inScanner.hasNext()) {
			int N=inScanner.nextInt();
			int M=inScanner.nextInt();
			for(int i=1; inScanner.hasNext() && i<=N; i++){
			int score=inScanner.nextInt();
			student.put(i, score);
			}
			String C=null;
			int A=0;
			int B=0;
			for(int i=0;inScanner.hasNext()&&i<M;i++){
				 C=inScanner.next();
				 A=inScanner.nextInt();
				 B=inScanner.nextInt();
				 
				 if (C.equals("Q")) {
						maxnumber.add(maxnumber(student, A,B));
					}else if (C.equals("U")) {
						update(student, A, B);
					}else {
						System.out.println("ÊäÈë´íÎó");
					}
			}
		
			for (Integer mnum : maxnumber) {
				System.out.println(mnum);
			}
	}
	}
	public static int maxnumber(Map <Integer,Integer> map,int A,int B){
	
		List<Integer> list =new ArrayList<Integer>();
		for (int i = A; i <=B; i++) {
			list.add(map.get(i));
		}
		java.util.Collections.sort(list);
		return list.get(list.size()-1);
	}
	public static void update (Map <Integer,Integer> map,int A,int B){
		map.put(A, B);
	}
}
