package src.models;

import com.fasterxml.jackson.annotation.JsonView;

public class Ticket {

    @JsonView
    public String firstCity;

    @JsonView
    public String secondCity;

    @JsonView
    public String ticketState;

    @JsonView
    public int value;

    public String getFirstCity() {
        return firstCity;
    }

    public void setFirstCity(String firstCity) {
        this.firstCity = firstCity;
    }

    public String getSecondCity() {
        return secondCity;
    }

    public void setSecondCity(String secondCity) {
        this.secondCity = secondCity;
    }

    public String getTicketState() {
        return ticketState;
    }

    public void setTicketState(String ticketState) {
        this.ticketState = ticketState;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
