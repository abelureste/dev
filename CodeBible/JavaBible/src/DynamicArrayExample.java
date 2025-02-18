import java.util.ArrayList;

public class DynamicArrayExample {
    public static void main (String[] args) {
        ArrayList<Integer> dynamicArray = new ArrayList<Integer>();
        dynamicArray.add(12);
        dynamicArray.add(24);
        dynamicArray.add(36);
        dynamicArray.add(48);

        System.out.println(dynamicArray.size());
        System.out.println(dynamicArray.get(2));

        dynamicArray.removeFirst();

        System.out.println(dynamicArray.get(2));
        System.out.println(dynamicArray.getLast());

        dynamicArray.remove(2);
        dynamicArray.add(60);

        System.out.println(dynamicArray);
    }
}
