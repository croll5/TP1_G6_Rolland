import java.util.Scanner;

public class Main {
    /**
     * Fonction main, qui demande à l'utilisateur des nombres et les affiche
     * 
     * @param args : inutilisé
     */
    public static void main(String[] args) {
        /*
         * Scanner scanner = new Scanner(System.in);
         * System.out.println("Bonjour, quel est ton prénom ?");
         * String prenom = scanner.nextLine();
         * System.out.println("Bonjour " + prenom + " !");
         */
        paveDroit();
    }

    /**
     * Fonction somme, qui demande à l'utilisateur deux entiers et affiche leur
     * somme
     */
    public static void somme() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir le premier entier");
        int deuxiemeEntier = scanner.nextInt();
        System.out.println("Veuillez saisir le deuxième entier");
        int premierEntier = scanner.nextInt();
        int somme = premierEntier + deuxiemeEntier;
        System.out.println("La somme de " + premierEntier + " avec " + deuxiemeEntier +
                " est egale a " + somme);

    }

    /**
     * Fonction qui calcule la division de deux nombres
     */
    public static void division() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir le premier entier");
        int deuxiemeEntier = scanner.nextInt();
        System.out.println("Veuillez saisir le deuxième entier");
        int premierEntier = scanner.nextInt();
        int somme = premierEntier / deuxiemeEntier;
        System.out.println("La division entière de " + premierEntier + " par " + deuxiemeEntier +
                " est egale a " + somme);
    }

    public static void paveDroit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Avez-vous un pavé droit mesurable sous les yeux");
        if (scanner.nextLine().equals("non")) {
            return;
        }
        System.out.println("Veuillez saisir la longueur");
        int longueur = scanner.nextInt();
        System.out.println("Veuillez saisir la largeur");
        int largeur = scanner.nextInt();
        System.out.println("Veuillez saisir la hauteur");
        int hauteur = scanner.nextInt();
        int volume = longueur * largeur * hauteur;
        System.out.println("Le pavé droit que vous avez indiqué a un volume de " + volume);
    }
}