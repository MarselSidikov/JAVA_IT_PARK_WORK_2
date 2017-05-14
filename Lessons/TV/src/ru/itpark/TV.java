package ru.itpark;

public class TV {
    private final int MAX_CHANNELS = 99;
    private Channel[] channels;

    public TV() {
        channels = new Channel[MAX_CHANNELS];
    }

    public void setChannel(Channel channel, int number) {
        if (number >= 0 && number <= MAX_CHANNELS) {
            this.channels[number] = channel;
        } else {
            System.err.println("Нет возможности добавить канал");
        }
    }

    public void onChannel(int number) {
        if (number >= 0 && number <= MAX_CHANNELS) {
            if (channels[number] == null) {
                System.out.println("ПШПШПШПШПШПШПШПППЩЩЩЩ");
            } else {
                this.channels[number].on();
            }
        }
    }
}