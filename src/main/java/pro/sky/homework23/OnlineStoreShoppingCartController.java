package pro.sky.homework23;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OnlineStoreShoppingCartController {
    private final OnlineStoreShoppingCartService shoppingCartService;

    public OnlineStoreShoppingCartController(OnlineStoreShoppingCartService shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
    }

    @GetMapping("/add")
    public String addItem(@RequestParam(required = false) String...itemsId) {
        if (itemsId == null || itemsId.length < 1) {
            return "артикулы товаров не заданы";
        }
        for (String itemId : itemsId) {
            if (itemId.isEmpty() || !StringUtils.isNumeric(itemId)) {
                return "артикул товара задан не верно!";
            }
        }
        for (String itemId : itemsId) {
            shoppingCartService.addItemToShoppingCart(Integer.parseInt(itemId));
        }
        return "товары добавлены";
    }

    @GetMapping("/get")
    public Object getItemsFromShoppingCard() {
        return shoppingCartService.getItemsFromShoppingCart();
    }
}
