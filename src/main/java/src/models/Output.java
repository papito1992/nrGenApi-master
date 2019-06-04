package src.models;

import com.fasterxml.jackson.annotation.JsonView;

import java.util.List;

public class Output {

    @JsonView
    public String action;

    @JsonView
    public List<String> cities;

    @JsonView
    public String colorToClaimWith;

    @JsonView
    public List<String> cardsToDrawFromBoard;

    public Output(String action) {
        this.action = action;
    }

    public Output(String action, List<String> cardsToDrawFromBoard) {
        this.action = action;
        this.cardsToDrawFromBoard = cardsToDrawFromBoard;
    }

    public Output(String action, List<String> cities, String colorToClaimWith) {
        this.action = action;
        this.cities = cities;
        this.colorToClaimWith = colorToClaimWith;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public List<String> getCities() {
        return cities;
    }

    public void setCities(List<String> cities) {
        this.cities = cities;
    }

    public String getColorToClaimWith() {
        return colorToClaimWith;
    }

    public void setColorToClaimWith(String colorToClaimWith) {
        this.colorToClaimWith = colorToClaimWith;
    }

    public List<String> getCardsToDrawFromBoard() {
        return cardsToDrawFromBoard;
    }

    public void setCardsToDrawFromBoard(List<String> cardsToDrawFromBoard) {
        this.cardsToDrawFromBoard = cardsToDrawFromBoard;
    }
}
