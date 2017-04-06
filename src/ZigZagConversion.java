import java.util.Scanner;


public class ZigZagConversion {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		System.out.println(convert(str, 3));
	}
	
	public static String convert(String text,int nRows){
		if(nRows==1){
			return text;
		}
		int amountInUnit=nRows+nRows-2;
		int totalUnits=text.length()/amountInUnit;
		if (text.length()%amountInUnit!=0) {
			totalUnits++;
		}
		
		int rows=nRows;
		int cols=totalUnits*(nRows-1);
		char[][]map=new char[rows][cols];
		int i = 0;
        while (i < text.length()) {
            char ch = text.charAt(i);
 
            // which unit, starts from 0
            int unitNumber = i / amountInUnit;
 
            // which postion in the unit, starts from 0
            int posInUnit = i % (amountInUnit);
 
            // if it's in the first column of the unit
            int x, y;
            if (posInUnit < nRows) {
                x = posInUnit;
                y = unitNumber * (nRows - 1);
            } else {
                x = nRows - 1 - (posInUnit + 1 - nRows);
                y = nRows - x - 1 + unitNumber * (nRows - 1);
            }
            map[x][y] = ch;
             
            i++;
        } 
        // iterate and output
        StringBuilder sb = new StringBuilder();
        for (i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (map[i][j] != 0)
                    sb.append(map[i][j]);
            }
        }
        return sb.toString();
	}
}
