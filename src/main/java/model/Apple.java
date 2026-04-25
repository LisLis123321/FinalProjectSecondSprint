package model;

import model.constants.Colour;

public class Apple extends Food {
    public String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price, true);
        this.colour = colour;

    }

    @Override
    public double getDiscount() {
        if (colour.equals(Colour.red)) {
            return 60.0;
        }
        return 0.0;
    }
}
