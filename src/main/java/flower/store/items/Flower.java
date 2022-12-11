package flower.store.items;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table

public class Flower {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String color;
    private double sepalLength;
    private double price;


    public Flower(String color, double price, double sepalLength) {
        this.color = color;
        this.price = price;
        this.sepalLength = sepalLength;
    }
}