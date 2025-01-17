package restaurant;

public class MenuItem {

    private String name;
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public MenuItem(String name, double price, String description, String category, boolean isNew) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    public boolean setIsNew() {
        return isNew;
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
    public String getCategory() {
        return category;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

}

