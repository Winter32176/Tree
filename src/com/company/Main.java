package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter width:");
        int TreeWidth = scan.nextInt();

        int howmanystars = 0;
        int howmanyspaces = TreeWidth;


        for (int i = 0; i < TreeWidth; i++) {

            howmanyspaces--;


            howmanystars++;


            for (int j = 0; j < howmanyspaces; j++) {
                System.out.print(" ");//repeat
            }


            for (int z = 0; z < howmanystars; z++) {
                System.out.print(" ");
                System.out.print("*");
            }


            System.out.println();
        }


    }
}
