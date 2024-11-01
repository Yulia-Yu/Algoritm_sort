package ru.yuliayu.sort.util;

public class Sheker {
    public static int[] shekerSort(int[] array, int length){
        int left = 0;
        int right = length - 1;
        while (left < right){
            for(int i = left; i < right; i++){
                if(array[i] > array[i + 1]){
                    int tmp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = tmp;
                }
            }
            right--;
            for(int j = right; j > left; j--){
                if(array[j] < array[j - 1]){
                    int tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                }
            }
            left++;
        }
        return array;
    }
}
