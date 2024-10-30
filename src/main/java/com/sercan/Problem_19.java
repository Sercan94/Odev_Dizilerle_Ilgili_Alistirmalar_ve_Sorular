package com.sercan;

import java.util.Scanner;

public class Problem_19 {
    public static void main(String[] args) {
        /**
         * Kullanıcıdan bir dizi alın ve dizide tekrar eden elemanları bulun
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen gireceğiniz dizinin boyutunu belirleyiniz : ");
        int adet=sc.nextInt();
        int[] dizi=new int[adet];
        for (int i=0;i< dizi.length;i++){
            System.out.print(i+1+" . sayıyı giriniz : ");
            dizi[i]=sc.nextInt();
        }


    }
}
