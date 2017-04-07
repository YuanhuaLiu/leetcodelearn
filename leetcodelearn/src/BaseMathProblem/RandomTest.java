package BaseMathProblem;

import java.util.Random;

/*
 * 1.Math.random(),产生的随机数是0~1之间的一个double,
 * 我们可以把它乘以一定的数，比如乘以100，它就是100以内的数。
 * 2.java.util包里面提供的Random的类，我们可以新建一个Random()的对象来产生随机数，它可以产生随机整数、随机float、随机double
 * 3.System类中有一个currentTimeMillis()方法，它返回一个从1970年1月1日到目前的一个毫秒数，返回类型是long，我们可以拿它来作为一个随机数。
 * 
 */
public class RandomTest {
	public static void main(String[] args) {
		//生成100以内的随机数
		//int x=(int)(Math.random()*100);
		//System.out.println(x);
		
		//生成0－2之间的随机数，包括2
		Random rand = new Random();
		int randNum = rand.nextInt(3);
		System.out.println(randNum);
	}
}
