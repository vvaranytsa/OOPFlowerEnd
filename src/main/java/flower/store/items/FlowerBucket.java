package flower.store.items;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket extends Item {
    @Getter
    private final List<FlowerPack> flowerPacks = new ArrayList<>();

    public List<FlowerPack> getPacks() {
        return flowerPacks;
    }

    public FlowerBucket() {
        this.flowerPacks.addAll(flowerPacks);
        this.price += flowerPacks.stream().mapToDouble(Item::getPrice).sum();
    }

    public void add(FlowerPack flowerPack) {
        this.price += flowerPack.getPrice();
        flowerPacks.add(flowerPack);
    }

}