package src.models;

import com.fasterxml.jackson.annotation.JsonView;

public class Game {

    @JsonView
    public Board board;

    @JsonView
    public boolean lastRound;

    @JsonView
    public String gameState;

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public boolean isLastRound() {
        return lastRound;
    }

    public void setLastRound(boolean lastRound) {
        this.lastRound = lastRound;
    }

    public String getGameState() {
        return gameState;
    }

    public void setGameState(String gameState) {
        this.gameState = gameState;
    }
}
