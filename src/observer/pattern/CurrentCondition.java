package observer.pattern;

public class CurrentCondition implements Observer {
    private float temperature;

    private float weather;

    private float humidity;

    @Override
    public void update(float temperature, float weather, float humidity) {
        this.humidity = humidity;
        this.temperature = temperature;
        this.weather = weather;
        display();
    }

    @Override
    public void display() {
        System.out.println("today temperature:" + temperature);
        System.out.println("today humidity:" + humidity);
        System.out.println("today weather:" + weather);
    }
}
