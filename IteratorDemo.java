//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
class IteratorDemo{
    public static void main(String args[]){
        ArrayList<String> al = new ArrayList<String>();
        al.add("S");
        al.add("I");
        al.add("T");
        al.add("A");
        System.out.print("Original contents of al are :");
        Iterator<String> itr = al.iterator();
        while(itr.hasNext()){
            String element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();
        //Modify the objects iterated
        ListIterator<String> litr =  al.listIterator();
        while(litr.hasNext()){
            String element = litr.next();
            litr.set(element + "+");
        }
        System.out.print("Modified elements of al are :");
         itr = al.iterator();
        while(itr.hasNext()) {
            String element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();
        //Now display the list backwards
        System.out.print("Modified list backwards :");
        while(litr.hasPrevious()){
            String element = litr.previous();
            System.out.print(element + " ");

        }

    }
}