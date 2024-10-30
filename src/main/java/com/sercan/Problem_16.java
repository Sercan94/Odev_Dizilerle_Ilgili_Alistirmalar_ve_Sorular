package com.sercan;

import java.util.Scanner;

public class Problem_16 {
    public static void main(String[] args) {
        /**
         * 5 elemanlı bir dizi oluşturun, kullanıcıdan elemanları alın ve
         * bu dizinin ortalamasını hesaplayın.
         *
         */
        Scanner sc=new Scanner(System.in);
        int[] sayilar=new int[5];
        int toplam=0;
        for (int i=0;i< sayilar.length;i++){
            System.out.println(i+1+". sayıyı giriniz :");
            sayilar[i]=sc.nextInt();
            toplam+=sayilar[i];
        }
        float ort=(float)toplam/ sayilar.length;
        System.out.println("Girilen sayiların ortalaması : "+ort);
    }
}
