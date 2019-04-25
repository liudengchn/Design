package state;

import java.util.Random;

public class HasCoin implements State {
    private CandyMachine candyMachine;

    public HasCoin(CandyMachine candyMachine) {
        this.candyMachine = candyMachine;
    }

    @Override
    public void insertCoin() {

    }

    @Override
    public void returnCoin() {
        System.out.println("here is your coin");
        candyMachine.setState(candyMachine.onReadyState);
    }

    @Override
    public void turnCrank() {
        System.out.println("crank turn...!");
        Random ranwinner=new Random();
        int winner=ranwinner.nextInt(10);
        if(winner==0)
        {
            candyMachine.setState(candyMachine.winner);

        }else
        {
            candyMachine.setState(candyMachine.soldOut);

        }
    }

    @Override
    public void dispense() {

    }

    @Override
    public void printState() {

    }
}
