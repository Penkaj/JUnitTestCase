package JUnitTestPackage;
import java.util.*;
public class JUnitFunction {
	public static int addno(int x,int y){
		int z= x+y;
		return z;
		
	}
	
	public static String addstring(String a,String b) {
		String c = a.concat(b);
		return c;
	}
	
	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println((addno(a,b)));
		String x = "Pankaj";
		String y = "Singh";
		System.out.println((addstring(x,y)));
		
		
		
	}
}
