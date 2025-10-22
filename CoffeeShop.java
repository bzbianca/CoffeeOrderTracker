
public class CoffeeShop {
    // TODO 1: Change the class name to CoffeeShop

    public static void main(String[] args) {
        // TODO 2: Create three CoffeeOrder objects
        // Use a different constructor each time
        CoffeeOrder coffee1 = new CoffeeOrder();
        CoffeeOrder coffee2 = new CoffeeOrder("large");
        CoffeeOrder coffee3 = new CoffeeOrder("small", "latte");
        // TODO 3: Call describeOrder() on each and print the result
        System.out.println(coffee1.describeOrder()); // Used AI to know how to exactly call describeOrder with a new coffee variable
        System.out.println(coffee2.describeOrder());
        System.out.println(coffee3.describeOrder());
        // TODO 4: Print the total number of orders using
        System.out.println(CoffeeOrder.getTotalOrders());
    }
}