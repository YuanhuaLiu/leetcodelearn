package BaseMathProblem;
/*
 * ����[0,1]֮��������
 */
public class Random01 {
	/*public static void main(String[] args) {
		int i;
		double []r={5.0};
		System.out.println("����10��[0,1]֮����������");
		for ( i = 0; i <10; i++) {
			System.out.println(rand01(r));
		}
	}*/
	public static void main(String[] args) {
		int i;
		double m,n;
		double []r={5.0};
		m=10.0;
		n=20.0;
		System.out.println("����10��[10(m),20(n)]֮����������");
		
		for ( i = 0; i <10; i++) {
			System.out.println(m+(n-m)*rand01(r));
		}
	}
	static double rand01(double[] r){
		double base,u,v,p,temp1,temp2,temp3;
		base=256.0;//����
		u=17.0;
		v=139.0;
		temp1=u*(r[0])+v; //������ֵ
		temp2=(int)(temp1/base); //������
		temp3=temp1-temp2*base;//��������
		
		r[0]=temp3;         //����������ӣ�Ϊ��һ��ʹ��
		p=r[0]/base;
		return p;
	}
}
