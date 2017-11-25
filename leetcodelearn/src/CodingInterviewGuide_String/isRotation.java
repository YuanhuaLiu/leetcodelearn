package CodingInterviewGuide_String;


public class isRotation {
	public static boolean  isrotation(String a,String b){
		if (a==null||b==null||a.length()!=b.length()){
			return false;
		}
		String b2=b+b;
		return b2.indexOf(a)!=-1;
	}
	public static void main(String[] args) {
		String a="123";
		String b="231";
		System.out.println(isrotation(a,b));
	}
}
