package live.xiaoxu.design.pattern.builder.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Xiao Xu
 * @date 2021/9/22 下午 03:35
 */
public class Meal {

    private final List<Item> items = new ArrayList<Item>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.print("Item : " + item.name());
            System.out.print(", Packing : " + item.packing().pack());
            System.out.println(", Price : " + item.price());
        }
    }
}