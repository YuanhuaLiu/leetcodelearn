package Sort;

public class MergeSort {
	static final int SIZE=10;
	public static void main(String[] args) {
		int[] shuzu=new int[SIZE];
		int i;
		for (i = 0; i < SIZE; i++) {
			shuzu[i]=(int) (100+Math.random()*(100+1));
		}
		System.out.println("排序前的数组为：");
		for (i= 0; i< SIZE; i++) {
			System.out.print(shuzu[i]+" ");
		}
		System.out.println();
		mergeSort(shuzu,SIZE);
		System.out.println("排序后的数组为：");
		for (i= 0; i< SIZE; i++) {
			System.out.print(shuzu[i]+" ");
		}
	}
	public static void mergeOne(int a[],int b[],int n,int len){
		int i,j,k,s,e;
		s=0;
		while(s+len<n){                  
			e=s+2*len-1;
			if(e>n){
				e=n-1;
			}
			k=s;
			i=s;
			j=s+len;
			while(i<s+len&&j<=e){
				if(a[i]<=a[j]){
					b[k++]=a[i++];
				}else{
					b[k++]=a[j++];
				}
			}
			while(i<s+len){
				b[k++]=a[i++];
			}
			while(j<=e){
				b[k++]=a[j++];
			}
			s=e+1;
		}
		if(s<n){
			for (;s <n; s++) {
				b[s]=a[s];
			}
		}
	}
	public static void mergeSort(int a[],int n){
		int h,count,len,f;
		count=0;
		len=1;
		f=0;
		
		int[]p=new int[n];
		while(len<n){
			if(f==1){
				mergeOne(p, a, n, len);
			}else{
				mergeOne(a, p, n, len);
			}
			len=len*2;
			f=1-f;
			
			count++;
			System.out.println("第"+count+"步排序结果：");
			for (h = 0; h <SIZE; h++) {
				System.out.print(a[h]+" ");
				
			}
			System.out.println();
			if(f==1){
				for (h = 0; h < n; h++) {
					a[h]=p[h];
				}
			}
		}
	}
}
