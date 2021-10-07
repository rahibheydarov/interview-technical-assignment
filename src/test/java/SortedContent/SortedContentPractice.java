package SortedContent;

import java.util.ArrayList;
import java.util.List;

public class SortedContentPractice {

    public static void main(String[] args) {

        int[] arr = {90, 0, 5, 985, 69036};
        System.out.println("sortingArrayAsc(arr) = " + sortingArrayAsc(arr));
        System.out.println("sortingArrayDesc(arr) = " + sortingArrayDesc(arr));

    }

    /*
    This method will sort an int array in ascending order without using the sort method of the Array class
    And will return the sorted version in a List
     */
    public static List<Integer> sortingArrayAsc(int[] arr) {

        //Creating a new list of Integer to get the each int content of given array
        ArrayList<Integer> list = new ArrayList();

        //By using for each loop, we will add the elements of array to our new List
        for ( int each : arr ) {
            list.add(each);
        }

        /*
        We need a loop to check every single element inside the list
        The purpose of nested loop is to compare the elements before sorting.

        Both loops will;
            - start from the index 0 and
            - go to the last element

        These loops will stop once the comparison happens completely
         */
        for ( int i = 0; i < list.size(); i++ ) {
            /*
            First loop will start from index 0 and go to index 1 and the others, once nested loop complete its cycle*.

            *Cycle will be completed when it checks every single element in the list
             */
            for ( int j = 0; j < list.size(); j++ ) {
                /*
                Nested loop starts from index 0 and compare it with the outsider loop's element at index 0.
                This loop will check every single element and compare them with the first index.
                Once the cycle is completed, first loop will go to 1st index
                while nested loop still checking from the beginning till the end.
                 */
                if (list.get(i) < list.get(j)) {
                    //If the element at i index is smaller than the element at j index
                    Integer temp = list.get(i);
                    //Store it into new Integer
                    list.set(i, list.get(j));
                    //Set the i index with the value of element at j index
                    list.set(j, temp);
                    //Set the j index with the value of temp element
                }
            }
        }

        return list;
    }

    /*
    This method will sort an int array in descending order without using the sort method of the Array class
    And will return the sorted version in a List

    This method's logic is same with the sortingArrayAsc() method. The only difference, it compares the element by how large it is.
     */
    public static List<Integer> sortingArrayDesc(int[] arr) {

        ArrayList<Integer> list = new ArrayList();
        for ( int each : arr ) {
            list.add(each);
        }

        for ( int i = 0; i < list.size(); i++ ) {
            for ( int j = 0; j < list.size(); j++ ) {
                if (list.get(i) > list.get(j)) {
                    Integer temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }

        return list;
    }
}
