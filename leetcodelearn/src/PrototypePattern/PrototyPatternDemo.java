package PrototypePattern;
//1、当一个系统应该独立于它的产品创建，构成和表示时。 
//2、当要实例化的类是在运行时刻指定时，例如，通过动态装载。 
//3、为了避免创建一个与产品类层次平行的工厂类层次时。
//4、当一个类的实例只能有几个不同状态组合中的一种时。建立相应数目的原型并克隆它们可能比每次用合适的状态手工实例化该类更方便一些。
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
