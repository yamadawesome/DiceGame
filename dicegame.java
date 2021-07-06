import java.util.Scanner;
public class dicegame{
    public static void main(String[] args){
	Dice d1 = new Dice();
	Dice d2 = new Dice();

	Scanner scanner = new Scanner(System.in);

	System.out.println("What is your name?");
	String name = scanner.next();

	System.out.println("Hello," + name + "!");


	System.out.println("Die 1:" + d1.getNumber());
	System.out.println("Die 2:" + d2.getNumber());

	int sum = d1.getNumber() + d2.getNumber();

	System.out.println("Total value:" + sum);

	if(sum > 7){
	    System.out.println("You won");
	}else{
	    System.out.println("You lost");
	}


    }
}


class Dice{
    private int num;
    public Dice(){
	this.roll();
    }

    public void roll(){
	num = (int)(Math.random() * 6) + 1;
    }

    public int getNumber(){
	return num;
    }
}
