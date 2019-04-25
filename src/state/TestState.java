package state;

public class TestState {
    public static void main(String[] args) {
        CandyMachine mCandyMachine = new CandyMachine(6);

        mCandyMachine.printState();

        mCandyMachine.insertCoin();
        mCandyMachine.printState();

        mCandyMachine.turnCrank();

        mCandyMachine.printState();

        mCandyMachine.insertCoin();
        mCandyMachine.printState();

        mCandyMachine.turnCrank();

        mCandyMachine.printState();
    }
}
