package com.sercan;

import java.util.Scanner;

public class Odev_Soru5 {
    public static void main(String[] args) {
        /**
         * Elimizde şöyle bir liste var,
         * bu listeden şehir seçildiğinde ilgili şehirin plaka numarasını veren kodu yazınız.
         *
         * 01- Adana
         * 02- Adıyaman
         * 03- Ayfon
         * 10- Balıkesir
         * 11- Bilecik
         * 12- Bingöl
         * 13- Bitlis
         * 20- Denizli
         * Yukarıda verilen plaka kodlarını kullanacaksınız.
         * Örn:
         * Şehir adını giriniz: ADANA
         * Plaka: 01
         * Örn:
         * Şehir adını giriniz: BiTLis
         * Plaka: 13
         *
         *
         */
        String[] iller={"Adana","Adıyaman","Afyon","Ağrı","Amasya","Ankara","Antalya","Artvin",
                "Aydın","Balıkesir","Bilecik","Bingöl","Bitlis","Bolu","Burdur","Bursa","Çanakkale",
                "Çankırı","Çorum","Denizli"};
        String[] plakaKod={"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15",
        "16","17","18","19","20"};
        //int[] plakaKodd={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        Scanner sc=new Scanner(System.in);
        System.out.print ("Şehir adını giriniz :");
        String  il=sc.nextLine();
        String plaka = "0";
        for (int i=0;i<iller.length;i++){
            if (iller[i].equalsIgnoreCase(il)){
                plaka=plakaKod[i];
                break;
            }
        }
        System.out.println("Plaka kodu : "+plaka);



    }
}
