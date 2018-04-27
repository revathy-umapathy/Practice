package cognizant.course.cobalt.quiz2;

import java.util.Arrays;
import java.util.List;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class Operators5 {
	public static void main(String[] args){
		int i =1;
		Integer[] arr = {0,1,2};
		int z =0;
		arr[i] = z = ++i;
		List li = Arrays.asList(arr);
		System.out.println(li + "#" +z);
	}
	//++x = 1st increment then the other work
	//x++ = increment in the next line
}
