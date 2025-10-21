
public class CoffeeShop {
    // TODO 1: Change the class name to CoffeeShop

    public static void main(String[] args) {
        // TODO 2: Create three CoffeeOrder objects
        // Use a different constructor each time
        CoffeeOrder coffee1 = new CoffeeOrder("medium", "black");
        // TODO 3: Call describeOrder() on each and print the result
        System.out.println(CoffeeOrder.describeOrder(coffee1));
        // TODO 4: Print the total number of orders using
        // CoffeeOrder.getTotalOrders()
    }
}
