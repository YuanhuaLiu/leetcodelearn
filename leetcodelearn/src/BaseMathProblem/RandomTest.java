package BaseMathProblem;

import java.util.Random;

/*
 * 1.Math.random(),�������������0~1֮���һ��double,
 * ���ǿ��԰�������һ���������������100��������100���ڵ�����
 * 2.java.util�������ṩ��Random���࣬���ǿ����½�һ��Random()�Ķ���������������������Բ���������������float�����double
 * 3.System������һ��currentTimeMillis()������������һ����1970��1��1�յ�Ŀǰ��һ��������������������long�����ǿ�����������Ϊһ���������
 * 
 */
public class RandomTest {
	public static void main(String[] args) {
		//����100���ڵ������
		//int x=(int)(Math.random()*100);
		//System.out.println(x);
		
		//����0��2֮��������������2
		Random rand = new Random();
		int randNum = rand.nextInt(3);
		System.out.println(randNum);
	}
}
