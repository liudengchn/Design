package mediator;

public class TV extends Colleague {
    public TV(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }

    @Override
    public void sendMessage(int state) {
        this.getMediator().getMessage(state, this.name);
    }

    public void TVon() {
        System.out.println("TV IS ON");
    }

    public void TVshut() {
        System.out.println("TV IS STOP");
    }
}
