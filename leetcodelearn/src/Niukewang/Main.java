package Niukewang;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner inScanner=new Scanner(System.in);
		int count=inScanner.nextInt();
		
		for (int i=1;i<=count;i++){
			BigInteger A=inScanner.nextBigInteger();
			BigInteger B=inScanner.nextBigInteger();
			BigInteger C=inScanner.nextBigInteger();
			if (A.add(B).compareTo(C)==1){
				System.out.println("Case #"+(i+1)+": true");
			}else{
				System.out.println("Case #"+(i+1)+": false");
			}
		}
	}
}
