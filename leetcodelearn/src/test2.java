
public class test2 {
	public static void main(String[] args) {
		int n=4;
		int b[]={50,50,50,50};
		System.out.println(test2(n, b));
	}
	public static double test2(int n,int b[]){
		int right=(int) Math.ceil(n*0.6);
		double bx=1;
		for (int i = 0; i < b.length; i++) {
			bx=bx*((double)b[i]/100);
		}
		
		return (factorial(n)/factorial(right)+1)*bx;
	}
	
	public static int factorial(int num){
		if (num<=1) {
			return 1;
		}else{
			return num*factorial(num-1);
		}
	}
}
