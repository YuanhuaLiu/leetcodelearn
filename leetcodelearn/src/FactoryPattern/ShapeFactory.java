package FactoryPattern;

public class ShapeFactory {
//	 public Shape getShape(String shapeType){
//	      if(shapeType == null){
//	         return null;
//	      }        
//	      if(shapeType.equalsIgnoreCase("CIRCLE")){
//	         return new Circle();
//	      } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
//	         return new Rectangle();
//	      } else if(shapeType.equalsIgnoreCase("SQUARE")){
//	         return new Square();
//	      }
//	      return null;
//	   }
	//ʹ�÷�����ƿ��Խ��ÿ������һ����Ʒʱ������Ҫ����һ������ʵ�ֹ�����ȱ��
	public static Object getClass(Class<?extends Shape> clazz) {
        Object obj = null;

        try {
            obj = Class.forName(clazz.getName()).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return obj;
    }
}
