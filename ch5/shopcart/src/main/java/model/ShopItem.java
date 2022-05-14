package model;

public class ShopItem {
    private String description;
    private String title;
    private double price;
    private int count;

    public ShopItem(String description, String title, double price, int count) {
        this.description = description;
        this.title = title;
        this.price = price;
        this.count = count;
    }

    public void addCount(int count) {
        this.count += count;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
