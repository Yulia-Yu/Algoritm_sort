package ru.yuliayu.sort._main;

import ru.yuliayu.sort.service.ActionArray;
import ru.yuliayu.sort.util.Bubl;

public class _Main {
    public static void main(String[] avg){
        int length = 10;
        int[] mas = new int[length];
        mas = ActionArray.filling(mas);
        ActionArray.write(mas);
        Bubl.sort(mas, length);
        ActionArray.write(mas);

        //Планируется добавить еще сортировки

    }
}
