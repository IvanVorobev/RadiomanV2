package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadiomanTest {
    Radioman radioman = new Radioman();

    @Test
    void increaseCurrentVolume() {

        radioman.setCurrentVolume(7);
        radioman.increaseCurrentVolume();

        assertEquals(8, radioman.getCurrentVolume());
    }

    @Test
    void decreaseCurrentVolume() {

        radioman.setCurrentVolume(4);
        radioman.decreaseCurrentVolume();

        assertEquals(3, radioman.getCurrentVolume());
    }

    @Test
    void increaseCurrentVolumeMax() {

        radioman.setCurrentVolume(100);
        radioman.increaseCurrentVolume();

        assertEquals(10, radioman.getCurrentVolume());
    }

    @Test
    void decreaseCurrentVolumeMin() {

        radioman.setCurrentVolume(0);
        radioman.decreaseCurrentVolume();

        assertEquals(0, radioman.getCurrentVolume());
    }

    @Test
    public void nextStation() {

        radioman.setCurrentStation(8);
        radioman.nextStation();

        assertEquals(9, radioman.getCurrentStation());
    }

    @Test
    public void previoustStation() {

        radioman.setCurrentStation(6);
        radioman.previoustStation();

        assertEquals(5, radioman.getCurrentStation());
    }

    @Test
    public void nextStationMax() {

        radioman.setCurrentStation(10);
        radioman.nextStation();


        assertEquals(0, radioman.getCurrentStation());
    }

    @Test
    public void previoustStationMin() {

        radioman.setCurrentStation(0);
        radioman.previoustStation();

        assertEquals(10, radioman.getCurrentStation());
    }

    @Test
    void setCurrentStationOver() {

        radioman.setCurrentStation(13);

        assertEquals(10, radioman.getCurrentStation());
    }

    @Test
    void setCurrentStationUnder() {

        radioman.setCurrentStation(-1);

        assertEquals(0, radioman.getCurrentStation());
    }

    @Test
    void setCurrentVolumeOver() {

        radioman.setCurrentVolume(110);

        assertEquals(100, radioman.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeUnder() {

        radioman.setCurrentVolume(-1);

        assertEquals(0, radioman.getCurrentVolume());
    }
}