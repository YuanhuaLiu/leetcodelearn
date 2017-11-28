package Niukewang;


import java.util.Scanner;

public class partAB {
	public static void main(String[] args) {
		Scanner inScanner=new Scanner(System.in);
		String A=inScanner.next();
		String DA=inScanner.next();
		String B=inScanner.next();
		String DB=inScanner.next();
		int PA=Integer.valueOf(findPart(A, DA));
		int PB=Integer.valueOf(findPart(B, DB));
		System.out.println(PA+PB);
		
	}
	public static String findPart(String A,String DA){
		StringBuffer sb=new StringBuffer();
		char[]Achas=A.toCharArray();
		char[]DAchas=DA.toCharArray();
		for (int i = 0; i < Achas.length; i++) {
			if (Achas[i]==DAchas[0]) {
				sb.append(String.valueOf(DAchas[0]));
			}
		}
		if (sb.toString().equals("")) {
			return "0";
		}
		return sb.toString();
	}
}
