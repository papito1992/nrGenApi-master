package src.models;

import com.fasterxml.jackson.annotation.JsonView;

public class DrawFromDeck {
    @JsonView
    public String action;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
