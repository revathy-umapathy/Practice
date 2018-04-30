package headfirst.practice.objectclass.methods;


public class AnimalTestDrive {
	public static void main(String[] args){
		MyAnimalList list = new MyAnimalList();
		Dog a = new Dog();
		Cat b = new Cat();
		list.add(a);
		list.add(b);
		
		//Object equals method
		if(a.equals(b)){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
		
		//Object get class name method - helps to find the full class name of the object
		System.out.println(b.getClass());
		
		//Object HashCode method - helps to get the hashcode of that object
		System.out.println(b.hashCode());
		
		//Object toString method - helps to print the class name with some number or as requested if it is overridden
		System.out.println(b.toString());
		
		//Strongly recommended to override hashcode,toString and equals method if required
	}
}
