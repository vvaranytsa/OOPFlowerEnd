package flower.store.items.decorators;

import flower.store.items.Item;

public class RibbonDecorator extends ItemDecorator{
    public RibbonDecorator(Item item) {
        this.item = item;
    }
    public double getPrice() {
        return this.item.getPrice() + 35.0;
    }
}
