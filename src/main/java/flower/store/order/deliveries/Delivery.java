package flower.store.order.deliveries;

import java.util.Map;

public interface Delivery {
    double getPrice();

    boolean setOrder();

    Map<String, String> getDetails();
}
