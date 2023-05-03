package pro.sky.homework23;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

@Service
@SessionScope
public class OnlineStoreShoppingCartService {
    private final OnlineStoreShoppingCart shoppingCart;

    public OnlineStoreShoppingCartService() {
        shoppingCart = new OnlineStoreShoppingCart();
    }

    public void addItemToShoppingCart(Integer itemId) {
        shoppingCart.addItem(itemId);
    }

    public Object getItemsFromShoppingCart() {
       return shoppingCart.getShoppingList();
    }
}
