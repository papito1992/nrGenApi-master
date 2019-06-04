package src.models;

import com.fasterxml.jackson.annotation.JsonView;

import java.util.List;

@JsonView
public class Board {

    @JsonView
    public String currentPlayerIdToMove;

    @JsonView
    public List<Player> players;

    @JsonView
    public CurrentPlayer currentPlayer;

    @JsonView
    public List<Route> map;

    @JsonView
    public CardsOnBoard cardsOnBoard;

    @JsonView
    public int cardsInDeckCount;

    public String getCurrentPlayerIdToMove() {
        return currentPlayerIdToMove;
    }

    public void setCurrentPlayerIdToMove(String currentPlayerIdToMove) {
        this.currentPlayerIdToMove = currentPlayerIdToMove;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public CurrentPlayer getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(CurrentPlayer currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public List<Route> getMap() {
        return map;
    }

    public void setMap(List<Route> map) {
        this.map = map;
    }

    public CardsOnBoard getCardsOnBoard() {
        return cardsOnBoard;
    }

    public void setCardsOnBoard(CardsOnBoard cardsOnBoard) {
        this.cardsOnBoard = cardsOnBoard;
    }

    public int getCardsInDeckCount() {
        return cardsInDeckCount;
    }

    public void setCardsInDeckCount(int cardsInDeckCount) {
        this.cardsInDeckCount = cardsInDeckCount;
    }
}
