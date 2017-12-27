package com.company;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        System.out.println("Faktoriyelini almak istediginiz sayiyi giriniz.");
        Scanner scanner = new Scanner(System.in);
        int faktoriyel = scanner.nextInt();
        int sonuc = 1;
        //Aldigimiz sayidan for dongusunun icinde geriye dogru sayarak i degiskenini sonucla carpip esitliyoruz.
        for (int i = faktoriyel; i > 0 ; i--) {
            sonuc=sonuc*i;

        }
        System.out.println(sonuc);
    }
}
