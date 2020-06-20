package com.company;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // 52^2=2704*3=5408
        while (true) {
            System.out.println("Введите кол-во символов:");
            int alphabet = scanner.nextInt();
            int stepen = 1;
            int kolCifer = 2;

            int delenie = 1024;
            int count = 1;

            long z1 = ((long) Math.pow(alphabet, stepen) * kolCifer);
            long z2 = ((long) Math.pow(alphabet, ++stepen) * ++kolCifer);
            long z3 = ((long) Math.pow(alphabet, ++stepen) * ++kolCifer);
            long z4 = ((long) Math.pow(alphabet, ++stepen) * ++kolCifer);
            long z5 = ((long) Math.pow(alphabet, ++stepen) * ++kolCifer);
            long z6 = ((long) Math.pow(alphabet, ++stepen) * ++kolCifer);
            long z7 = ((long) Math.pow(alphabet, ++stepen) * ++kolCifer);
            long z8 = ((long) Math.pow(alphabet, ++stepen) * ++kolCifer);
            long z9 = ((long) Math.pow(alphabet, ++stepen) * ++kolCifer);
            long z10 = ((long) Math.pow(alphabet, ++stepen) * ++kolCifer);



/*        System.out.println("1 знач: " + ((long) Math.pow(alphabet, stepen) * kolCifer) + " байт");
        System.out.println("2 знач: " + ((long) Math.pow(alphabet, ++stepen) * kolCifer++) + " байт");
        System.out.println("3 знач: " + ((long) Math.pow(alphabet, ++stepen) * kolCifer++) + " байт");
        System.out.println("4 знач: " + ((long) Math.pow(alphabet, ++stepen) * kolCifer++) + " байт");
        System.out.println("5 знач: " + ((long) Math.pow(alphabet, ++stepen) * kolCifer++) + " байт");
        System.out.println("6 знач: " + ((long) Math.pow(alphabet, ++stepen) * kolCifer++) + " байт");
        System.out.println("7 знач: " + ((long) Math.pow(alphabet, ++stepen) * kolCifer++) + " байт");
        System.out.println("8 знач: " + ((long) Math.pow(alphabet, ++stepen) * kolCifer++) + " байт");
        System.out.println("9 знач: " + ((long) Math.pow(alphabet, ++stepen) * kolCifer++) + " байт");
        System.out.println("10 знач: " + ((long) Math.pow(alphabet, ++stepen) * kolCifer++) + " байт");*/


            System.out.println(String.format("%d знач. = %d байт, или %d кб, или %d мб, или %d гб, или %d тб, или %d пб", count++,
                    z1, z1 / delenie, z1 / delenie / delenie, z1 / delenie / delenie / delenie, z1 / delenie / delenie / delenie / delenie, z1 / delenie / delenie / delenie / delenie / delenie));

            System.out.println(String.format("%d знач. = %d байт, или %d кб, или %d мб, или %d гб, или %d тб, или %d пб", count++,
                    z2, z2 / delenie, z2 / delenie / delenie, z2 / delenie / delenie / delenie, z2 / delenie / delenie / delenie / delenie, z2 / delenie / delenie / delenie / delenie / delenie));

            System.out.println(String.format("%d знач. = %d байт, или %d кб, или %d мб, или %d гб, или %d тб, или %d пб", count++,
                    z3, z3 / delenie, z3 / delenie / delenie, z3 / delenie / delenie / delenie, z3 / delenie / delenie / delenie / delenie, z3 / delenie / delenie / delenie / delenie / delenie));

            System.out.println(String.format("%d знач. = %d байт, или %d кб, или %d мб, или %d гб, или %d тб, или %d пб", count++,
                    z4, z4 / delenie, z4 / delenie / delenie, z4 / delenie / delenie / delenie, z4 / delenie / delenie / delenie / delenie, z4 / delenie / delenie / delenie / delenie / delenie));

            System.out.println(String.format("%d знач. = %d байт, или %d кб, или %d мб, или %d гб, или %d тб, или %d пб", count++,
                    z5, z5 / delenie, z5 / delenie / delenie, z5 / delenie / delenie / delenie, z5 / delenie / delenie / delenie / delenie, z5 / delenie / delenie / delenie / delenie / delenie));

            System.out.println(String.format("%d знач. = %d байт, или %d кб, или %d мб, или %d гб, или %d тб, или %d пб", count++,
                    z6, z6 / delenie, z6 / delenie / delenie, z6 / delenie / delenie / delenie, z6 / delenie / delenie / delenie / delenie, z6 / delenie / delenie / delenie / delenie / delenie));

            System.out.println(String.format("%d знач. = %d байт, или %d кб, или %d мб, или %d гб, или %d тб, или %d пб", count++,
                    z7, z7 / delenie, z7 / delenie / delenie, z7 / delenie / delenie / delenie, z7 / delenie / delenie / delenie / delenie, z7 / delenie / delenie / delenie / delenie / delenie));

            System.out.println(String.format("%d знач. = %d байт, или %d кб, или %d мб, или %d гб, или %d тб, или %d пб", count++,
                    z8, z8 / delenie, z8 / delenie / delenie, z8 / delenie / delenie / delenie, z8 / delenie / delenie / delenie / delenie, z8 / delenie / delenie / delenie / delenie / delenie));

            System.out.println(String.format("%d знач. = %d байт, или %d кб, или %d мб, или %d гб, или %d тб, или %d пб", count++,
                    z9, z9 / delenie, z9 / delenie / delenie, z9 / delenie / delenie / delenie, z9 / delenie / delenie / delenie / delenie, z9 / delenie / delenie / delenie / delenie / delenie));

            System.out.println(String.format("%d знач. = %d байт, или %d кб, или %d мб, или %d гб, или %d тб, или %d пб", count++,
                    z10, z10 / delenie, z10 / delenie / delenie, z10 / delenie / delenie / delenie, z10 / delenie / delenie / delenie / delenie, z10 / delenie / delenie / delenie / delenie / delenie));

            System.out.println();

        }
    }
}