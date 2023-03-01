/**
 * Exercice 2 : Implémenter Runnable En Utilisant L'expression Lambda
 * Instructions
 * Remplacement de toute la classe anonyme ci-dessous par des expressions lambda, par () -> {} bloc de code.
 *
 * Vous pouvez utiliser le type de code suivant à l'aide de lambdas :
 * (params) -> expression
 * (params) -> instruction
 * (params) -> { instructions }
 */

package exercice2;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Le thread a démarré");
    }
    
    public static void main(String[] args) {
        // Création d'un nouveau thread
        Thread thread = new Thread(new MyRunnable());

        // Démarrage du thread
        thread.start();

        // Attendre que le thread se termine
        try {
            thread.join();
        } catch (InterruptedException e) {
            System.out.println("Le thread a été interrompu");
        }

        System.out.println("Le thread a terminé");
    }
}