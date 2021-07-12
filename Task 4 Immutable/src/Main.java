import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<String> goods = new ArrayList<>();
        goods.add("Chocolate");
        goods.add("Rice");
        goods.add("Bread");

        Shop shop = new Shop("Veselka", goods);
        System.out.println("Title: " + shop.getTitle() + "\nGoods: " + shop.getGoods());

        //nothing changed
        goods.add("Milk");
        System.out.println("Title: " + shop.getTitle() + "\nGoods: " + shop.getGoods());

        //nothing changed
        shop.setTitle("Magnit");
        System.out.println("Title: " + shop.getTitle() + "\nGoods: " + shop.getGoods());

        ArrayList<String> otherGoods = new ArrayList<>();
        otherGoods.add("Coca-Cola");
        otherGoods.add("Pumpkin");

        //nothing changed
        shop.setGoods(otherGoods);
        System.out.println("Title: " + shop.getTitle() + "\nGoods: " + shop.getGoods());

    }
}
