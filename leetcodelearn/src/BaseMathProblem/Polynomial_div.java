package BaseMathProblem;

import java.text.DecimalFormat;
/*
 * 多项式除法
 */
public class Polynomial_div {
	public static void main(String[] args) {
		int i;
		double A[]={-3.0,6.0,-3.0,4.0,2.0};
		double B[]={-1.0,+1.0,1.0};
		double []R=new double[3];
		double []L=new double[2];
		DecimalFormat df=new DecimalFormat("0.00E000");
		System.out.println("计算A(x)/B(x)的商多项式和余多形式：");
		polynomial_div(A, 5, B, 3, R, 3, L, 2);
		for (i = 0; i <=2; i++) {
			System.out.println("商多项式系数R(+"+i+")="+df.format(R[i]));
		}
		for (i = 0; i <=1; i++) {
			System.out.println("余多项式系数L(+"+i+")="+df.format(L[i]));
		}
	}
	static void polynomial_div(double A[],int m,double B[],int n,double R[],int k,double L[],int l){
		int i,j,mm,ll;
		for ( i = 0; i <k; i++) {
			R[i]=0.0;
		}
		ll=m-l;
		for (i = k; i >0; i--) {
			R[i-l]=A[ll]/B[n-l];
			mm=ll;
			for (j = l; j <= n-l; j++) {
				A[mm-l]-=R[i-l]*B[n-j-l];
				mm-=l;
			}
			ll-=l;
		}
		for ( i = 0; i <l; i++) {
			L[i]=A[i];
		}
	}
	
}
