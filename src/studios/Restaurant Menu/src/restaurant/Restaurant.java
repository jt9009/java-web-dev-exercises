package restaurant;

public class Restaurant {

    public static void main(String[] args) {
        MenuItem menuItem1 = new MenuItem("cake", 7.50, "Very good cake", "dessert", true);
        MenuItem menuItem2 = new MenuItem("pizza", 10, "buffalo chicken", "main course", false );

        System.out.println(menuItem1.getName());
        System.out.println(menuItem1.getPrice());
        System.out.println(menuItem1.getDescription());
        System.out.println(menuItem1.getCategory());
//        System.out.println(menuItem1.getIsNew());
    }
}
