package pro.sky.homework23;

import java.util.ArrayList;
import java.util.List;

public class OnlineStoreShoppingCart {
    private final List<Integer> shoppingList = new ArrayList<>();

    public void addItem(Integer itemId) {
        shoppingList.add(itemId);
    }

    public List<Integer> getShoppingList() {
        return shoppingList;
    }
}
