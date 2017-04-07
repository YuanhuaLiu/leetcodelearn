package BaseMathProblem;

import java.text.DecimalFormat;
/*
 * 一维多项式
 * p(x)=(...((a(n-1)+a(n-2))x+a(n-3))x+....a1)x+a0;
 */
public class PolynomialD {
	public static void main(String[] args) {
		int i;
		double a[]={-15.0,-7.0,7.0,2.0,-3.0,7.0,3.0};
		double[] x={-2.0,-0.5,1.0,2.0,3.7,4.0};
		double result;
		DecimalFormat df=new DecimalFormat("0.0000000E000");
		DecimalFormat df1=new DecimalFormat("0.00");
		System.out.println();
		for (i = 0; i < 6; i++) {
			result=polynomialD(a, 7, x[i]);
			System.out.println("x="+df1.format(x[i])+"时，p(x)="+df.format(result));
		}
	}
	public static double polynomialD(double a[],int n,double x){
		int i;
		double result;
		result=a[n-1];
		for (i =n-2; i>=0 ; i--) {
			result=result*x+a[i];
		}
		return result;
	}
}
