package ru.yuliayu.sort.util;

public class Bubble {
    public static void bubbleSort(int[] array, int length){
        for(int i = 0; i < length; i++){
            for(int j = i; j < length; j++){
                if(array[i] > array[j]){
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
}
