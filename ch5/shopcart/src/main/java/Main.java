import model.Book;
import model.BookDB;
import model.ShopItem;

import java.util.HashMap;
import java.util.Map;

class ShopCart {
    private final Map<String, ShopItem> cart;

    public ShopCart() {
        cart = new HashMap<>();
    }

    public void addBook(String id, int count) {
        if (cart.containsKey(id)) {
            ShopItem item = cart.get(id);
            item.addCount(count);
        } else {
            // add a new one
            Book book = BookDB.getBookByID(id);
            cart.put(id,
                    new ShopItem(book.getDescription(), book.getTitle(), book.getPrice(), count));
        }
    }

    public void displayCart() {
        for (ShopItem item : cart.values()) {
            System.out.printf("Title: %s, count: %d%n", item.getTitle(), item.getCount());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ShopCart shopCart = new ShopCart();
        shopCart.addBook("1", 1);
        shopCart.addBook("1", 2);
        shopCart.addBook("2", 3);
        shopCart.addBook("2", -1);
        shopCart.displayCart();
    }
}
