package cognizant.course.cobalt;

public class DataVariableArray {
	public static void main(String[] args) {
		  String entries[] = { "entry1", "entry2" };
		  int count = 0;
		  while (entries[count++] != null) {
		   System.out.println(count);
		  }
		  System.out.println(count);
		  //the ArrayIndexOutOfBoundsException is thrown when an index is passed
//to an array which doesn’t contain an element at that particular index location.
		 }


}
