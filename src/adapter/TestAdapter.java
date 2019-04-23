package adapter;

import adapter.adapter.TurkeyToDuckAdapter;
import adapter.adapter.TurkeyToDuckAdapter2;
import adapter.duck.Duck;
import adapter.duck.GreenDuck;
import adapter.duck.Turkey;
import adapter.turkey.FireTurkey;

public class TestAdapter {
    public static void main(String[] args) {
        Duck greenDuck = new GreenDuck();
        Turkey fireTurkey = new FireTurkey();

        TurkeyToDuckAdapter turkeyToDuckAdapter = new TurkeyToDuckAdapter(fireTurkey);

        greenDuck.duckFly();
        greenDuck.duckShout();
        fireTurkey.turkeyFly();
        fireTurkey.turkeyShout();

        turkeyToDuckAdapter.duckFly();
        turkeyToDuckAdapter.duckShout();

        System.out.println("----");

        TurkeyToDuckAdapter2 turkeyToDuckAdapter2 = new TurkeyToDuckAdapter2();
        turkeyToDuckAdapter2.duckFly();
        turkeyToDuckAdapter2.duckShout();
    }
}
