package BaseMathProblem;


/*
 * 正态分布的随机数生成算法
 */
public class RandomZT {
	public static void main(String[] args) {
		int i;
		double u,t;
		double [] r={5};
		u=2.0;
		t=3.5;
		System.out.println("产生10个正态分布的随机数：");
		for (i = 0; i <10; i++) {
			System.out.println(randZT(u, t, r));
		}
	}
	static double rand01(double[] r){
		double base,u,v,p,temp1,temp2,temp3;
		base=256.0;//基数
		u=17.0;
		v=139.0;
		temp1=u*(r[0])+v; //计算总值
		temp2=(int)(temp1/base); //计算商
		temp3=temp1-temp2*base;//计算余数
		
		r[0]=temp3;         //更新随机种子，为下一次使用
		p=r[0]/base;
		return p;
	}
	/*
	 * 这个能随机产生种子
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
