package state;

public class TestState {
    public static void main(String[] args) {
        CandyMachine mCandyMachine = new CandyMachine(6);
        Monitor mMonitor = new Monitor();

        mMonitor.addMachine(mCandyMachine);

        mCandyMachine = new CandyMachine(4);
        mCandyMachine.insertCoin();
        mMonitor.addMachine(mCandyMachine);

        mCandyMachine = new CandyMachine(14);
        mCandyMachine.insertCoin();
        mCandyMachine.turnCrank();
        mMonitor.addMachine(mCandyMachine);

        mMonitor.report();
/*
        mCandyMachine.printState();

        mCandyMachine.insertCoin();
        mCandyMachine.printState();

        mCandyMachine.turnCrank();

        mCandyMachine.printState();

        mCandyMachine.insertCoin();
        mCandyMachine.printState();

        mCandyMachine.turnCrank();

        mCandyMachine.printState();*/
    }
}
