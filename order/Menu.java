package order;
import java.util.ArrayList;

public class Menu {
    private String fooditems[][] = {
        {"Cheeseburger -", "$5.50"},
        {"Hot Dog -", "$4.00"},
        {"French Fries -", "$2.05"},
        {"Ground Beef Burrito -", "$10.00"},
        {"Chicken Taco -", "$4.25"},
        {"12\" Pepperoni Pizza -", "$12.50"},
        {"10 Piece - Southern Fried Jumbo Shrimp -", "$10.50"},
        {"Fish and Chips -", "$11.50"}
    };
    public void menuItems() {
        System.out.println("Menu:");
        int a, b;
        for(a=0; a < fooditems.length; a++) {
            for(b=0; b < fooditems.length; b++)
            System.out.print(fooditems[a][b] + " ");
        System.out.println();
        } 
    }    
    public void allItems() {    
        ArrayList<String> items = new ArrayList<>();
        items.add("Cheeseburger");
        items.add("Hot Dog");
        items.add("French Fries");
    }
    public void allPrices(){
        ArrayList<String> prices = new ArrayList<>();
        prices.add("$5.50");
        prices.add("$4.00");
        prices.add("$2.05");
    }
}