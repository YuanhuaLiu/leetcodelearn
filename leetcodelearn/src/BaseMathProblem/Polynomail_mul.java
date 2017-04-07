package BaseMathProblem;

import java.text.DecimalFormat;

/*
 * 多项式乘法
 */
public class Polynomail_mul {
	public static void main(String[]args){
		int i;
		double A[]={-4.0,5.0,2.0,-1.0,3.0,2.0};
		double B[]={-3.0,-2.0,1.0,3.0};
		double[] R=new double[9];
		DecimalFormat df=new DecimalFormat("0.0000000E00");
		polynomail_mul(A, 6, B, 4, R, 9);
		System.out.println("多项式A(x)和B(x)乘积的各项系数如下：");
		for ( i = 0; i < 9; i++) {
			System.out.println("R("+i+")="+df.format(R[i]));
		}
	}
	static void polynomail_mul(double A[],int m,double B[],int n,double R[],int k){
		int i,j;
		for ( i = 0; i <k; i++) {
			R[i]=0.0;
		}
		for ( i = 0; i <m; i++) {
			for ( j = 0; j <n; j++) {
				R[i+j]+=A[i]*B[j];
			}
		}
	}
	
}
