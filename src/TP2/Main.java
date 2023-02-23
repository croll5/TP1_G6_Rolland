package TP2;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        int[] tab1 = { 1, 2, 3, 4, 5, 6, 7, 8 };
        System.out.println(
                "Quel exercice ? Saisissez :\n1. Discriminant\n2. Parité d’un nombre\n3. Calcul d’extremum\n4. Égalité entre chaînes de caractères\n5. Factorielle\n6. Compte à rebours\n7. Valeurs de carrés\n8. Table de multiplication\n9. Division d’entiers\n10. Règle graduée\n11. Nombres premiers\n12. Manipulations sur un tableau");
        Scanner scanner = new Scanner(System.in);
        int choix = scanner.nextInt();
        switch (choix) {
            case 1:
                discriminant();
                break;
            case 2:
                parite();
                break;
            case 3:
                System.out.println("Voulez vous : \n1. Le maximum\n2. Le minimum");
                if (scanner.nextInt() == 1) {
                    max();
                } else {
                    min();
                }
                break;
            case 4:
                egaliteStr();
                break;
            case 5:
                factorielle();
                break;
            case 6:
                countdown();
                break;
            case 7:
                carres(tab1);
                break;
            case 8:
                tableMultiplication();
                break;
            case 9:
                division();
                break;
            case 10:
                regle();
                break;
            case 11:
                nombrePremier();
                break;
            case 12:
                initialisationTableau();
                break;
            default:
                System.out.println("Nous ne trouvons aucun programme qui corresponde à votre recherche :/");
                break;
        }
    }

    /**
     * Fonction de complexité n² qui renvoie vrai si val est la somme de deux
     * elements du tableau
     * 
     * @param integers
     * @param val
     * @return
     */
    public static boolean inBinarySumInArray(int[] integers, int val) {
        for (int i = 0; i < integers.length; i++) {
            for (int j = 0; j < integers.length; j++) {
                if (i != j && integers[i] + integers[j] == val) {
                    return true;
                }
            }
        }
        return false;
    }

    /* La même fonction mais en O(n) */
    public static boolean inBinarySumInArrayOpti(int[] integers, int val) {
        Set<Integer> set = new HashSet<>();
        for (int i : integers) {
            if (set.contains(val - i)) {
                return true;
            } else {
                set.add(i);
            }
        }
        return false;
    }

    public static boolean inBinarySumInArraySentinelle(int[] integers, int val) {
        Arrays.sort(integers); // nlog(n)
        int a = 0;
        int b = integers.length - 1;
        while (a < b) {
            if (integers[a] + integers[b] == val) {
                return true;
            } else if (integers[a] + integers[b] > val) {
                b--;
            } else {
                a++;
            }
        }
        return false;
    }

    public static void discriminant() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle est la valeur de a ?");
        int a = scanner.nextInt();
        System.out.println("Quelle est la valeur de b ?");
        int b = scanner.nextInt();
        System.out.println("Quelle est la valeur de c ?");
        int c = scanner.nextInt();

        int delta = (int) (Math.pow(b, 2) - 4 * a * c);

        if (delta < 0) {
            System.out.print("Ce polynome admet deux racines complexes : (");
            System.out.print((-b) + " + " + Math.floor(Math.sqrt(-delta) * 100) / 100 + "i)/" + 2 * a);
            System.out.print(" et (");
            System.out.println((-b) + " - " + Math.floor(Math.sqrt(-delta) * 100) / 100 + "i)/" + 2 * a);

        } else if (delta == 0) {
            int r0 = -b / (2 * a);
            System.out.println("Ce polynome admet une racine double : " + r0);
        } else {
            double r1 = (-b - Math.sqrt(delta)) / 2 * a;
            double r2 = (-b + Math.sqrt(delta)) / 2 * a;
            System.out.println("Ce polynome admet deux racines : " + r1 + " et " + r2);
        }
    }

    public static void parite() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un nombre entier :");
        long n = scanner.nextLong();
        String parite;
        if (n % 2 == 0) {
            parite = "pair";
        } else {
            parite = "impair";
        }
        System.out.println("Le nombre " + n + " est " + parite);
    }

    public static void max() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir deux entiers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a > b) {
            System.out.println("Le maximum des nombres saisis est " + a);
        } else {
            System.out.println("Le maximum des nombres saisis est " + b);
        }
    }

    public static void min() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir deux entiers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a < b) {
            System.out.println("Le minimum des nombres saisis est " + a);
        } else {
            System.out.println("Le minimum des nombres saisis est " + b);
        }
    }

    public static void egaliteStr() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez une chaîne de caractères :");
        String a = scanner.nextLine();
        System.out.println("Entrez-en une autre :");
        String b = scanner.nextLine();
        if (a.equals(b)) {
            System.out.println("Ces deux chaînes de caractères sont identiques");
        } else {
            System.out.println("Ces deux chaînes de caractères sont différentes");
        }
    }

    public static void factorielle() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un entier positif ou nul");
        BigInteger n = scanner.nextBigInteger();
        BigInteger factorielle = BigInteger.valueOf(1);
        for (BigInteger i = BigInteger.valueOf(1); i.compareTo(n) <= 0; i = i.add(BigInteger.valueOf(1))) {
            factorielle = factorielle.multiply(i);
        }
        System.out.println(n + "! = " + factorielle);
    }

    public static void countdown() {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            try {
                TimeUnit.SECONDS.sleep(1);

            } catch (InterruptedException e) {
                System.out.println("Problème de gestion du temps dans la fonction countdown");
            }
        }
        System.out.println("BOUUUUUM !!!");
    }

    public static int[] carres(int[] n) {
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i] + "² = " + n[i] * n[i]);
            n[i] = n[i] * n[i];
        }
        return n;
    }

    public static void tableMultiplication() {
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.printf(" %2d ", i * j);
            }
            System.out.println();
        }
    }

    public static void division() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisissez un numérateur :");
        int numerateur = scanner.nextInt();
        System.out.println("Saisissez un dénominateur :");
        int denominateur = scanner.nextInt();
        while (denominateur == 0) {
            System.out.println("Le dénominateur doit être non nul !");
            denominateur = scanner.nextInt();
        }
        System.out.printf("La division entière de %d par %d vaud %d\n", numerateur, denominateur,
                numerateur / denominateur);
    }

    public static void regle() {
        Scanner scanner = new Scanner(System.in);
        int longueur;
        do {
            System.out.println("Saisissez une valeur entière positive");
            longueur = scanner.nextInt();
        } while (longueur <= 0);
        for (int i = 0; i <= longueur; i++) {
            if (i % 10 == 0) {
                System.out.print("|");
            } else {
                System.out.print("-");
            }
        }
    }

    public static void nombrePremier() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisissez un nombre entier positif");
        int n = scanner.nextInt();
        while (n <= 0) {
            System.out.println("Le nombre saisi doit être strictement positif !");
            n = scanner.nextInt();
        }
        // On regarde si c'est un nombre entier
        for (int i = 2; i < Math.sqrt(n) + 1; i++) {
            if (n % i == 0) {
                System.out.println("Le nombre saisi n'est pas premier.");
                return;
            }
        }
        System.out.println("Le nombre saisi est premier.");
    }

    public static void initialisationTableau() {
        int[] tableau = new int[20];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Saisir un entier");
            int entier = scanner.nextInt();
            tableau[i] = entier;
        }
        int min = tableau[0];
        int max = tableau[0];
        int somme = 0;
        System.out.print("Les éléments d'indice paire sont : ");
        for (int i = 0; i < tableau.length; i++) {
            if (min > tableau[i]) {
                min = tableau[i];
            }
            if (max < tableau[i]) {
                max = tableau[i];
            }
            somme += tableau[i];
            if (i % 2 == 0) {
                System.out.print(tableau[i]);
                if (i < tableau.length - 4) {
                    System.out.print(", ");
                } else if (i < tableau.length - 2) {
                    System.out.print(" et ");
                } else {
                    System.out.println(".");
                }
            }
        }
        System.out.println("Le minimum de ce tableau est " + min);
        System.out.println("Le maximum de ce tableau est " + max);
        System.out.println("La somme des éléments de ce tableau est " + somme);
    }

    public static void inverseTableau(int[] tableau) {
        for (int i = 0; i < tableau.length / 2; i++) {
            int mem = tableau[i];
            tableau[i] = tableau[tableau.length - i - 1];
            tableau[tableau.length - i - 1] = mem;
        }
    }

}