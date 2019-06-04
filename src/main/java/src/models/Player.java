package src.models;

import com.fasterxml.jackson.annotation.JsonView;

public class Player {

    @JsonView
    public String name;

    @JsonView
    public int score;

    @JsonView
    public int playerSequenceInGame;

    @JsonView
    public String playerState;

    @JsonView
    public int cartCount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getPlayerSequenceInGame() {
        return playerSequenceInGame;
    }

    public void setPlayerSequenceInGame(int playerSequenceInGame) {
        this.playerSequenceInGame = playerSequenceInGame;
    }

    public String getPlayerState() {
        return playerState;
    }

    public void setPlayerState(String playerState) {
        this.playerState = playerState;
    }

    public int getCartCount() {
        return cartCount;
    }

    public void setCartCount(int cartCount) {
        this.cartCount = cartCount;
    }
}
