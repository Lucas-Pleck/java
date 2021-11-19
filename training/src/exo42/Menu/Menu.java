package exo42.Menu;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private ArrayList<MenuItem> menuItems;
    private String title;

    public Menu(ArrayList<MenuItem> menuItems, String title) {
        this.title = title;
        this.menuItems = menuItems;
    }

    public MenuItem useMenu() {
       MenuItem currentMenu = diplaySelectMenu(menuItems, title);
       if(currentMenu.getMenuItems().size()>0) {
           do {
               currentMenu = Menu.diplaySelectMenu(currentMenu.getMenuItems(), currentMenu.getLabel());

           }
           while (currentMenu.getMenuItems().size() > 0);
       }
        return currentMenu;

    }

    public static MenuItem diplaySelectMenu(ArrayList<MenuItem> items, String title){
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("||" + title + "||");
        for (MenuItem menuItem : items) {
            System.out.println(menuItem.toString(items.indexOf(menuItem)));
        }
        do {
            try {
                sc.nextLine();
                choice = sc.nextInt();
            } catch (InputMismatchException ex) {

                choice = -1;
                System.out.println("bad choice, please enter a number");
            }
            if (!(choice >= 0 && choice < items.size())) {
                System.out.println("bad choice, please enter a number include in the menu");
            }
        }
        while (!(choice >= 0 && choice < items.size()));

        return items.get(choice);
    }



    public ArrayList<MenuItem> getMenuItem() {
        return menuItems;
    }

    public void sortOnLabel() {
        sortOnSubLabel(menuItems);
    }

    private void sortOnSubLabel(ArrayList<MenuItem> currentMenu) {
        currentMenu.sort(new LabelComparator());
        for (MenuItem menuItem:currentMenu){
            if(menuItem.getMenuItems().size()>0){
                menuItem.getMenuItems().sort(new LabelComparator());
                sortOnSubLabel(menuItem.getMenuItems());
            }
        }


    }





    @Override
    public String toString() {
        return "Menu{" +
                "menuItems=" + menuItems +
                ", title='" + title + '\'' +
                '}';
    }
}
