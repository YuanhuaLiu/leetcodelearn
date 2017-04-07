package cryptography;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
/*
 * λ���ܽ����㷨����Կ����������ɣ�����ȫ��
 */
public class BitCode {
	public static char[] bitcode(char[]str,int n){
		int i;
		int len;
		char[] wen;
		
		len=str.length;
		
		if ((wen=new char[len+1])==null) {
			System.out.println("�����ڴ�ʧ�ܣ�");
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
		System.out.println("λ���ܽ����㷨��ʾ��");
		do {
			System.out.println("���������滻���ܽ����㷨�е���Կ��");
			Scanner input=new Scanner(System.in);
			n=input.next().charAt(0);
			System.out.println("���������ģ�");
			BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
			String str=bufferedReader.readLine();
			srcstr=str.toCharArray(); 
			System.out.println("���������Ϊ��");
			for ( i = 0; i <srcstr.length; i++) {
				System.out.print(srcstr[i]);
			}
			miwen=bitcode(srcstr, n);
			System.out.println();
			System.out.println("���ܺ������Ϊ��");
			for (i = 0; i <srcstr.length; i++) {
				System.out.print(miwen[i]);
			}
			miwen=bitcode(miwen, n);
			System.out.println();
			System.out.println("���ܳ�������Ϊ��");
			for (i = 0; i <srcstr.length; i++) {
				System.out.print(miwen[i]);
			}
			System.out.println("����ִ�У�y/n��");
			go=input.next();
		} while (go.equalsIgnoreCase("y"));
		System.out.println("��ʾ����");
	}
}
