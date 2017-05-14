package ru.itpark;


public class TvController {
    private TV tv;

    public TvController(TV tv) {
        this.tv = tv;
    }

    public void on(int channelNumber) {
        tv.onChannel(channelNumber);
    }
}
