package ru.netology.domain;

public class Radioman {
    private int currentStation;
    private int maxStation;
    private int minStation;
    private int currentVolume;
    private int maxVolume;
    private int minVolume;


    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }


    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }


    public int getCurrentStation() {
        return currentStation;

    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            this.currentStation = maxStation;
            return;
        }
        if (currentStation < minStation) {
            this.currentStation = minStation;
            return;
        }
        this.currentStation = currentStation;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume >= maxVolume) {
            this.currentVolume = maxVolume;
            return;
        }
        if (currentVolume <= minVolume) {
            this.currentVolume = minVolume;
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void nextStation() {
        if (currentStation >= maxStation) {
            this.currentStation = minStation;
            return;
        }
        this.currentStation++;
    }

    public void previoustStation() {
        if (currentStation <= minStation) {
            this.currentStation = maxStation;
            return;
        }
        this.currentStation--;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public void increaseCurrentVolume() {
        if (currentVolume >= maxVolume) {
            return;
        }
        this.currentVolume++;
    }

    public void decreaseCurrentVolume() {
        if (currentVolume <= minVolume) {
            return;
        }
        this.currentVolume--;

    }
}
