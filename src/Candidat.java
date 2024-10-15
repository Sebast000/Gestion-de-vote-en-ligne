public class Candidat {
    private String nom;
    private String parti;
    private int votes;

    public Candidat(String nom, String parti) {
        this.nom = nom;
        this.parti = parti;
        this.votes = 0;
    }

    public String getNom() {
        return nom;
    }

    public String getParti() {
        return parti;
    }

    public void ajouterVote() {
        this.votes++;
    }

    public int getVotes() {
        return votes;
    }
}
