package TP30;

import java.util.Scanner;

public class SafeScanner {
    Scanner scanner;

    public SafeScanner() {
        scanner = new Scanner(System.in);
    }

    public int nextInt() {
        while (!scanner.hasNextInt()) {
            System.out.println("S'il vous plaît, saisis un entier");
            scanner.next();
        }
        return scanner.nextInt();
    }
}
