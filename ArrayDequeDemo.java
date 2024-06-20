import java.util.ArrayDeque;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class ArrayDequeDemo{
    public static void main(String args[]){
        ArrayDeque<String> adq = new ArrayDeque<String>();
        adq.push("D");
        adq.push("A");
        adq.push("N");
        adq.push("C");

        while(adq.peek() != null)
            System.out.print(adq.pop());

        System.out.println(" ");

    }
}