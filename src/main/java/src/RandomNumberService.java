package src;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class RandomNumberService {


    public int RandomNumberGenerator() {

        Random randomNr = new Random();
        return randomNr.ints(1, (100 + 1)).findFirst().getAsInt();
    }
}
