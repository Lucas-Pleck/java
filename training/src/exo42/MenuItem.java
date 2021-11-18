package exo42;

import java.util.ArrayList;

public class MenuItem {
    private String label;
    private String moreInfo;
    private ArrayList<MenuItem> menuItems;

    public MenuItem(String label, String moreInfo,ArrayList<MenuItem> menuItems) {
        this.label = label;
        this.moreInfo = moreInfo;
        this.menuItems = menuItems;
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getMoreInfo() {
        return moreInfo;
    }

    public void setMoreInfo(String moreInfo) {
        this.moreInfo = moreInfo;
    }

    public String toString(int index) {
        return index + ")"+
                " " + label + " " +
                " " + moreInfo + " ";
    }

    @Override
    public String toString() {
        return  label + " " + moreInfo ;
    }
}

