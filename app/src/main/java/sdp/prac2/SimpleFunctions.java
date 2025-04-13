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

    //Task5 - @author : g23r5770
    public boolean Task5(List<Integer> list ){ 
        //iterate through the list
        for(int i = 0 ; i <list.size()-1;i++){
            //if the number being checked first is greater than the number after it than it is not sorted
            if(list.get(i)>list.get(i+1)){ return false;}
        }
        //otherwise true
        return true;
    }
}
