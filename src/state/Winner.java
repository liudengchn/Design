package state;

public class Winner implements State {
    private CandyMachine candyMachine;

    public Winner(CandyMachine candyMachine) {
        this.candyMachine = candyMachine;
    }

    @Override
    public void insertCoin() {

    }

    @Override
    public void returnCoin() {

    }

    @Override
    public void turnCrank() {

    }

    @Override
    public void dispense() {
        if (candyMachine.getCount() == 0) {
            candyMachine.setState(candyMachine.soldOut);
        } else {
            System.out.println("you are a winner!you get another candy!");
            if (candyMachine.getCount() > 0) {
                candyMachine.setState(candyMachine.onReadyState);
            } else {
                System.out.println("Oo,out of candies");
                candyMachine.setState(candyMachine.soldOut);
            }
        }
    }

    @Override
    public void printState() {

    }
}
