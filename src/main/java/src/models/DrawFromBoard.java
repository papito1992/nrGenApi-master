package src.models;

import com.fasterxml.jackson.annotation.JsonView;

import java.util.List;

public class DrawFromBoard extends Output{
    @JsonView
    public String action;
    @JsonView
    public List<String> cardsToDrawFromBoard;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public List<String> getCardsToDrawFromBoard() {
        return cardsToDrawFromBoard;
    }

    public void setCardsToDrawFromBoard(List<String> cardsToDrawFromBoard) {
        this.cardsToDrawFromBoard = cardsToDrawFromBoard;
    }
}
