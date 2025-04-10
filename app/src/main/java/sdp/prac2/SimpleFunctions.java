package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {}

    // Task 1: by 22T4905
    public int Task1 (List<Integer> a, List<Integer> b) {
        // list a is a list of integers
        // list b is a list of indices

        int sum = 0;
        for (int i : b) // for each element in b
        {
           if (i >= 0 && i < a.size())
           {
               sum += a.get(i); // add the element(s) at index i in list a to sum
           }
        }
        return sum; // returns the sum of the elements in a at the indices specified in b
    }
}
