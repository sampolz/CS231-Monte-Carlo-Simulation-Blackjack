/*
 * Sam Polyakov
 * CS231
 * Lab 1
 * 02/06/2023
 */

import java.util.ArrayList;
import java.util.Random;

public class Shuffle {
    public static void main(String[] args){
        ArrayList<Integer> arr0 = new ArrayList<Integer>();
        Random rand = new Random();

        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        // ArrayList<Integer> arr2 = arr0;
        ArrayList<Integer> arr3 = new ArrayList<Integer>();

        for(int i = 0; i < 10; i++){
            int randomNumber = rand.nextInt(100);
            arr0.add(randomNumber);
            arr1.add(randomNumber);

        }
        // System.out.println(arr0);
        // System.out.println(arr1);
        // System.out.println(arr2);

        // System.out.println("arr0 == arr1: " + (arr0 == arr1) + "\narr1 == arr2: " + (arr1 == arr2) + "\narr2 == arr0: " + (arr2 == arr0));
        // System.out.println("arr0.equals(arr1): " + (arr0.equals(arr1)) + "\narr1.equals(arr2): " + (arr1.equals(arr2)) + "\narr2.equals(arr0): " + (arr2.equals(arr0)));

        for(int j=0; j<10; j++){
            int randomIndex = rand.nextInt(arr0.size());
            int val1 = arr0.get(randomIndex);
            arr0.remove(randomIndex);
            // System.out.println(val1+" "+arr0);

            arr3.add(val1);
            System.out.println(arr3);
        }


    }
}