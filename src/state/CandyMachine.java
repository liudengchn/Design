package state;

public class CandyMachine {
    State onReadyState;
    State hasCoin;
    State soldOut;
    State winner;

    private State state;
    public int count = 0;

    public CandyMachine(int count) {
        this.count = count;
        onReadyState = new OnReadyState(this);
        hasCoin = new HasCoin(this);
        soldOut = new SoldOut(this);
        winner = new Winner(this);

        if (count > 0) {
            state = onReadyState;
        } else {
            state = soldOut;
        }
    }

    public void setState(State state) {
        this.state = state;
    }

    public void insertCoin() {
        state.insertCoin();
    }

    public void returnCoin() {
        state.returnCoin();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void releaseCandy() {

        // TODO Auto-generated method stub
        if (count > 0) {
            count = count - 1;
            System.out.println("a candy rolling out!");
        }

    }

    public int getCount() {
        return count;
    }

    public void printState() {
        state.printState();
    }
}
