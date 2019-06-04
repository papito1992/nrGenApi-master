package src.models;

import com.fasterxml.jackson.annotation.JsonView;

import java.util.List;

public class CurrentPlayer {

    @JsonView
    public String name;

    @JsonView
    public int score;

    @JsonView
    public String playerSequenceInGame;

    @JsonView
    public String playerState;

    @JsonView
    public List<CartCard> cartCards;

    @JsonView
    public List<Ticket> tickets;

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

    public String getPlayerSequenceInGame() {
        return playerSequenceInGame;
    }

    public void setPlayerSequenceInGame(String playerSequenceInGame) {
        this.playerSequenceInGame = playerSequenceInGame;
    }

    public String getPlayerState() {
        return playerState;
    }

    public void setPlayerState(String playerState) {
        this.playerState = playerState;
    }

    public List<CartCard> getCartCards() {
        return cartCards;
    }

    public void setCartCards(List<CartCard> cartCards) {
        this.cartCards = cartCards;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public int getCartCount() {
        return cartCount;
    }

    public void setCartCount(int cartCount) {
        this.cartCount = cartCount;
    }
}
