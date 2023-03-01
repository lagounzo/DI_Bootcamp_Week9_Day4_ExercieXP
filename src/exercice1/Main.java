/**
 *  Exercice 1 : Parcours Des Éléments D'une Collection
 * Instructions
 * Itérer les éléments de la liste de tableaux en utilisant la méthode forEach(),
 *
 * Utilisez l'expression lambda pour imprimer les éléments.
 */

package exercice1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<int[]> list = new ArrayList<>();
        list.add(new int[]{1, 2, 3});
        list.add(new int[]{4, 5, 6});
        list.add(new int[]{7, 8, 9});

        printArrays(list);
    }

    public static void printArrays(ArrayList<int[]> list) {
        list.forEach(arr -> {
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        });
    }
}
