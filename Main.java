package interfejsy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Main main = new Main();
        Computation computation;

        if (main.shouldMultiply()) {
            computation = new Multiplication();
        } else {
            computation = new Addition();
        }

        double argument1 = main.getArgument();
        double argument2 = main.getArgument();

        double result = computation.compute(argument1, argument2);
        System.out.println("Wynik: " + result);
    }

    Scanner sc = new Scanner(System.in);

    private boolean shouldMultiply() {
        boolean wrongInput = true;
        int option = 0;
        while (wrongInput) {
            System.out.println("Wybierz działanie:");
            System.out.println("\"1\" - mnożenie");
            System.out.println("\"2\" - dodawanie");
            option = sc.nextInt();
            sc.nextLine();
            if (option != 1 && option != 2) {
                System.out.println("Nieporawny wybór, spróbuj jeszcze raz");
            } else {
                wrongInput = false;
            }
        }
        if (option == 1){
            return true;
        } else {
            return false;
            }
    }
        private double getArgument() {
        System.out.println("Podaj liczbę:");
        double argument = sc.nextDouble();
        return argument;

    }
}
