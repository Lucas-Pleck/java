package exo18.table;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size oh the table");
        int tableSize= scan.nextInt();
        String[] myTable=new String[tableSize];
        for(int i=0;i<myTable.length;i++){
            System.out.println("Enter the value "+i+"of the table");
            myTable[i]= scan.next();
        }
        System.out.println(Arrays.toString(myTable));
    }
}
