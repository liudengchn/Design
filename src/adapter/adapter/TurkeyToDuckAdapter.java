package adapter.adapter;

import adapter.duck.Duck;
import adapter.duck.Turkey;

public class TurkeyToDuckAdapter implements Duck {
    private Turkey turkey;

    public TurkeyToDuckAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void duckShout() {
        turkey.turkeyShout();
    }

    @Override
    public void duckFly() {
        for (int i = 0; i < 4; i++) {
            turkey.turkeyFly();
        }
    }
}
