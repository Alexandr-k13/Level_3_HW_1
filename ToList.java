package geekbrains;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToList {
    public static <T> List<T> toArrayList(T[]arr) {
        String[] array = {"A","B","C"};
        List<T>list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++);
        {
            list.add(arr[1]);
        }
        return list;
    }
}