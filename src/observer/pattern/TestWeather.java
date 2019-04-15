package observer.pattern;

public class TestWeather {
    public static void main(String[] args) {
        Observer observer = new CurrentCondition();
        Subject subject = new WeatherData();
        Observer forcastObserver = new ForcastCondition();

        subject.registerObserver(observer);
        subject.registerObserver(forcastObserver);

        ((WeatherData) subject).setData(20, 30, 40);
//        ((WeatherData) subject).setData(10, 10, 10);

        subject.removeObserver(observer);
        ((WeatherData) subject).setData(10, 10, 10);
    }
}
