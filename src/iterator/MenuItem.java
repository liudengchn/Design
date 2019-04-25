package iterator;

public class MenuItem {
    private String name, description;
    private float price;
    private boolean vegetable;

    public MenuItem(String name, String description, float price, boolean vegetable) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.vegetable = vegetable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isVegetable() {
        return vegetable;
    }

    public void setVegetable(boolean vegetable) {
        this.vegetable = vegetable;
    }
}
