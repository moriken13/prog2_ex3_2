package jp.ac.uryukyu.ie.ex3_2.pair09;

public class ExDice extends Dice{
    private int minValue;
    private int maxValue;

    public ExDice(int minValue, int maxValue){
	this.minValue = minValue;
	this.maxValue = maxValue;
	play();
    }

    @Override
    public void play(){
	int a = (maxValue+1) - minValue;
        setValue((int)(Math.random()*a)+minValue);
    }
}