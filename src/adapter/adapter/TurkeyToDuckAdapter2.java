package adapter.adapter;

import adapter.duck.Duck;
import adapter.turkey.FireTurkey;

public class TurkeyToDuckAdapter2 extends FireTurkey implements Duck {
    @Override
    public void duckShout() {
        super.turkeyShout();
    }

    @Override
    public void duckFly() {
        super.turkeyFly();
        super.turkeyFly();
    }
}
