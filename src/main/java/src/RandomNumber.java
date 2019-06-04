package src;

import lombok.Data;

@Data
public class RandomNumber {
    private int number;

    public RandomNumber(int number) {
        this.number = number;
    }
}
