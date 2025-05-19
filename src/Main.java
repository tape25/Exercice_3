import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int totalMots = 0;
        try {
            File fichier = new File("TestExercice3.txt");
            Scanner scanner = new Scanner(fichier);

            while (scanner.hasNextLine()) {
                String ligne = scanner.nextLine();
                String[] mots = ligne.split(" ");
                totalMots += mots.length;
            }

            scanner.close();
            System.out.println("Nombre total de mots : " + totalMots);
        } catch (FileNotFoundException e) {
            System.out.println("Fichier introuvable.");
        }
    }
}
