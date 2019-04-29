package mediator;

public interface Mediator {
    public abstract void register(String name, Colleague colleague);
    void getMessage(int state, String colleagueName);
    void sendMessage();
}
