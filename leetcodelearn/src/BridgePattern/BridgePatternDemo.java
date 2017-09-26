package BridgePattern;
//墙上的开关，可以看到的开关是抽象的，不用管里面具体怎么实现的。
public class BridgePatternDemo {
	public static void main(String[] args) {
	      Shape redCircle = new Circle(100,100, 10, new RedCircle());
	      Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

	      redCircle.draw();
	      greenCircle.draw();
	 }
}
