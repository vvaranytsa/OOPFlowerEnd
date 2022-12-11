package flower.store.items;

public class ItemDiscount extends Item {
    private Item item;
    public ItemDiscount(Item item){
        this.item = item;
    }
    @Override
    public double getPrice(){
        return item.getPrice() * 0.2;
    }
}
