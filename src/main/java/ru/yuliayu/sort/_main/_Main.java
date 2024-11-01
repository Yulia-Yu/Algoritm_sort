package ru.yuliayu.sort._main;

import ru.yuliayu.sort.service.ActionArray;
import ru.yuliayu.sort.util.Bubl;
import ru.yuliayu.sort.util.Sheker;

public class _Main {
    public static void main(String[] avg){
        int length = 10;
        System.out.println("Сортировка пузырьком:");
        int[] mas = new int[length];
        mas = ActionArray.filling(mas);
        ActionArray.write(mas);
        Bubl.sort(mas, length);
        ActionArray.write(mas);
        System.out.println("Сортировка шейкер:");
        int[] masSh = new int[length];
        masSh = ActionArray.filling(masSh);
        ActionArray.write(masSh);
        Sheker.shekerSort(masSh, length);
        ActionArray.write(masSh);

        //Планируется добавить еще сортировки

    }
}
