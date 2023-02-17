package TP2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] tab1 = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println(inBinarySumInArray(tab1, 10));
        System.out.println(inBinarySumInArrayOpti(tab1, 10));
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

    public static boolean inBinarySumInArrayOpti(int[] integers, int val) {
        Set<Integer> set = new HashSet<>();
        for (int i : integers) {
            set.add(i);
        }
        for (int i : integers) {
            if (set.contains(val - i)) {
                return true;
            }
        }
        return false;
    }
}