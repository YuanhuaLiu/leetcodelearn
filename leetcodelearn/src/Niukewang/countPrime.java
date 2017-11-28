package Niukewang;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class countPrime {
	
	public static void main(String[] args) {
		Scanner inScanner=new Scanner(System.in);
		int M=inScanner.nextInt();
		int N=inScanner.nextInt();
		List<Integer> list=new ArrayList<Integer>();
		for (int i = 2; i <999999; i++) {
			if (isPrime(i)) {
				list.add(i);
			}
		}
		int count=0;
		StringBuffer sb=new StringBuffer();
		for (int i = M-1; i < N; i++) {
			count++;
			if(count<10){
				sb.append(list.get(i)+" ");
			}else{
				sb.append(list.get(i));
				count=0;
				sb.append("\n");
			}
			
		}
		System.out.println(sb.toString().trim());
	}
	public static boolean isPrime(int a) {
		boolean flag = true;
		if (a < 2) {// 素数不小于2
			return false;
		} else {
			for (int i = 2; i <= Math.sqrt(a); i++) {
				if (a % i == 0) {// 若能被整除，则说明不是素数，返回false
					flag = false;
					break;// 跳出循环
				}
			}
		}
		return flag;
	}
}
