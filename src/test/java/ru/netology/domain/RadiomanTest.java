package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadiomanTest {

    @Test
    void increaseCurrentVolume() {
        Radioman radioman = new Radioman();

        radioman.setMaxVolume(10);
        radioman.setMinVolume(0);
        radioman.setCurrentVolume(7);
        radioman.increaseCurrentVolume();
        int expected = 8;

        assertEquals(expected, radioman.getCurrentVolume());
    }

    @Test
    void decreaseCurrentVolume() {
        Radioman radioman = new Radioman();

        radioman.setMaxVolume(10);
        radioman.setMinVolume(0);
        radioman.setCurrentVolume(4);
        radioman.decreaseCurrentVolume();
        int expected = 3;

        assertEquals(expected, radioman.getCurrentVolume());
    }

    @Test
    void increaseCurrentVolumeMax() {
        Radioman radioman = new Radioman();

        radioman.setMaxVolume(10);
        radioman.setMinVolume(0);
        radioman.setCurrentVolume(10);
        radioman.increaseCurrentVolume();
        int expected = 10;

        assertEquals(expected, radioman.getCurrentVolume());
    }


    @Test
    void decreaseCurrentVolumeMin() {
        Radioman radioman = new Radioman();

        radioman.setMaxVolume(10);
        radioman.setMinVolume(0);
        radioman.setCurrentVolume(0);
        radioman.decreaseCurrentVolume();
        int expected = 0;

        assertEquals(expected, radioman.getCurrentVolume());
    }

    @Test
    public void nextStation() {
        Radioman radioman = new Radioman();

        radioman.setMaxStation(9);
        radioman.setMinStation(0);
        radioman.setCurrentStation(8);
        radioman.nextStation();
        int expected = 9;

        assertEquals(expected, radioman.getCurrentStation());
    }

    @Test
    public void previoustStation() {
        Radioman radioman = new Radioman();

        radioman.setMaxStation(9);
        radioman.setMinStation(0);
        radioman.setCurrentStation(6);
        radioman.previoustStation();
        int expected = 5;

        assertEquals(expected, radioman.getCurrentStation());
    }

    @Test
    public void nextStationMax() {
        Radioman radioman = new Radioman();

        radioman.setMaxStation(9);
        radioman.setMinStation(0);
        radioman.setCurrentStation(9);
        radioman.nextStation();
        int expected = 0;

        assertEquals(expected, radioman.getCurrentStation());
    }

    @Test
    public void previoustStationMin() {
        Radioman radioman = new Radioman();

        radioman.setMaxStation(9);
        radioman.setMinStation(0);
        radioman.setCurrentStation(0);
        radioman.previoustStation();
        int expected = 9;

        assertEquals(expected, radioman.getCurrentStation());
    }


    @Test
    void setCurrentStationOver() {
        Radioman radioman = new Radioman();
        radioman.setMaxStation(9);
        radioman.setMinStation(0);
        radioman.setCurrentStation(13);
        int expected = 9;

        assertEquals(expected, radioman.getCurrentStation());
    }

    @Test
    void setCurrentStationUnder() {
        Radioman radioman = new Radioman();
        radioman.setMaxStation(9);
        radioman.setMinStation(0);
        radioman.setCurrentStation(-1);
        int expected = 0;

        assertEquals(expected, radioman.getCurrentStation());
    }

    @Test
    void setCurrentVolumeOver() {
        Radioman radioman = new Radioman();
        radioman.setMaxVolume(10);
        radioman.setMinVolume(0);
        radioman.setCurrentVolume(11);
        int expected = 10;

        assertEquals(expected, radioman.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeUnder() {
        Radioman radioman = new Radioman();
        radioman.setMaxVolume(10);
        radioman.setMinVolume(0);
        radioman.setCurrentVolume(-1);
        int expected = 0;

        assertEquals(expected, radioman.getCurrentVolume());
    }
}