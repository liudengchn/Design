package observer.oo;

public class TestWeather {
    public static void main(String[] args) {
        CurrentCondition currentCondition;
        WeatherData weatherData;

        currentCondition = new CurrentCondition();
        weatherData = new WeatherData(currentCondition);

        weatherData.setData(10,20,30);
    }
}
