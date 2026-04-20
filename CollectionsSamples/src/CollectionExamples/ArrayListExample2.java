package CollectionExamples;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample2 {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        System.out.println("ArrayList size :" + al.size());

        al.add(1);
        al.add(0, 2); 
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);
        al.add(7);
        al.add(8);
        al.add(9);

        System.out.println("ArrayList size :" + al.size());
        System.out.println(al);

        al.remove(5); 
        System.out.println(al);

        Integer ia[] = new Integer[al.size()];
        ia = al.toArray(ia);

        int sum = 0;
        for (int i : ia) {
            sum += i;
        }
        System.out.println("Sum = " + sum);

        Collections.sort(al); 
        System.out.println("Sorted list: " + al);

        int Max = Collections.max(al);
        System.out.println("Max = " + Max);
    }
}