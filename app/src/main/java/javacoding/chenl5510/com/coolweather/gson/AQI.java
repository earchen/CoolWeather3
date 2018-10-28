package javacoding.chenl5510.com.coolweather.gson;

public class AQI {
    public AQICity city;

    private class AQICity {
        public String aqi;
        public String pm25;
    }
}
