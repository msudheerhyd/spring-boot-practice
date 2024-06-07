package blind75;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

    public static void main(String[] args) {
        List <Integer> result = new LinkedList<>();
        result.add(1);
        result.add(2);
        result.add(3);
        result.add(4);
        result.add(0, 9);
        System.out.println(result);
    }
}
