public class Utilisateur {
    private String nom;
    private String id;

    public Utilisateur(String nom, String id) {
        this.nom = nom;
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public String getId() {
        return id;
    }
}
