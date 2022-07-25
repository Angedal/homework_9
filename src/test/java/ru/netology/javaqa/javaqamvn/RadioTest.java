package ru.netology.javaqa.javaqamvn;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void setAmountOfStations(){
        Radio radio = new Radio(20);

        radio.setCurrentNumber(15);

        int actual = radio.getCurrentNumber();
        int expected = 15;
        assertEquals(actual, expected);
    }

    @Test
    public void increaseNumber() {
        Radio radio = new Radio();

        radio.setCurrentNumber(9);
        radio.next();

        int actual = radio.getCurrentNumber();
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void decreaseNumber() {
        Radio radio = new Radio();

        radio.setCurrentNumber(0);
        radio.prev();

        int actual = radio.getCurrentNumber();
        int expected = 9;
        assertEquals(actual, expected);
    }

    @Test
    public void increaseNumber2() {
        Radio radio = new Radio();

        radio.setCurrentNumber(8);
        radio.next();

        int actual = radio.getCurrentNumber();
        int expected = 9;
        assertEquals(actual, expected);
    }

    @Test
    public void decreaseNumber2() {
        Radio radio = new Radio();

        radio.setCurrentNumber(1);
        radio.prev();

        int actual = radio.getCurrentNumber();
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void increaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(5);
        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 6;
        assertEquals(actual, expected);
    }

    @Test
    public void decreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(5);
        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 4;
        assertEquals(actual, expected);
    }

    @Test
    public void increaseVolume2() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 100;
        assertEquals(actual, expected);
    }

    @Test
    public void decreaseVolume2() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void setNumberLessThanNull() {
        Radio radio = new Radio();

        radio.setCurrentNumber(-1);
    }

    @Test
    public void setNumberMoreThanNine() {
        Radio radio = new Radio();

        radio.setCurrentNumber(10);
    }

    @Test
    public void setVolumeLessThanNull() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);
    }

    @Test
    public void setVolumeMoreThanTen() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);
    }
}