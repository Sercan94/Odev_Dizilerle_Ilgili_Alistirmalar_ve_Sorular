package com.sercan;

import java.util.Scanner;

public class Problem_17 {
    public static void main(String[] args) {
        /**
         * Bir dizideki en küçük elemanı ve indeksini bulan bir program yazın.
         *
         */
        int[] sayilar;
        Scanner sc=new Scanner(System.in);
        System.out.print("Kaç adet sayı oluşturmak istiyorsunuz : ");
        int toplamSayi=sc.nextInt();
        sayilar=new int[toplamSayi];
        int sayi;

        for (int i=0;i<toplamSayi;i++){
            System.out.print(i+1+". sayiyi girin :");
            sayi=sc.nextInt();
            sayilar[i]=sayi;
        }
        int enk=sayilar[0];
        int enkIndex=0;
            for (int i=0;i<toplamSayi;i++){
                if (enk>sayilar[i]) {
                    enk=sayilar[i];
                    enkIndex=i;
                }

            }

        System.out.println("En Küçük sayi : "+enk);
        System.out.println("En küçük sayinin indexi : "+enkIndex);



    }
}
