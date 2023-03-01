/**
 *  Exercice 3 : Itérer Sur List En Utilisant Des Expressions Lambda
 * Instructions
 * Remplacez le code ci-dessous et parcourez List en utilisant des expressions lambda, en utilisant la méthode forEach(),
 * qui peut parcourir tous les objets et peut appliquer tout ce que vous demandez en utilisant le code lambda.
 *
 *
 *
 * JAVA
 * //Prior Java 8 :
 * List features = Arrays.asList("Lambdas", "Default Method", "Stream API",
 *                               "Date and Time API");
 * for (String feature : features) {
 *    System.out.println(feature);
 * }
 */

package exercice3;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");

        // Utilisation de forEach() avec une expression lambda en appelant une méthode séparée
        iterateList(features);
    }

    private static void iterateList(List<String> list) {
        list.forEach(feature -> System.out.println(feature));
    }
}
