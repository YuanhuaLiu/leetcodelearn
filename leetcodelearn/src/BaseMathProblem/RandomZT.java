package BaseMathProblem;


/*
 * ��̬�ֲ�������������㷨
 */
public class RandomZT {
	public static void main(String[] args) {
		int i;
		double u,t;
		double [] r={5};
		u=2.0;
		t=3.5;
		System.out.println("����10����̬�ֲ����������");
		for (i = 0; i <10; i++) {
			System.out.println(randZT(u, t, r));
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
	/*
	 * ����������������
	 */
	static double randZT(double u,double t,double []r){
		int i;
		double total=0.0;
		double result;
		for (i = 0; i <12; i++) {
			total+=rand01(r);
		}
		result=u+t*(total-6.0);
		return result;
	}
}
