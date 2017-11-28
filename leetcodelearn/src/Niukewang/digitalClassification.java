package Niukewang;


import java.math.BigDecimal;
import java.util.Scanner;
import java.util.TreeSet;

public class digitalClassification {
	public static void main(String[] args) {
		Scanner inScanner=new Scanner(System.in);
		int count=inScanner.nextInt();
		int []digital =new int[count];
		for (int i = 0; i < count; i++) {
			digital[i]=inScanner.nextInt();
		}
		int A1=A1(digital);
		int A2=A2(digital);
		int A3=A3(digital);
		float A4=A4(digital);
		int A5=A5(digital);
		System.out.print(A1!=0?A1+" ":"N"+" ");
		System.out.print(A2!=0?A2+" ":"N"+" ");
		System.out.print(A3!=0?A3+" ":"N"+" ");
		System.out.print(A4!=0?A4+" ":"N"+" ");
		System.out.print(A5!=0?A5:"N");
		
	}
	//A1:能被5整除的数字中所有偶数的和
	public static int A1(int [] a){
		int count=0;
		for (int i = 0; i < a.length; i++) {
			if (a[i]%5==0&a[i]%2==0) {
				count+=a[i];
			}
		}
		
		return count;
	}
	//A2:将5除后余1的数字按给出顺序进行交错求和，即计算n1-n2+n3-n4..
		public static int A2(int [] a){
			int count=0;
			boolean flag=true;
			for (int i = 0; i < a.length; i++) {
				if (a[i]%5==1) {
					if(flag==true){
						count+=a[i];
						flag=false;
					}else{
						count-=a[i];
						flag=true;
					}
					
				}
			}
			return count;
		}
		//A3:被5除后余2的数字的个数
		public static int A3(int [] a){
			int count=0;
			for (int i = 0; i < a.length; i++) {
				if (a[i]%5==2) {
					count++;
				}
			}
			return count;
		}
		//A4:被5除后余3的数字的平均数,精确到小数点后1位
		public static float A4(int [] a){
			float sum=0;
			int count=0;
			for (int i = 0; i < a.length; i++) {
				if (a[i]%5==3) {
					sum+=a[i];
					count++;
				}
			}
			if(count!=0){
				float avg=sum/count;
				BigDecimal b=new BigDecimal(avg);
				float avg1=b.setScale(1, BigDecimal.ROUND_HALF_UP).floatValue();
				return avg1;
			}else{
				return 0;
			}
			
		}
		//A5:被5除后余4的数字中最大的数字
		public static int A5(int [] a){
			TreeSet<Integer> set = new TreeSet<Integer>();
			
			for (int i = 0; i < a.length; i++) {
				if (a[i]%5==4) {
					set.add(a[i]);
				}
			}
			if(set.isEmpty()){
				return 0;
			}
			return set.last();
		}
}
