package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadiomanTest {

    Radioman radioman = new Radioman(5, 10, 0, 50, 100, 0);

    @Test
    void shouldUseAllArgsConstructor() {
        Radioman radioman = new Radioman(5, 10, 0, 50, 100, 0);
        assertEquals(5, radioman.getCurrentStation());
        assertEquals(10, radioman.getMaxStation());
        assertEquals(0, radioman.getMinStation());
        assertEquals(50, radioman.getCurrentVolume());
        assertEquals(100, radioman.getMaxVolume());
        assertEquals(0, radioman.getMinVolume());
    }

    @Test
    void increaseCurrentVolume() {
        radioman.increaseCurrentVolume();

        assertEquals(51, radioman.getCurrentVolume());
    }

    @Test
    void increaseCurrentVolumeOver() {
        radioman.setCurrentVolume(105);
        radioman.increaseCurrentVolume();

        assertEquals(100, radioman.getCurrentVolume());
    }

    @Test
    void decreaseCurrentVolume() {
        radioman.decreaseCurrentVolume();

        assertEquals(49, radioman.getCurrentVolume());
    }

    @Test
    void increaseCurrentVolumeMax() {
        radioman.setCurrentVolume(100);

        assertEquals(100, radioman.getCurrentVolume());
    }

    @Test
    void decreaseCurrentVolumeMin() {
        radioman.setCurrentVolume(0);

        assertEquals(0, radioman.getCurrentVolume());
    }

    @Test
    public void nextStation() {
        radioman.nextStation();

        assertEquals(6, radioman.getCurrentStation());
    }

    @Test
    public void previoustStation() {
        radioman.previoustStation();

        assertEquals(4, radioman.getCurrentStation());
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
    void setCurrentStationMin() {
        radioman.setCurrentStation(0);

        assertEquals(0, radioman.getCurrentStation());
    }

    @Test
    void setCurrentStation() {
        radioman.setCurrentStation(3);

        assertEquals(3, radioman.getCurrentStation());
    }

    @Test
    void setCurrentVolumeUnder() {
        radioman.setCurrentVolume(-1);

        assertEquals(0, radioman.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeMin() {
        radioman.setCurrentVolume(0);

        assertEquals(0, radioman.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeOver() {
        radioman.setCurrentVolume(103);

        assertEquals(100, radioman.getCurrentVolume());
    }

    @Test
    void setCurrentVolume() {
        radioman.setCurrentVolume(8);

        assertEquals(8, radioman.getCurrentVolume());
    }
}