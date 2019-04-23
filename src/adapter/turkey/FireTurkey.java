package adapter.turkey;

import adapter.duck.Turkey;

public class FireTurkey implements Turkey {
    @Override
    public void turkeyShout() {
        System.out.println("-turkeyshout");
    }

    @Override
    public void turkeyFly() {
        System.out.println("-turkeyfly short distance");
    }
}
