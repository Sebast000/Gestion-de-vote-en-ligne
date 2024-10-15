public class Vote {
    private Candidat candidat;
    private Utilisateur utilisateur;

    public Vote(Candidat candidat, Utilisateur utilisateur) {
        this.candidat = candidat;
        this.utilisateur = utilisateur;
    }

    public Candidat getCandidat() {
        return candidat;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }
}
