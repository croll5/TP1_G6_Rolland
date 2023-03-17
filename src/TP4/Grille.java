package TP4;

public class Grille {
    Case[] cases;

    public Grille() {
        cases = new Case[Jeu.BOARD_SIZE];
        for (int i = 0; i < cases.length; i++) {
            cases[i] = new Case();
        }
    }
}
