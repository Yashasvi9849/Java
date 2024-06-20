import java.util.*;
public class ArrayListtoArray{
    public static void main(String args[]){

        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(1);
        al.add(2);
        al.add(3);
        System.out.println(al);
        //Get the array
        Integer ia[] = new Integer[al.size()];
        ia = al.toArray(ia);

         int sum = 0,i;
         for(i = 0 ; i <= ia.length;i++)
             sum+=i;

         System.out.println(sum);

    }
}