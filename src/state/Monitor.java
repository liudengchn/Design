package state;

import java.util.ArrayList;

public class Monitor {
    private ArrayList<CandyMachine> arrayList;

    public Monitor() {
        arrayList = new ArrayList<>();
    }

    public void addMachine(CandyMachine candyMachine) {
        arrayList.add(candyMachine);
    }

    public void report() {
        CandyMachine candyMachine;
        for (int i = 0; i < arrayList.size(); i++) {
            candyMachine = arrayList.get(i);
            System.out.println(candyMachine.getCount());
            candyMachine.printState();
        }
    }
}
