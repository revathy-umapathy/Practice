package headfirst.practice.constructors.superclasscontructor;

public class makeHippo {

	public static void main(String[] args){
		//Hippo hippo = new Hippo(); //Contructor Hippo() is undefined
		Hippo hippo = new Hippo("Buffy");
		System.out.println(hippo.getName());
	}
}
