package pl.lublin.wsei.java.cwiczenia;

import java.util.Scanner;

/**@serial
 * @author W S M */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1;
        String d;
        String e;
            System.out.print("Podaj liczbę w systemie dziesiętnym, którą mam wypisać: ");
            num1 = input.nextInt();
        d = Integer.toHexString(num1);
        e = Integer.toBinaryString(num1);
        System.out.println("DEC = " + num1);
        System.out.println("HEX = " + d);
        System.out.println("BIN = " + e);

    }
}
