package com.company;

import java.util.ArrayList;
/*Göreviniz, n adet küp yığını olacak bir bina inşa etmektir.
 En alttaki küpün hacmi n ^ 3 olacak, yukarıdaki küpün hacmi (n-1) ^ 3 olacak
 ve üstteki 1 ^ 3 hacme sahip olana kadar bu şekilde devam edecek.
Binanın toplam hacmi m verilir. M verildiğinde, inşa etmeniz gereken
 n küp sayısını bulabilir misiniz?  (m=1071225L için)*/

public class Main {
    public static void findNb(long m) {
        ArrayList<Integer> sayılar=new ArrayList<>();
        long sayı=1;
        long toplam=0;
        while(true){
            toplam+=sayı*sayı*sayı;
            sayılar.add((int) sayı);
            if(toplam==m){
                break;
            }
            sayı++;
        }
        int n=sayılar.size();
        System.out.println(n);
    }
    public static void main(String[] args) {
	  findNb( 1071225L);

    }
}
