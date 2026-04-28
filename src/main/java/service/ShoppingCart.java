package service;

import model.Food;

public class ShoppingCart {
    private Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }


    public double itemsWithoutDiscount() {
        double total = 0.0;
        for (Food item : items) {
            total = total + item.getAmount() * item.getPrice();
        }
        return total;
    }

    public double itemsWithDiscount() {
        double total = 0.0;
        for (Food item : items) {
            double itemPrice = item.getAmount() * item.getPrice();
            total = total + itemPrice * (1.0 - item.getDiscount() / 100.0);

        }
        return total;
    }

    public double vegetarianItemsWithoutDiscount() {
        double total = 0.0;
        for (Food item : items) {
            if (item.isVegetarian()) {
                total = total + item.getAmount() * item.getPrice();
            }
        }
        return total;
    }
}
