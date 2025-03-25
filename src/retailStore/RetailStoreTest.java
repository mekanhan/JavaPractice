package retailStore;

public class RetailStoreTest {
    public static void main(String[] args) {
        RetailStore store1 = new RetailStore("Cookie", 200);
        RetailStore store2 = new RetailStore("Candy", 500);
        store1.showQuantity();
        store2.showQuantity();
        RetailStore.showTotalQuantity();
        store1.receive(300);
        store1.receive(600);
        store1.showQuantity();
        store2.showQuantity();
        RetailStore.showTotalQuantity();
    }
}
