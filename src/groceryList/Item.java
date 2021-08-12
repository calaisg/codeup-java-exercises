package groceryList;

public class Item {

    //value = category
    //key = object array list

    private String itemName;
    private int itemQuantity;

    public Item(String itemName, int itemQuantity){
        this.itemName = itemName;
        this.itemQuantity = itemQuantity;
    }

    public String getItemName() {
        return itemName;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

}
