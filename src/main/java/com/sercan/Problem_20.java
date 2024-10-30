package com.sercan;

public class Problem_20 {
    public static void main(String[] args) {
        /**
         * 10 elemanlı bir dizide yalnızca çift sayıları ekrana yazdıran bir program yazın.
         *
         */
        int[] dizi={3,5,8,9,85,74,68,35,28,64};
        for (int i=0;i< dizi.length;i++){
            if (dizi[i]%2==0) System.out.println(dizi[i]);
        }
    }
}
