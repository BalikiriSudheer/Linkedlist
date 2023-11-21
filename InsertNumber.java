package com.linked3;

import java.util.ArrayList;
import java.util.List;

public class InsertNumber {
    public static void main(String[] args) {

        List<Integer> sequence = new ArrayList<>();
        sequence.add(56);
        sequence.add(70);


        int numberToInsert = 30;


        int indexToInsert = 1;


        sequence.add(indexToInsert, numberToInsert);

        
        System.out.println("Final Sequence:");
        for (Integer num : sequence) {
            System.out.print(num + "->");
        }
    }

}
