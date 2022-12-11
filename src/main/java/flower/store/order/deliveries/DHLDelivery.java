package flower.store.order.deliveries;

import java.util.Map;

public class DHLDelivery implements Delivery {
    @Override
    public double getPrice() {
        return 25;
    }

    @Override
    public boolean setOrder() {
        return true;
    }

    @Override
    public Map<String, String> getDetails() {
        return Map.of("Type", "DHL", "Price", String.valueOf(this.getPrice()));
    }
}
