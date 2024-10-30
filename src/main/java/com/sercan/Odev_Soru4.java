package com.sercan;

import java.util.Scanner;

public class Odev_Soru4 {
    public static void main(String[] args) {
        /**
         * Kullanıcıdan 0-100 arası bir sayı girmesini isteyeceksiniz.
         * Bu sayılar dışında bir değer girer ise girilen sayı sınır dışında bir sayıdır uyarısı vereceksiniz.
         * Temel kural olarak Kullanıcının girdiği geçerli sayıların toplamı 100 ü geçtiğinde sayı istemeyi durduracaksınız.
         * Kullanıcıdan alınan sayıların en büyük olanı, en küçük olanı ve ortalamasını hesaplayan kodu yazınız.
         *
         * Örn:
         * Sayı gir…: 5
         * Sayı gir…: 12
         * Sayı gir…: 55
         * Sayı gir…: 43
         * Max: 55
         * Min: 5
         * Ort: 28.75
         *
         * Örn:
         * Sayı gir…: 95
         * Sayı gir…: 105
         * Girilen sayı aralık dışı
         * Sayı gir…: 1
         * Sayı gir…: 5
         * Max: 95
         * Min: 1
         * Ort: 33,666666666664
         */
        int toplam=0;
        int sayi;
        int enb = 0,enk=0;
        boolean ilkGirilenSayi=true;
        int girilenSayilar = 0;


        while (true){
            System.out.print("Sayı gir... : ");
            Scanner sc=new Scanner(System.in);
            sayi=sc.nextInt();
            if (sayi>0  && sayi<100 ){
                toplam+=sayi;
                girilenSayilar++;
                if (ilkGirilenSayi){
                    enb=sayi;
                    enk=sayi;
                    ilkGirilenSayi=false;
                }else {
                    if (sayi > enb)
                        enb=sayi;
                    if (sayi < enk)
                        enk=sayi;
                }
            if (toplam>100)break;

            }else
                System.out.println("Girilen sayı sınır dışında bir sayıdır.Lütfen 0-100 aralığında bir sayı giriniz. . . ");
        }
        float ort=(float)toplam/girilenSayilar;
        System.out.println("En büyük değer : "+enb);
        System.out.println("En küçük değer : "+enk);
        System.out.println("Ortalama : "+ort);




    }
}
