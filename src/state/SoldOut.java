package state;

public class SoldOut implements State {
    private CandyMachine candyMachine;

    public SoldOut(CandyMachine candyMachine) {
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

        if (candyMachine.getCount() > 0) {
            candyMachine.setState(candyMachine.onReadyState);
        } else {
            System.out.println("Oo,out of candies");
            candyMachine.setState(candyMachine.soldOut);
        }
    }

    @Override
    public void printState() {

    }
}
