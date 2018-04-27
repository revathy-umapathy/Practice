package cognizant.course.cobalt.quiz2;

public class CodeSnippet1 {
	public static void changeContent(int[] numbergame){
		//Changing the content at location 0
		numbergame[0]=2;
		numbergame[1]=6;
	}
	
	public static void changeReference(int[] numbergame){
		//New Reference
		numbergame = new int[2];
		numbergame[0]=15;
		numbergame[1]=11;
	}
	
	public static void main(String[] args){
		int[] numbergame = new int[2];
		numbergame[0]=4;
		numbergame[1]=7;
		changeContent(numbergame);
		System.out.println(numbergame[0] + " " + numbergame[1]);
		changeReference(numbergame);
		System.out.println(numbergame[0] + " " + numbergame[1]);
	}
}
