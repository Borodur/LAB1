package pl.lublin.wsei.java.cwiczenia;

import mylib.Account;

/**@serial
 * @author W S M */
public class Main {


    public static void main(String[] args) {

        Account acc = new Account();
        acc.setName("piotr gołabek");
        System.out.println(acc.getName());
    }
}