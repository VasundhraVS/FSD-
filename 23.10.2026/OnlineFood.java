package Day5;

public class OnlineFood {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PizzaRestaurant p = new PizzaRestaurant();
        p.displayMenu();
        p.calculateBill();

        System.out.println();

        BurgerRestaurant b = new BurgerRestaurant();
        b.displayMenu();
        b.calculateBill();
	}
}
abstract class Restaurant {

    abstract void displayMenu();

    abstract void calculateBill();
}

class PizzaRestaurant extends Restaurant {

    void displayMenu() {
        System.out.println("Pizza Menu");
        System.out.println("Pizza - Rs.200");
        System.out.println("Garlic Bread - Rs.100");
    }

    void calculateBill() {
        int bill = 200 + 100;
        System.out.println("Pizza Bill: Rs." + bill);
    }
}

class BurgerRestaurant extends Restaurant {

    void displayMenu() {
        System.out.println("Burger Menu");
        System.out.println("Burger - Rs.150");
        System.out.println("French Fries - Rs.80");
    }

    void calculateBill() {
        int bill = 150 + 80;
        System.out.println("Burger Bill: Rs." + bill);
    }
}