
public class MergeArray {
	public static void merge2SortedArray(int[] a , int[] b , int[] c){  
		//a����ĵ�ǰ����  
		int i = 0;  
		//b����ĵ�ǰ����  
		int j = 0;  
		//c����ĵ�ǰ����  
		int k = 0;  
		//ѭ����ֻҪa��b��û�б������һֱѭ��  
		while(i < a.length && j < b.length){  
		//�����ǰa[i]��b[j]С���Ͱ�c[k]Ԫ����Ϊa[i],ͬʱk++,i++  
		if(a[i] < b[j]){  
		c[k++] = a[i++];  
		//����,�����ǰa[i]��b[j]�󣬾Ͱ�c[k]Ԫ����Ϊb[j],ͬʱk++,j++  
		}else{  
		c[k++] = b[j++];  
		}  
		}  
		  
		//�ϸ�ѭ���ܹ�������˵��a�Ѿ�ѭ�����b�Ѿ�ѭ����  
		//��������ѭ��ֻ����һ������ѭ������  
		//ֻҪaû��ѭ���꣬�Ͱ�a��ʣ�µ�Ԫ�����η���c��  
		while(i < a.length){  
		c[k++] = a[i++];  
		}  
		//ֻҪbû��ѭ���꣬�Ͱ�b��ʣ�µ�Ԫ�����η���c��  
		while(j < b.length){  
		c[k++] = b[j++];  
		}  
		}  
		//���Գ���  
		public static void main(String[] args) {  
		//���ϲ�����a  
		int[] a = new int[]{1,3,5,7,9};  
		//���ϲ�����b  
		int[] b = new int[]{2,4,6,8};  
		//c������źϲ�֮�������  
		int[] c = new int[a.length+b.length];  
		merge2SortedArray(a, b, c);  
		for(int i = 0;i < c.length;i++){  
		System.out.print(c[i]);  
		}  
		}  
}
