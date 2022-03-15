package pl.lublin.wsei.java.cwiczenia;

import mylib.Account;

/**@serial
 * @author W S M */
public class Main {


    public static void main(String[] args) {

        Account acc = new Account();
        acc.setName("piotr Gołabek");
        System.out.println(acc.getName());
        System.out.printf("%s%n",Account.capitalize("stanisŁaw maruSARz"));
    }
}