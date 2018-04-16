package cognizant.course.somesplexamples;

public class AverageUsingArray {
public float average(int... nums){
	int sum=0;
	for(int x:nums){
		sum += x;

	}
	return ((float)sum /nums.length);
}

public static void main(String[] args){
	AverageUsingArray i = new AverageUsingArray();
	i.average(1,2,20);
}
}
