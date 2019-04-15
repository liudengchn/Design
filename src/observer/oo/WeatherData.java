package observer.oo;

public class WeatherData {
    private float temperature;

    private float weather;

    private float humidity;

    private CurrentCondition currentCondition;

    public void setData(float temperature, float weather, float humidity) {
        this.weather = weather;
        this.humidity = humidity;
        this.temperature = temperature;
        dataChange();
    }

    public void dataChange() {
        currentCondition.update(getTemperature(), getWeather(), getHumidity());
    }

    public WeatherData(CurrentCondition currentCondition) {
        this.currentCondition = currentCondition;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getWeather() {
        return weather;
    }

    public void setWeather(float weather) {
        this.weather = weather;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }
}
