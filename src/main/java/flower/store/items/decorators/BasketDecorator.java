package flower.store.items.decorators;

import flower.store.items.Item;

public class BasketDecorator extends ItemDecorator {
    public BasketDecorator(Item item) {
        this.item = item;
    }

    public double getPrice() {
        return this.item.getPrice() + 5.0;
    }
}

