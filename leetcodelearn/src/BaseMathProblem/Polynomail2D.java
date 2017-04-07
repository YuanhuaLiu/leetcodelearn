package BaseMathProblem;

import java.text.DecimalFormat;

/*
 * 二位多项式
 * p(x,y)=∑∑a(i,j)X^i*Y^j  (i=0~m-1,j=0~n-1)
 */
public class Polynomail2D {
	static double polynomail2D(double a[][],int m,int n,double x,double y){
		int i,j;
		double result,temp,tt;
		result=0.0;
		tt=1.0;
		for ( i = 0; i < m; i++) {
			temp=a[i][n-1]*tt;
			for ( j =n-2; j>=0; j--) {
				temp=temp*y+a[i][j]*tt;
			}
			result+=temp;
			tt*=x;
		}
		return result;
	}
	public static void main(String[] args) {
		double result;
		double x,y;
		DecimalFormat df=new DecimalFormat("0.000E000");
		double a[][]={
				{1.0,2.0,3.0,4.0,5.0},
				{6.0,6.0,7.0,8.0,9.0},
				{9.0,10.0,11.0,12.0,1.0},
				{13.0,14.0,15.0,16.0,1},};
		x=0.5;
		y=-2.0;
		System.out.println("二维多项式求值");
		result=polynomail2D(a, 4, 5, x, y);
		System.out.println("p("+x+","+y+")="+df.format(result));
	}
}
