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
            total = total + item.getAmount() * item.getPrice();
            double DiscountPercent = item.getDiscount();
            total = total * (1 - (DiscountPercent / 100.0));

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
