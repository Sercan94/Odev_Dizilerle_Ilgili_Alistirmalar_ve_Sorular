package com.sercan;

import java.util.Scanner;

public class Odev_Soru3 {
    public static void main(String[] args) {
        /**
         *  Kübik number ları yazdıracaksınız ancak ekranda çıktılandığı şekilde olması istenmektedir
         *
         * Örn:
         * Bir sayı giriniz…: 5
         * Sayı 1:125
         * Sayi 2:64
         * Sayi 3:27
         * Sayi 4:8
         * Sayi 5:1
         *
         */
        int sayi;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz : ");
        sayi=scanner.nextInt();
        for (int i=sayi;i>=1;i--) {
            int küp=i*i*i;
            System.out.println("Sayı . . . :" + (sayi-i+1) + " : "+küp );

        }

    }
}
