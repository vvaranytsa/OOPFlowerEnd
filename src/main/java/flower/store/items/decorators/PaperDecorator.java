package flower.store.items.decorators;

import flower.store.items.Item;

public class PaperDecorator extends ItemDecorator{
    public PaperDecorator(Item item) {
        this.item = item;
    }

    public double getPrice() {
        return this.item.getPrice() + 11.0;
    }
}
