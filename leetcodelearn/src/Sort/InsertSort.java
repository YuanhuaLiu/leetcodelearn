package Sort;

public class InsertSort {
	static final int SIZE=10;
	public static void main(String[] args) {
		int[] shuzu=new int[SIZE];
		int i;
		for (i = 0; i < SIZE; i++) {
			shuzu[i]=(int) (100+Math.random()*(100+1));
		}
		System.out.println("����ǰ������Ϊ��");
		for (i= 0; i< SIZE; i++) {
			System.out.print(shuzu[i]+" ");
		}
		System.out.println();
		insertSort(shuzu);
		System.out.println("����������Ϊ��");
		for (i= 0; i< SIZE; i++) {
			System.out.print(shuzu[i]+" ");
		}
	}
	public static void insertSort(int[] a) {
		int i,j,t,h;
		for ( i = 1; i < a.length; i++) {
			t=a[i];
			j=i-1;
			while(j>=0&&t<a[j]){
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=t;
			System.out.println("��"+i+"��������");
			for ( h = 0; h < a.length; h++) {
				System.out.print(a[h]+" ");
			}
			System.out.println();
		}
		
	}
}
