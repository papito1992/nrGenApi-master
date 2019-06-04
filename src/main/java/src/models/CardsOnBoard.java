package src.models;

import com.fasterxml.jackson.annotation.JsonView;

public class CardsOnBoard {

    @JsonView
    public int pink;

    @JsonView
    public int blue;

    @JsonView
    public int orange;

    @JsonView
    public int white;

    @JsonView
    public int green;

    @JsonView
    public int yellow;

    @JsonView
    public int black;

    @JsonView
    public int red;

    public int getPink() {
        return pink;
    }

    public void setPink(int pink) {
        this.pink = pink;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

    public int getOrange() {
        return orange;
    }

    public void setOrange(int orange) {
        this.orange = orange;
    }

    public int getWhite() {
        return white;
    }

    public void setWhite(int white) {
        this.white = white;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public int getYellow() {
        return yellow;
    }

    public void setYellow(int yellow) {
        this.yellow = yellow;
    }

    public int getBlack() {
        return black;
    }

    public void setBlack(int black) {
        this.black = black;
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }
}
