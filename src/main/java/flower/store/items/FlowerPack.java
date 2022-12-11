package flower.store.items;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class FlowerPack extends Item {
    private Flower flower;
    private int amount;

    public FlowerPack(Flower flower, int amount) {
        price = flower.getPrice() * amount;
    }
}