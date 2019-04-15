package observer.pattern;

public interface Observer {
    public void update(float temperature, float weather, float humidity);

    public void display();
}
