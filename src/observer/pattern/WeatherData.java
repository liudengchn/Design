package observer.pattern;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private float temperature;

    private float weather;

    private float humidity;

    public observer.pattern.Observer observer;

    public ArrayList<observer.pattern.Observer> arrayList;

    public WeatherData() {
        arrayList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        arrayList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if (arrayList.contains(observer)) {
            arrayList.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        for (int i = 0 ; i < arrayList.size(); i++) {
            arrayList.get(i).update(getTemperature(), getWeather(), getHumidity());
        }
    }

    public void setData(float temperature, float weather, float humidity) {
        this.weather = weather;
        this.humidity = humidity;
        this.temperature = temperature;
        dataChange();
    }

    public void dataChange() {
        notifyObserver();
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
