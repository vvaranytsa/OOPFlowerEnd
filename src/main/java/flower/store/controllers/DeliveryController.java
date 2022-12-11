package flower.store.controllers;

import flower.store.order.deliveries.DHLDelivery;
import flower.store.order.deliveries.PostDelivery;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "api/v1/deliveries")
public class DeliveryController {
    @GetMapping
    public List<Map> getDeliveryDetails() {
        return List.of(new PostDelivery().getDetails(), new DHLDelivery().getDetails());
    }

}
