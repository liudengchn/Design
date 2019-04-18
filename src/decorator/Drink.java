package decorator;

public abstract class Drink {
    public String description;

    private float price;

    public String getDescription() {
        return this.description + "-" + this.getPrice();
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

    public abstract float cost();
}
