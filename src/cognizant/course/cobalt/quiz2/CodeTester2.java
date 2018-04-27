package cognizant.course.cobalt.quiz2;

import java.util.Arrays;

public class CodeTester2 {
	public static void main(String a[]){
		displayObjects();
	}
	
	public static void displayObjects(){
		Object[] myObjects = { new Integer(12), new String("foo"),
									new Integer(5), new Boolean(true)};
		Arrays.sort(myObjects); 
		//Array sort will work only on Array of Same object type - throws ClassCastException here
		for(int i=0; i <myObjects.length; i++){
			System.out.print(myObjects[i].toString()); 
			System.out.print(" ");
		}
	}
}
