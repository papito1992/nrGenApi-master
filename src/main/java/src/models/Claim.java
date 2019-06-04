package src.models;

import com.fasterxml.jackson.annotation.JsonView;

import java.util.List;

public class Claim {

    @JsonView
    public String action;

    @JsonView
    public List<String> cities;

    @JsonView
    public String colorToClaimWith;

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
}
