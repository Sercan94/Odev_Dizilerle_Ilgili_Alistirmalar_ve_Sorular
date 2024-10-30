package com.sercan;

import java.util.Scanner;

public class Odev_Soru2 {
    public static void main(String[] args) {
        /**
         * Bir yolculuk için toplam maliyeti hesaplayan kodu yazınız. Kurallar;
         * L: LPG için H: Hibrit için kullanılacaktır.
         * - Arabanın yaşı ve yolculuğun KM si için 2 tam sayı değeri alın  +
         * - Kullanıcı L veya H girmez ise hata verin
         * - Toplam maliyet motor tipine göre hesaplanacaktır
         * - LPG 100km de 3.3lt
         * - HIBRIT 100km de 4.2lt
         * - LPG yakıtı 1.6₺ 1 litre için
         * - Aracın yaşı 7 den küçük ve eşit ise toplam maliyeti yazdırmanız yeterli
         * - Arabanın yaşı 7 den fazla ve 12 ye eşit ve küçük ise maliyet %3 arttırılmalı
         * - Arabanın yaşı 12 de n büyük ise toplam maliyet %7 arttırılmalıdır.
         *
         *
         */

        int mesafe;
        float lpg, hibrit = 1.6F;
        do {
            System.out.println("Sistem çıkış yapmak için mesafe sorusuna cevap 0 yazın");
            Scanner sc = new Scanner(System.in);
            System.out.print("Yakıt tipini seçiniz (LPG : L  Hibrit : H) : ");
            String yakit = sc.nextLine();
            System.out.print("Lütfen arabanın yaşını giriniz : ");
            short arabaninyasi = sc.nextShort();
            System.out.print("Mesafeyi giriniz (km) : ");
            mesafe = sc.nextInt();

            switch (yakit.trim().toUpperCase()) {
                case "L":
                    float lMaliyelet = mesafe * (float) (1.6 * 3.3 / 100);
                    if (arabaninyasi <= 7) System.out.println("Toplam Maliyet : "+lMaliyelet+" tl");
                    if (arabaninyasi > 7 && arabaninyasi <= 12) System.out.println("Toplam Maliyet : "+(lMaliyelet*1.03)+" tl");
                    if (arabaninyasi > 12) System.out.println("Toplam Maliyet : " +(lMaliyelet*1.07)+" tl");
                    break;
                case "H":
                    float hMaliyet = mesafe * (float) (1.6 * 4.2 / 100);
                    if (arabaninyasi <= 7) System.out.println("Toplam Maliyet : "+hMaliyet+" tl");
                    if (arabaninyasi > 7 && arabaninyasi <= 12) System.out.println("Toplam Maliyet : "+(hMaliyet*1.03)+" tl");
                    if (arabaninyasi > 12) System.out.println("Toplam Maliyet : "+(hMaliyet*1.07)+" tl");
                    break;
                default:
                    System.out.println("Lütfen Lpg ise L Hibrit ise H yazınız . . .");
            }
        } while (mesafe!=0);


    }
}
