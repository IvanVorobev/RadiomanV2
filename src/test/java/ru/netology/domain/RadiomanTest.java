package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadiomanTest {

    @Test
    void increaseCurrentVolume() {

        Radioman radioman = new Radioman(7, 100, 0);
        radioman.increaseCurrentVolume();

        assertEquals(8, radioman.getCurrentVolume());
    }

    @Test
    void decreaseCurrentVolume() {

        Radioman radioman = new Radioman(4, 100, 0);
        radioman.decreaseCurrentVolume();

        assertEquals(3, radioman.getCurrentVolume());
    }

    @Test
    void increaseCurrentVolumeMax() {

        Radioman radioman = new Radioman(100, 100, 0);
        radioman.increaseCurrentVolume();

        assertEquals(100, radioman.getCurrentVolume());
    }

    @Test
    void decreaseCurrentVolumeMin() {

        Radioman radioman = new Radioman(0, 100, 0);
        radioman.decreaseCurrentVolume();

        assertEquals(0, radioman.getCurrentVolume());
    }

    @Test
    public void nextStation() {

        Radioman radioman = new Radioman(8, 10);
        radioman.nextStation();

        assertEquals(9, radioman.getCurrentStation());
    }

    @Test
    public void previoustStation() {

        Radioman radioman = new Radioman(5, 10);
        radioman.previoustStation();

        assertEquals(4, radioman.getCurrentStation());
    }

    @Test
    public void nextStationMax() {

        Radioman radioman = new Radioman(10, 10);
        radioman.nextStation();


        assertEquals(0, radioman.getCurrentStation());
    }

    @Test
    public void previoustStationMin() {

        Radioman radioman = new Radioman(0, 10);
        radioman.previoustStation();

        assertEquals(10, radioman.getCurrentStation());
    }

    @Test
    void setCurrentStationOver() {

        Radioman radioman = new Radioman();
        radioman.setCurrentStation(13);

        assertEquals(10, radioman.getCurrentStation());
    }

    @Test
    void setCurrentStationUnder() {

        Radioman radioman = new Radioman();
        radioman.setCurrentStation(-1);

        assertEquals(0, radioman.getCurrentStation());
    }

    @Test
    void setCurrentStationMin() {

        Radioman radioman = new Radioman();
        radioman.setCurrentStation(0);

        assertEquals(0, radioman.getCurrentStation());
    }

    @Test
    void setCurrentStation() {

        Radioman radioman = new Radioman(9, 10);

        assertEquals(9, radioman.getCurrentStation());
    }

    @Test
    void setCurrentVolumeUnder() {

        Radioman radioman = new Radioman();
        radioman.setCurrentVolume(-1);

        assertEquals(0, radioman.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeMin() {

        Radioman radioman = new Radioman();
        radioman.setCurrentVolume(0);

        assertEquals(0, radioman.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeOver() {

        Radioman radioman = new Radioman();
        radioman.setCurrentVolume(103);

        assertEquals(100, radioman.getCurrentVolume());
    }

    @Test
    void SetCurrentVolume() {

        Radioman radioman = new Radioman(8, 100, 0);

        assertEquals(8, radioman.getCurrentVolume());
    }
}