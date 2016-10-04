package com.tertiaryinfotech;
import java.lang.*;
import java.util.Arrays;

public class ArrayAPI {

    public static void main(String[] args) {
        int[] numbers = {5, 3, 17, 25, 4, 33, 45, 12};
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        boolean[] responses = {true, false, false, true, true};
        boolean[] responses2 = {false, true, false, true, true};

        System.out.println("Before sorting: "+ Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("After sorting: "+ Arrays.toString(numbers));

    }
}
