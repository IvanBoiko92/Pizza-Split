package com.epam.rd.autotasks.pizzasplit;
import java.util.Scanner;
public class PizzaSplit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = scanner.nextInt();
        int pieces = scanner.nextInt();
        int pizzas = 0;
        boolean k = true;
        while (k){
            ++pizzas;
            int d = (pizzas*pieces)%people;
            if (d == 0){
                k = false;
            }
        }
        //int d = (pizzas*pieces)%people;
        System.out.println(pizzas);
    }
}
