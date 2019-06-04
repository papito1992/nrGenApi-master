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

}
