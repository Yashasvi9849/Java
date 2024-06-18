//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;

class ArrayListDemo{
    public static void main(String args[]){

        ArrayList<String> al = new ArrayList<String>();

        System.out.println("Initial size of al "+ al.size());
        //Add elements to the list
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1,"A2");
        //display the array list
        System.out.println("size of al after all additions :"+al.size());

        //remove the elements from the array list
        al.remove("F");
        al.remove(2);
        System.out.println("size of al after deletions :"+al.size());
        System.out.println(" Contents of al are :"+al);

    }
}