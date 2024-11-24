package ru.yuliayu.sort.service;

public class ActionArray {
    public static void filling (int[] array){
        for(int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random() * 18 - 5);
        }
    }

    public static void write(int[] array){
        for(int num : array){
            System.out.print(num + " ");
        }
        System.out.print("\n");
    }
}
