package ru.yuliayu.sort._main;

import ru.yuliayu.sort.service.ActionArray;
import ru.yuliayu.sort.util.Bubble;
import ru.yuliayu.sort.util.Sheker;

public class _Main {
    public static void main(String[] avg){
        int length = 10;
        System.out.println("Сортировка пузырьком:");
        int[] array = new int[length];
        ActionArray.filling(array);
        ActionArray.write(array);
        Bubble.bubbleSort(array, length);
        ActionArray.write(array);
        System.out.println("Сортировка шейкер:");
        int[] arraySh = new int[length];
        ActionArray.filling(arraySh);
        ActionArray.write(arraySh);
        Sheker.shekerSort(arraySh, length);
        ActionArray.write(arraySh);

        //Планируется добавить еще сортировки

    }
}
