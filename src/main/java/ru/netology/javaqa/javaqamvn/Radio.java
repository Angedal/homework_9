package ru.netology.javaqa.javaqamvn;

public class Radio {

    private int currentNumber;
    private int currentVolume;
    private int stationsCount;

    public Radio(){
        this.stationsCount = 10;
    }

    public Radio(int stationsCount){
        this.stationsCount = stationsCount;
    }

    public int getCurrentNumber() {
        return currentNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentNumber(int currentNumber) {
        if (currentNumber < 0) {
            return;
        }
        if (currentNumber > stationsCount - 1) {
            return;
        }
        this.currentNumber = currentNumber;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void next() {
        if (currentNumber < stationsCount - 1) {
            currentNumber++;
        } else {
            currentNumber = 0;
        }
    }

    public void prev() {
        if (currentNumber > 0) {
            currentNumber--;
        } else {
            currentNumber = stationsCount - 1;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}