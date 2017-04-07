package cryptography;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * 替换加密解密算法
 */
public class Replace {
	public static char[] jiami(char[]str,int n){
		int i;
		int len;
		char[] miwen;
		
		len=str.length;
		
		if ((miwen=new char[len+1])==null) {
			System.out.println("申请内存失败！");
			System.exit(1);
		}
		for (i = 0; i < len; i++) {
			miwen[i]=(char)(str[i]+n);
		}
		miwen[len]='\0';
		return miwen;
	}
	public static char[] jiemi(char[]str,int n){
		int i;
		int len;
		char[] mingwen;
		
		len=str.length;
		
		if ((mingwen=new char[len+1])==null) {
			System.out.println("申请内存失败！");
			System.exit(1);
		}
		for (i = 0; i < len; i++) {
			mingwen[i]=(char)(str[i]-n);
		}
		mingwen[len]='\0';
		return mingwen;
		
	}
	public static void main(String[] args) throws IOException {
		int n,i;
		char []srcstr=new char[100];
		char[]miwen;
		String go;
		System.out.println("替换加密解密算法演示！");
		do {
			System.out.println("请先输入替换加密解密算法中的秘钥：");
			Scanner input=new Scanner(System.in);
			n=input.nextInt();
			System.out.println("请输入明文：");
			BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
			String str=bufferedReader.readLine();
			srcstr=str.toCharArray(); 
			System.out.println("输入的明文为：");
			for ( i = 0; i <srcstr.length; i++) {
				System.out.print(srcstr[i]);
			}
			miwen=jiami(srcstr, n);
			System.out.println();
			System.out.println("加密后的密文为：");
			for (i = 0; i <srcstr.length; i++) {
				System.out.print(miwen[i]);
			}
			miwen=jiemi(miwen, n);
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
