package src.models;

import com.fasterxml.jackson.annotation.JsonView;

import java.util.List;

public class Route {

    @JsonView
    public List<String> cities;

    @JsonView
    public int length;

    @JsonView
    public String color;

    @JsonView
    public boolean claimed;

    @JsonView
    public String claimedPlayerName;

    public List<String> getCities() {
        return cities;
    }

    public void setCities(List<String> cities) {
        this.cities = cities;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isClaimed() {
        return claimed;
    }

    public void setClaimed(boolean claimed) {
        this.claimed = claimed;
    }

    public String getClaimedPlayerName() {
        return claimedPlayerName;
    }

    public void setClaimedPlayerName(String claimedPlayerName) {
        this.claimedPlayerName = claimedPlayerName;
    }
}
