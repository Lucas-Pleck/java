package exo42.Menu;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MenuItem menuItem1=new MenuItem("atitleMenu1","moreInfo1",new ArrayList<MenuItem>());
        MenuItem menuItem2=new MenuItem("ztitleMenu2","moreInfo2",new ArrayList<MenuItem>());
        MenuItem menuItem3=new MenuItem("ktitleMenu3","moreInfo3",new ArrayList<MenuItem>());
        MenuItem menuItem4=new MenuItem("mtitleMenu4","moreInfo4",new ArrayList<MenuItem>());
        MenuItem menuItem5=new MenuItem("etitleMenu5","moreInfo5",new ArrayList<MenuItem>());


        MenuItem submenuItem1=new MenuItem("msubtitleMenu1","submoreInfo1",new ArrayList<MenuItem>());
        MenuItem submenuItem2=new MenuItem("fsubtitleMenu2","submoreInfo2",new ArrayList<MenuItem>());
        MenuItem submenuItem3=new MenuItem("psubtitleMenu3","submoreInfo3",new ArrayList<MenuItem>());
        MenuItem submenuItem4=new MenuItem("esubtitleMenu4","submoreInfo4",new ArrayList<MenuItem>());
        MenuItem submenuItem5=new MenuItem("asubtitleMenu5","submoreInfo5",new ArrayList<MenuItem>());

        ArrayList<MenuItem> items = new ArrayList<MenuItem>(Arrays.asList( menuItem1, menuItem2, menuItem3, menuItem4, menuItem5));
        ArrayList<MenuItem> subitems = new ArrayList<MenuItem>(Arrays.asList( submenuItem1, submenuItem2, submenuItem3, submenuItem4, submenuItem5));

        items.get(0).setMenuItems(subitems);

        Menu menu=new Menu(items,"MyMenu");

        menu.sortOnLabel();


        MenuItem item = menu.useMenu();

        System.out.println(item);
    }
}
