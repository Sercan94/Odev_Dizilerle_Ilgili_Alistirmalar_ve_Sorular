package com.sercan;

import java.util.Scanner;

public class Odev_Soru1 {
    public static void main(String[] args) {
        /**
         *  Bir kişinin öğrencilik süresini alıp hangi okul döneminde olduğunu söyleyen kodu yazınız.
         *
         * <5. “Elemantary School”
         *
         * 5<= gradle <8 ”Junior School”
         *
         * 8<= gradle <10 “High School”
         *
         * >=10 “College”
         *
         * <0 “NONE”
         *
         */
        Scanner scanner=new Scanner(System.in);
        byte ogrSuresi;
        do {

            System.out.print("Öğrencilik sürenizi giriniz : ");
            ogrSuresi=scanner.nextByte();
            if (ogrSuresi>0 && ogrSuresi<5){
                System.out.println("Elemantary School");
            } else if (ogrSuresi<=5 && ogrSuresi<8) {
                System.out.println("Junior School");
            } else if (ogrSuresi<=8 && ogrSuresi <10) {
                System.out.println("High School");
            }else if (ogrSuresi>=10){
                System.out.println("College");
            } else if (ogrSuresi<0) {
                System.out.println("NONE");
            }
        }while (ogrSuresi!=0);


    }
}
