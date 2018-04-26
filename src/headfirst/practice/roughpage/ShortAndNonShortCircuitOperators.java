package headfirst.practice.roughpage;

public class ShortAndNonShortCircuitOperators {
	public static void main(String[] args){
		int a = 10,b=20,c=30,d=40;
		//Short Circuit AND Operator 
		if(a==10 && b ==20){
			System.out.println("Short Circuit AND Operator valid state");
		}
		if(a==5 && b ==20){
			System.out.println("Short Circuit AND Operator invalid state");
		}
		//Short Circuit OR Operator
		if(a==10 || b ==20){
			System.out.println("Short Circuit OR Operator valid state");
		}
		if(a==5 || b ==2){
			System.out.println("Short Circuit OR Operator valid state");
		}
		//Non-Short Circuit AND Operator
		if(a==10 & b ==20){
			System.out.println("Short Circuit AND Operator valid state");
		}
		if(a==5 & b ==20){
			System.out.println("Short Circuit AND Operator invalid state");
		}
		//Non-Short Circuit OR Operator
		if(a==10 | b ==20){
			System.out.println("Short Circuit OR Operator valid state");
		}
		if(a==5 | b ==2){
			System.out.println("Short Circuit OR Operator invalid state");
		}
	}

}
