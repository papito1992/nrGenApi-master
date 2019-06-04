package src.models;

import com.fasterxml.jackson.annotation.JsonView;

import java.util.List;

public class DrawFromBoard extends Output{
    @JsonView
    public String action;
    @JsonView
    public List<String> cardsToDrawFromBoard;
}
