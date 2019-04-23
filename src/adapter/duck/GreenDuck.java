package adapter.duck;

public class GreenDuck implements Duck {
    @Override
    public void duckShout() {
        System.out.println("-duckshout");
    }

    @Override
    public void duckFly() {
        System.out.println("-duckfly long distance");
    }
}
