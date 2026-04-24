import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;


public class Main {
    public static void main(String[] args) {

        Food meet = new Meat(5, 100);
        Food redApple = new Apple(10, 50, Colour.red);
        Food greenApple = new Apple(8, 60, Colour.green);

        Food[] products = {meet, redApple, greenApple};

        ShoppingCart shoppingCart = new ShoppingCart(products);

        System.out.println(shoppingCart.itemsWithoutDiscount());
        System.out.println(shoppingCart.itemsWithDiscount());
        System.out.println(shoppingCart.vegetarianItemsWithoutDiscount());

    }


}