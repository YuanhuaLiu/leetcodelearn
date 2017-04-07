package cryptography;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
/*
 * 位加密解密算法（密钥可以随机生成，更安全）
 */
public class BitCode {
	public static char[] bitcode(char[]str,int n){
		int i;
		int len;
		char[] wen;
		
		len=str.length;
		
		if ((wen=new char[len+1])==null) {
			System.out.println("申请内存失败！");
			System.exit(1);
		}
		for (i = 0; i < len; i++) {
			wen[i]=(char)(str[i]^n);
		}
		wen[len]='\0';
		return wen;
	}
	
	public static void main(String[] args) throws IOException {
		int n,i;
		char []srcstr=new char[100];
		char[]miwen;
		String go;
		System.out.println("位加密解密算法演示！");
		do {
			System.out.println("请先输入替换加密解密算法中的秘钥：");
			Scanner input=new Scanner(System.in);
			n=input.next().charAt(0);
			System.out.println("请输入明文：");
			BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
			String str=bufferedReader.readLine();
			srcstr=str.toCharArray(); 
			System.out.println("输入的明文为：");
			for ( i = 0; i <srcstr.length; i++) {
				System.out.print(srcstr[i]);
			}
			miwen=bitcode(srcstr, n);
			System.out.println();
			System.out.println("加密后的密文为：");
			for (i = 0; i <srcstr.length; i++) {
				System.out.print(miwen[i]);
			}
			miwen=bitcode(miwen, n);
			System.out.println();
			System.out.println("解密出的明文为：");
			for (i = 0; i <srcstr.length; i++) {
				System.out.print(miwen[i]);
			}
			System.out.println("继续执行（y/n）");
			go=input.next();
		} while (go.equalsIgnoreCase("y"));
		System.out.println("演示结束");
	}
}
