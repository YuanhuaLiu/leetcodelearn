package easy;

public class PlusOne {
	public static void main(String[] args) {
		
	}
	public int[] plusOne(int[] digits) {
        for (int i=digits.length-1; i>=0; i--) {
             
            if (digits[i]==9) {
                digits[i]=0;
                continue;
            } else {
                digits[i] += 1;
                return digits;
            }
        }
         
        // digits[0]==0
        int[] newDigits = new int[digits.length+1];
         
        newDigits[0] = 1;
        System.arraycopy(digits, 0, newDigits, 1, digits.length);
         
        return newDigits;
    }
}
