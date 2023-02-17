package TP2;

public class Main {
    public static void main(String[] args) {

    }

    public boolean inBinarySumInArray(int[] integers, int val) {
        for (int i = 0; i < integers.length; i++) {
            for (int j = 0; j < integers.length; j++) {
                if (i != j && integers[i] + integers[j] == val) {
                    return true;
                }
            }
        }
        return false;
    }
}