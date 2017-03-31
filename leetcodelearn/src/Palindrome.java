import java.util.Scanner;

/*
 * 判断是不是回文数
 */
public class Palindrome {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int number=in.nextInt();
		System.out.println(isPalindRome(number));
	}
	
	public static boolean isPalindRome(int x){
		if(x<0){
			return false;
		}
		int quoient=x;
		int digits=0;
		while(quoient!=0){
			quoient/=10;
			digits++;
		}
		for (int i = 0; i <digits; i++) {
			int high=digits-i+1;
			int low=i;
			if (getDigit(x,high)!=getDigit(x,low)) {
				return false;
			}
		}
		return true;
	}

	private static int getDigit(int x, int i) {
		if(i==1){
			return x%10;
		}
		return (int) ((x/Math.pow(10, i-1))%10);
		
	}
}
