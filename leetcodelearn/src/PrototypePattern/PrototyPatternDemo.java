package PrototypePattern;
//1����һ��ϵͳӦ�ö��������Ĳ�Ʒ���������ɺͱ�ʾʱ�� 
//2����Ҫʵ����������������ʱ��ָ��ʱ�����磬ͨ����̬װ�ء� 
//3��Ϊ�˱��ⴴ��һ�����Ʒ����ƽ�еĹ�������ʱ��
//4����һ�����ʵ��ֻ���м�����ͬ״̬����е�һ��ʱ��������Ӧ��Ŀ��ԭ�Ͳ���¡���ǿ��ܱ�ÿ���ú��ʵ�״̬�ֹ�ʵ�������������һЩ��
public class PrototyPatternDemo {
	 public static void main(String[] args) {
	      ShapeCache.loadCache();

	      Shape clonedShape = (Shape) ShapeCache.getShape("1");
	      System.out.println("Shape : " + clonedShape.getType());        

	      Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
	      System.out.println("Shape : " + clonedShape2.getType());        

	      Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
	      System.out.println("Shape : " + clonedShape3.getType());        
	   }
}
