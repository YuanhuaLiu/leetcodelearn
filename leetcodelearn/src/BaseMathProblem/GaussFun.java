package BaseMathProblem;

/*
 * 高斯消元法
 */
public class GaussFun {
	static final int MaxNum = 10;
	static int array[][] = {{3,5,-4,0},
							{7,2,6,-4},
							{4,-1,5,-5}};
	static int[] unuse_result = new int[MaxNum];
	public static void main(String[] args) {
		int i,type;
		int equnum,varnum;
		int[]result=new int[MaxNum];
		equnum=3;
		varnum=3;
		type=GaussFun(equnum,varnum,result);
		if (type==-1) {
			System.out.println("该方程无解");
		}else if (type==-2) {
			System.out.println("该方程有浮点数解，无整数解");
		}else if (type>0) {
			System.out.println("该方程有无穷多解");
			
		}else {
			System.out.println("该方程的解：");
			for ( i = 0; i <varnum; i++) {
				System.out.println("x="+(i+1)+result[i]);
			}
		}
	}
	public static int GaussFun(int equ, int var, int result[]) {
		int i, j, k, col, num1, num2;
		int max_r, ta, tb, gcbtemp, lcmtemp;
		int temp, unuse_x_num, unuse_index = 0;
		col = 0;

		for (k = 0; k < equ && col < var; k++, col++) 
		{
			max_r = k;
			for (i = k + 1; i < equ; i++) {
				if (Math.abs(array[i][col]) > Math.abs(array[max_r][col])) 
				{
					max_r = i;
				}
			}
			if (max_r != k) {
				for (j = k; j < var + 1; j++) 
				{
					temp = array[k][j];
					array[k][j] = array[max_r][j];
					array[max_r][j] = temp;
				}
			}
			if (array[k][col] == 0) 
			{
				k--;
				continue;
			}
			for (i = k + 1; i < equ; i++) 
			{
				if (array[i][col] != 0) 
				{
					num1 = Math.abs(array[i][col]);
					num2 = Math.abs(array[k][col]);
					while (num2 != 0) 
					{
						temp = num2;
						num2 = num1 % num2;
						num1 = temp;
					}
					gcbtemp = num1;
					lcmtemp = (Math.abs(array[i][col]) * Math.abs(array[k][col])) / gcbtemp;

					ta = lcmtemp / Math.abs(array[i][col]);
					tb = lcmtemp / Math.abs(array[k][col]);
					if (array[i][col] * array[k][col] < 0) 
					{
						tb = -tb;
					}
					for (j = col; j < var + 1; j++) 
					{
						array[i][j] = array[i][j] * ta - array[k][j] * tb;
					}
				}
			}
		}
			for (i = k; i < equ; i++) 
			{
				if (array[i][col] != 0) 
				{
					return -1;
				}
			}
			if (k < var) {
				for (i = k - 1; i >= 0; i--) {
					unuse_x_num = 0;
					for (j = 0; j < var; j++) {
						if (array[i][j] != 0 && unuse_result[j] != 0) {
							unuse_x_num++;
							unuse_index = j;
						}
					}
					if (unuse_x_num > 1) {
						continue;
					}
					temp = array[i][var];
					for (j = 0; j < var; j++) {
						if (array[i][j] != 0 && j != unuse_index) {
							temp -= array[i][j] * result[j];
						}
					}
					result[unuse_index] = temp / array[i][unuse_index];
					unuse_result[unuse_index] = 0;
				}
				return var - k;
			}
			
			for (i = var - 1; i >= 0; i--) {
				temp = array[i][var];
				for (j = i + 1; j < var; j++) {
					if (array[i][j] != 0) {
						temp -= array[i][j] * result[j];
					}
				}
				if (temp % array[i][j] != 0) {
					return -2;
				}
				result[i] = temp / array[i][i];
			}
			return 0;
	}

}