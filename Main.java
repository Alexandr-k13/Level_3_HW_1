package geekbrains;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


// task 1
public class Main {

    public static void main(String[] args) {
        Integer arr1[] = {2, 5, 7, 8, 9, 4};
       // String arr2[] = {"А", "Б", "В", "Г"};
        swap(arr1, 2, 3);
    }

    public static void swap(Integer[] arr, int n1, int n2) {
        Integer sw = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = sw;
        System.out.println(Arrays.toString(arr));
    }
}








