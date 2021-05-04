package restaurant;

import java.util.ArrayList;

public class Menu {

    private ArrayList <MenuItem> items;
    private String dateUpdated;

    public Menu(ArrayList<MenuItem> items, String dateUpdated) {
        this.items = items;
        this.dateUpdated = dateUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public String getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(String dateUpdated) {
        this.dateUpdated = dateUpdated;
    }
}
