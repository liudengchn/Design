package observer.pattern;

public class ForcastCondition implements Observer {
    private float temperature;

    private float weather;

    private float humidity;

    public void update(float temperature, float weather, float humidity) {
        this.humidity = humidity;
        this.temperature = temperature;
        this.weather = weather;
        display();
    }

    public void display() {
        System.out.println("future temperature:" + temperature);
        System.out.println("future humidity:" + humidity);
        System.out.println("future weather:" + weather);
    }
}
