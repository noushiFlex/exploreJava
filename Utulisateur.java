class Utilisateur {
    private String nom;
    private String prenom;
    private int age;
    private String nationalite;
    private String etablissement;
    private String niveauEtude;
    private String matricule;
    private double moyenne;

    public Utilisateur(String nom, String prenom, int age, String nationalite, String etablissement, String niveauEtude, String matricule, double moyenne) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.nationalite = nationalite;
        this.etablissement = etablissement;
        this.niveauEtude = niveauEtude;
        this.matricule = matricule;
        this.moyenne = moyenne;
    }

    public void afficherDetails() {
        System.out.println("Nom : " + nom);
        System.out.println("Prénom : " + prenom);
        System.out.println("Âge : " + age);
        System.out.println("Nationalité : " + nationalite);
        System.out.println("Établissement : " + etablissement);
        System.out.println("Niveau d'étude : " + niveauEtude);
        System.out.println("Matricule : " + matricule);
        System.out.println("Moyenne : " + moyenne);
    }
}
