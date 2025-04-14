/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sdp.prac2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

class AppTest {

    //       Task 2 Tests
     @Test
    public void testTask2_removesFirstCharacter() {
        SimpleFunctions sf = new SimpleFunctions();
        List<String> input = Arrays.asList("Apple", "Banana", "Cat");
        List<String> expected = Arrays.asList("pple", "anana", "at");
        assertEquals(expected, sf.Task2(input));
    }

    @Test
    public void testTask2_ignoresEmptyStrings() {
        SimpleFunctions sf = new SimpleFunctions();
        List<String> input = Arrays.asList("", "A", "", "Dog");
        List<String> expected = Arrays.asList("", "og");
        assertEquals(expected, sf.Task2(input));
    }


    //      TASK6 TESTS      //
    @Test
    void testAlreadyMultiplesOf100() {
        // Test when the list contains only multiples of 100
        List<Integer> input = Arrays.asList(100, 200, 300);
        List<Integer> expected = Arrays.asList(100, 200, 300);
        assertEquals(expected, Task6(input));
    }

    @Test
    void testNonMultiplesOf100() {
        // Test when the list contains numbers not multiples of 100
        List<Integer> input = Arrays.asList(101, 250, 399);
        List<Integer> expected = Arrays.asList(200, 300, 400);
        assertEquals(expected, Task6(input));
    }

    @Test
    void testMixedList() {
        // Test when the list contains both multiples and non-multiples of 100
        List<Integer> input = Arrays.asList(100, 150, 299);
        List<Integer> expected = Arrays.asList(100, 200, 300);
        assertEquals(expected, Task6(input));
    }

    @Test
    void testEmptyList() {
        // Test when the list is empty
        List<Integer> input = Arrays.asList();
        List<Integer> expected = Arrays.asList();
        assertEquals(expected, Task6(input));
    }
// Task 5 Tests
     @Test
    void testSortedList() {
        // Test when the list is already sorted
        List<Integer> input = Arrays.asList(100, 200, 300);
        assertTrue(sf.Task5(input));
    }

    @Test
    void testUnsortedList() {
        // Test when the list is not sorted
        List<Integer> input = Arrays.asList(300, 200, 100);
        assertFalse(sf.Task5(input));
    }



}


