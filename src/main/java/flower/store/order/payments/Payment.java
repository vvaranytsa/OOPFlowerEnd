package flower.store.order.payments;

import java.util.Map;

public interface Payment {
    boolean pay();
    Map<String, String> getDetails();
}
