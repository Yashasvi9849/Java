import java.util.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class LinkedListDemo{
    public static void main(String args[]){
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("R");
        ll.add("A");
        ll.add("G");
        ll.addFirst("M");
        ll.addLast("I");
        ll.add(2,"Y");
        System.out.println(" ll initial value " +ll);
        ll.remove(2);
        ll.addFirst("U");
        ll.removeLast();
        System.out.println(" ll after deleting value " +ll);
        // Get and set a value
        String val = ll.get(2);
        ll.set(2,val+" changed");
        System.out.println(" ll after get and set value " +ll);


    }
}