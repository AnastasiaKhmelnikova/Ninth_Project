public class Radio {
    private int currentStation;
    private int volume;

    public Radio() {
        this.currentStation = 0;
        this.volume = 0;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) { //для проверки на допустимые станции
        if (currentStation >= 0 && currentStation <= 9) {
            this.currentStation = currentStation;
        }
    }

    public void nextStation() { // переключение следующей станции
        if (currentStation == 9) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prevStation() { //переключение на предыдущую станцию
        if (currentStation == 0) {
            currentStation = 9;
        } else {
            currentStation--;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void increaseVolume() { //на увеличение громкости
        if (volume < 100) {
            volume++;
        }
    }

    public void decreaseVolume() { //на уменьшение громкости
        if (volume > 0) {
            volume--;
        }
    }
}
