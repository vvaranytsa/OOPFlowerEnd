package flower.store.order.deliveries;

import java.util.Map;

public class PostDelivery implements Delivery {
    @Override
    public double getPrice() {
        return 8;
    }

    public boolean setOrder() {
        return true;
    }

    @Override
    public Map<String, String> getDetails() {
        return Map.of("Type", "Post", "Price", String.valueOf(this.getPrice()));
    }
}
