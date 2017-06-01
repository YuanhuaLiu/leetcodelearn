package CodingInterviewGuide_stack;


public class Find {
	public static void main(String[] args) {
		int[][]array={{1,2,8,9},
						{2,4,9,12},
						{4,7,10,13},
						{6,8,11,15}};
		Find find=new Find();
		System.out.println(find.FindNumber(1, array));
	}
	public boolean FindNumber(int target,int [][]array){
		
		for (int i= array.length-1; i >=0; i--) {
			for (int j= array[0].length-1; j >=0; j--) {
				if (i>=0&&j>=0) {
				if (array[i][j]==target) {
					return true;
				}else if (array[i][j]<target) {
					continue;
				}
				}
			}
			
		}
		return false;
	}
}
