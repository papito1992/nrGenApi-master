package src;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import src.models.*;

import java.util.*;
import java.util.stream.Collectors;

@RestController
public class NumberController {

    @Autowired
    RandomNumberService randomNumberService;

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Output numberGenerator(@RequestBody Game game) {

        Output output = null;
        List<Route> gameMap = game.getBoard().getMap();
        List<Route> unclaimedRoutes = gameMap.stream().filter(r -> !r.isClaimed()).collect(Collectors.toList());

        CurrentPlayer currentPlayer = game.getBoard().getCurrentPlayer();
        CartCard cartCard = currentPlayer.getCartCards();

        HashMap<String, Integer> colorHashMap = new HashMap<>();
        colorHashMap.put("pink", cartCard.getPink());
        colorHashMap.put("blue", cartCard.getBlue());
        colorHashMap.put("orange", cartCard.getOrange());
        colorHashMap.put("white", cartCard.getWhite());
        colorHashMap.put("green", cartCard.getGreen());
        colorHashMap.put("yellow", cartCard.getYellow());
        colorHashMap.put("black", cartCard.getBlack());
        colorHashMap.put("red", cartCard.getRed());
        colorHashMap.put("none", 0);
        unclaimedRoutes.sort(Comparator.comparing((Route r) -> String.valueOf(r.getLength())));

        List<Route> availableRoutes = new ArrayList<>();

        for(Route route: unclaimedRoutes){
            int a = colorHashMap.get(route.getColor());
            if(colorHashMap.get(route.getColor()) >= route.getLength()){
                availableRoutes.add(route);
            }
        }

        if(!availableRoutes.isEmpty()){
            output = new Output("claimRoute",
                    availableRoutes.get(availableRoutes.size()-1).getCities(),
                    availableRoutes.get(availableRoutes.size()-1).getColor());

        }else{
            output = new Output("drawCardsFromDeck");
        }


        return output;
    }
}