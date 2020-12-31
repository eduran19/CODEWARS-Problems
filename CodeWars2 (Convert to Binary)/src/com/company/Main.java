package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
//Bir sayının binary değerini gösteren kod.
public class Main {
    public static int toBinary(int n) {
        ArrayList<Integer> kalan = new ArrayList<>();

        while (n >= 1) {

            if (n == 1) {
                kalan.add(1);
                break;
            }
            kalan.add(n % 2);
            n = n / 2;
        }
        Collections.reverse(kalan);
        for (int i = 0; i < kalan.size(); i++) {
            System.out.print(kalan.get(i));

        }
        return n;
    }

    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Binary değerini öğrenmek istediğiniz sayıyı giriniz!");
    int sayı=scan.nextInt();
    toBinary(sayı);
    }
}
