package flower.store.order;

import flower.store.items.Item;
import flower.store.order.deliveries.Delivery;
import flower.store.order.payments.Payment;

import java.util.LinkedList;
import java.util.List;

public class Order {
    private final List<Item> items = new LinkedList<Item>();
    private Payment payment;
    private Delivery delivery;

    public void setDelivery(Delivery delivery){
        this.delivery = delivery;
    }
    public void setPayment(Payment payment){
        this.payment = payment;
    }
    public void addItem(Item item){
        this.items.add(item);
    }
    public double calcTotPrice(){
        return this.items.stream().mapToDouble(Item::getPrice).sum();
    }
    public void removeItem(int idx){
        this.items.remove(idx);
    }


}
