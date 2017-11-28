package Niukewang;

import java.math.BigInteger;
import java.util.Scanner;

public class subAB {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);  
		while (in.hasNext()) {
            String a = in.next();
            String b = in.next();
            BigInteger A=new BigInteger(a);
            BigInteger B=new BigInteger(b);
            BigInteger Q=A.divide(B);
            BigInteger R=A.subtract(Q.multiply(B));
            System.out.println(Q+" "+R);
            
        }  
	}
}
