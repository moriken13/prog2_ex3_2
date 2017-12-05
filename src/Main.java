import jp.ac.uryukyu.ie.ex3_2.pair09.Dice;
import jp.ac.uryukyu.ie.ex3_2.pair09.ExDice;

public class Main{
    public static void main(String[] args){
	Dice dice = new Dice();
	dice.play();
	System.out.println(dice.getValue());

	ExDice exdice = new ExDice(5,7);
	for(int i=0; i<10; i++){
	    exdice.play();
	    System.out.println("exdice"+ i + "回目:" + exdice.getValue());
	}
    }
}