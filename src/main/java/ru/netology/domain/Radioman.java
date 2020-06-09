package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Radioman {
    private int currentStation = 5;
    private int maxStation = 10;
    private int minStation = 0;
    private int currentVolume = 50;
    private int maxVolume = 100;
    private int minVolume = 0;


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

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            this.currentVolume = maxVolume;
            return;
        }
        if (currentVolume < minVolume) {
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
        currentStation++;
    }

    public void previoustStation() {
        if (currentStation <= minStation) {
            this.currentStation = maxStation;
            return;
        }
        currentStation--;
    }

    public void increaseCurrentVolume() {
        if (currentVolume >= maxVolume) {
            return;
        }
        currentVolume++;
    }

    public void decreaseCurrentVolume() {
        if (currentVolume <= minVolume) {
            return;
        }
        currentVolume--;
    }

}
