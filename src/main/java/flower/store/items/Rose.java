package flower.store.items;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Rose extends Flower {
    public Rose(double price, double sepalLength) {
        super(1,"GREEN", price, sepalLength);
    }
}