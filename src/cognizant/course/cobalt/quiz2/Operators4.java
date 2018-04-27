package cognizant.course.cobalt.quiz2;

public class Operators4 {
	public static void main(String[] args){
	int counter1=0, counter2=0;
	if((counter2 == counter1++) | (counter1 < ++counter2)){
		++counter2;
	}
	System.out.println(counter1 + " " + counter2);
}
	//++x = 1st increment then the other work
	//x++ = increment in the next line
}
