package pizza;
//Make a Pizza class.
// It should have fields like pizza type (e.g., Cheese, Pepperoni, Supreme, etc.),
// size (Small, Medium, Large, and Extra Large), and crust type (Thin, Hand-tossed, Pan).
//Include accessors and an appropriate constructor.


public class Pizza {
    private String pizzaType;
    private String size;
    private String crustType;

    public Pizza(String pizzaType, String size, String crustType) {
        this.pizzaType = pizzaType;
        this.size = size;
        this.crustType = crustType;
    }

    public String getPizzaType() {
        return this.pizzaType;
    }

    public void setPizzaType(String pizzaType) {
        this.pizzaType = pizzaType;
    }

    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getCrustType() {
        return this.crustType;
    }

    public void setCrustType(String crustType) {
        this.crustType = crustType;
    }
}
