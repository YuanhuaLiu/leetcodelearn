
public class MergeLink {
	 public ListNode Merge(ListNode list1,ListNode list2) {  
	       if(list1==null)return list2; //�жϵ�ĳ������Ϊ�վͷ�����һ�����������������Ϊ���أ�û��ϵ����ʱ����㷵���ĸ�������Ҳ�ǿյ���?  
	       if(list2==null)return list1;  
	       ListNode list0=null;//����һ��������Ϊ����ֵ  
	        if(list1.val<list2.val){//�жϴ�ʱ��ֵ�����list1�Ƚ�С�����Ȱ�list1��ֵ��list0����֮��Ȼ  
	           list0=list1;  
	           list0.next=Merge(list1.next, list2);//���ݹ飬���������һ����ֵ  
	           }  
	           else{  
	           list0=list2;  
	           list0.next=Merge(list1, list2.next);  
	           }  
	 return list0;  
	    }  
}
