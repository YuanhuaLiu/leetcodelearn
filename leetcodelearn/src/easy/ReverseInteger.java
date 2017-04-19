package easy;

public class ReverseInteger {
	public static void main(String[] args) {
		int number=1232;
		System.out.println(reverse(number));
	}
	public static  int reverse(int x) {
        int sign = 1;
        if(x<0){
            sign = -1;
            x = -x;
        }
         
        int reversed = 0;
        for (; x>0; x /= 10){
            reversed = reversed*10 + x%10;
        }
         
        return reversed*sign;
    }
}
