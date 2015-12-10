package com.becker.strings;

/**
 * Created by michael on 12/9/2015.
 */
public class StringQuestions {

    public void rotateArray(int[] array, int k){
        int arraySize = array.length;

        int[] result = new int[arraySize];

        for(int i=0; i < arraySize; i++){
            result[(i+k)%arraySize] = array[i];
        }

        for(int i=0; i < arraySize; i++){
           System.out.print("[" + result[i] + "] ");
        }
    }


}
