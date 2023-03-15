package src.collections;

import java.util.ArrayList;

public class PrimitiveWrappers {

    public static void main(String[] args) {

        var numbers = new ArrayList<Integer>();

        // Boxing: int-Werte in dieser Arraylist werden automatisch Objekte der Wrapper-Klasse Integer
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println(numbers);
        System.out.println(numbers.get(0));
        System.out.println(numbers.get(0).getClass());

        // Unboxing: Integer-Objekt wird einem primitiven Datentyp int zugewiesen
        int x = numbers.get(0);

        System.out.println(numbers.contains(3));
    }
}
