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

    // this is task 2 g23v4108
    public List<String> Task2(List<String> ListString) {
        List<String> newlist = new ArrayList<>(); // creating a new array to take in  the string when the first character has been removed
        for(String str : ListString){
            if(str != null && !str.isEmpty()){ // now it is checking whether the string we wanna remove the first character in is mept or null
                newlist.add(str.substring(1));
            }
        }
        return newlist;
    }
   // this is task 3 -- g23s6277
   public boolean Task3(String string) {
    int count = 0;

    for (int i = 0; i < string.length(); i++) {
        char ch = string.charAt(i);

        if (ch == '(') {
            count++;
        } else if (ch == ')') {
            count--;
        }

        
        if (count < 0) {
            return false;
        }
    }

    
    return count == 0;
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
       // Task4 - @author: g22s5882
    public List<Integer> Task4(List<Integer> a, List<Integer> b) {
        if (a.size() != b.size()) {
            return null; // return null if sizes don't match
        }

        List<Integer> result = new ArrayList<>();
        int n = a.size();

        for (int i = 0; i < n; i++) {
            int product = a.get(i) * b.get(n - 1 - i);
            result.add(product);
        }

        return result;
    }

    // Task 6 - @author: g23s6707
    public List<Integer> Task6(List<Integer> integerList) {
        //Need to initialize a new list
        List<Integer> roundedList = new ArrayList<>();
        
        for (int num : integerList) {
            // Check if the number is already a multiple of 100
            if (num % 100 == 0) {
                roundedList.add(num);
            } else {
                // Otherwise, round it up to the next multiple of 100
                roundedList.add(((num / 100) + 1) * 100);
            }
        }
        return roundedList;
    }

}
