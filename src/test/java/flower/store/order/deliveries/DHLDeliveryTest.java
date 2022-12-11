package flower.store.order.deliveries;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DHLDeliveryTest {
    Delivery test = new DHLDelivery();
    @Test
    void getPrice() {
        assertEquals(25, test.getPrice());
    }

    @Test
    void setOrder() {
        assertTrue(test.setOrder());
    }

    @Test
    void getDetails() {
        assertEquals("DHL", test.getDetails().get("Type"));
        assertEquals("25.0", test.getDetails().get("Price"));
    }
}
