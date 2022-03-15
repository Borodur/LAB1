package pl.lublin.wsei.java.cwiczenia;

import mylib.Account;

import java.util.Random;
import java.util.Scanner;

/**@serial
 * @author W S M */
public class Main {


    public static void main(String[] args) {
        Account acc = new Account();
        acc.name = "Piotr Gołabek";
        System.out.println(acc.getName());

    }
}