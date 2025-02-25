import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Utilisateur> utilisateurs = new ArrayList<>();
    private static Utilisateur utilisateurDefaut = new Utilisateur("Vessime", "Yohann", 18, "Ivoirienne", "IIT", "2", "VY3", 18.5);
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            afficherMenu();
            int choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1:
                    ajouterUtilisateur();
                    break;
                case 2:
                    afficherUtilisateurs();
                    break;
                case 3:
                    afficherUtilisateurDefaut();
                    break;
                case 4:
                    System.out.println("Au revoir !");
                    return;
                default:
                    System.out.println("Choix invalide, veuillez réessayer.");
            }
        }
    }

    private static void afficherMenu() {
        System.out.println("\nMenu Principal");
        System.out.println("1. Ajouter un utilisateur");
        System.out.println("2. Afficher tous les utilisateurs");
        System.out.println("3. Afficher l'utilisateur par défaut");
        System.out.println("4. Quitter");
        System.out.print("Votre choix : ");
    }

    private static void ajouterUtilisateur() {
        System.out.print("Nom : ");
        String nom = scanner.nextLine();
        System.out.print("Prénom : ");
        String prenom = scanner.nextLine();
        System.out.print("Âge : ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nationalité : ");
        String nationalite = scanner.nextLine();
        System.out.print("Établissement : ");
        String etablissement = scanner.nextLine();
        System.out.print("Niveau d'étude : ");
        String niveauEtude = scanner.nextLine();
        System.out.print("Matricule : ");
        String matricule = scanner.nextLine();
        System.out.print("Moyenne : ");
        double moyenne = scanner.nextDouble();
        scanner.nextLine();

        Utilisateur utilisateur = new Utilisateur(nom, prenom, age, nationalite, etablissement, niveauEtude, matricule, moyenne);
        utilisateurs.add(utilisateur);
        System.out.println("Utilisateur ajouté avec succès !");
    }

    private static void afficherUtilisateurs() {
        if (utilisateurs.isEmpty()) {
            System.out.println("Aucun utilisateur à afficher.");
        } else {
            System.out.println("Liste des utilisateurs :");
            System.out.println("=======================");
            for (Utilisateur u : utilisateurs) {
                u.afficherDetails();
                System.out.println("-------------------");
            }
        }
    }

    private static void afficherUtilisateurDefaut() {
        System.out.println("Utilisateur par défaut (moi) :");
        System.out.println("=======================");
        utilisateurDefaut.afficherDetails();
        System.out.println("-------------------");
    }
}