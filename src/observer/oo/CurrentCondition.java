package observer.oo;

public class CurrentCondition {
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
        System.out.println("today temperature:" + temperature);
        System.out.println("today humidity:" + humidity);
        System.out.println("today weather:" + weather);
    }
}
