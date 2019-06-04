package src;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import src.models.Game;
import src.models.Output;

@RestController
public class NumberController {

    @Autowired
    RandomNumberService randomNumberService;

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Output numberGenerator(@RequestBody Game game) {
        Output output = new Output("skip");


        return output;
    }
}