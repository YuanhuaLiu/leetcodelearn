package cryptography;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * �滻���ܽ����㷨
 */
public class Replace {
	public static char[] jiami(char[]str,int n){
		int i;
		int len;
		char[] miwen;
		
		len=str.length;
		
		if ((miwen=new char[len+1])==null) {
			System.out.println("�����ڴ�ʧ�ܣ�");
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
			System.out.println("�����ڴ�ʧ�ܣ�");
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
		System.out.println("�滻���ܽ����㷨��ʾ��");
		do {
			System.out.println("���������滻���ܽ����㷨�е���Կ��");
			Scanner input=new Scanner(System.in);
			n=input.nextInt();
			System.out.println("���������ģ�");
			BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
			String str=bufferedReader.readLine();
			srcstr=str.toCharArray(); 
			System.out.println("���������Ϊ��");
			for ( i = 0; i <srcstr.length; i++) {
				System.out.print(srcstr[i]);
			}
			miwen=jiami(srcstr, n);
			System.out.println();
			System.out.println("���ܺ������Ϊ��");
			for (i = 0; i <srcstr.length; i++) {
				System.out.print(miwen[i]);
			}
			miwen=jiemi(miwen, n);
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
