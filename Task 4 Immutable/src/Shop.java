import java.util.ArrayList;

public final class Shop {
    private final String title;
    private final ArrayList<String> goods;

    public Shop(String title, ArrayList<String> goods) {
        this.title = title;
        ArrayList<String> tempList = new ArrayList<>();

        for (String good : goods) {
            tempList.add(good);
        }
        this.goods = tempList;
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<String> getGoods() {
        ArrayList<String> tempList = new ArrayList<>();

        for (String good : this.goods) {
            tempList.add(good);
        }
        return tempList;
    }

    public Shop setTitle(String title) {
        return new Shop(title, this.goods);
    }

    public Shop setGoods(ArrayList<String> goods) {
        return new Shop(this.title, goods);
    }
}
