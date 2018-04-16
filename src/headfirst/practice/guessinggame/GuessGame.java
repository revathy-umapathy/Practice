package headfirst.practice.guessinggame;

public class GuessGame {
Player p1,p2,p3;

public void startGame(){
//Create three player objects and assign it to three player instance variables
	p1= new Player();
	p2= new Player();
	p3= new Player();

int guessp1=0, guessp2=0, guessp3=0;
boolean p1isRight = false, p2isRight=false, p3isRight = false;

int targetNumber = (int) (Math.random() * 10);

System.out.println("I'm thinking of a number between 0 and 9...");

while(true){
	System.out.println("Number to guess is " +targetNumber);
	p1.guess();
	p2.guess();
	p3.guess();
	guessp1 = p1.number;
	guessp2 = p2.number;
	guessp3 = p3.number;

	if(guessp1 == targetNumber){
		p1isRight=true;
	}if(guessp2 == targetNumber){
		p2isRight=true;
	}if(guessp3 == targetNumber){
		p3isRight=true;
	}

	if(p1isRight||p2isRight||p3isRight){
		System.out.println("We have a Winner!");
		System.out.println("Player one got it right? " +p1isRight);
		System.out.println("Player two got it right? " +p2isRight);
		System.out.println("Player three got it right? " +p3isRight);

		break;
	}else{
		System.out.println("Players will have to try again.");
	}
}
}
}
